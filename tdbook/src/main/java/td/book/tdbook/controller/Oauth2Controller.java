package td.book.tdbook.controller;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import td.book.tdbook.payload.request.Oauth2Jwt;
import td.book.tdbook.payload.response.JwtResponse;
import td.book.tdbook.security.oauth.UserPrincipal;
import td.book.tdbook.security.services.UserDetailsImpl;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/custom")
public class Oauth2Controller {

    @PostMapping("/oauth2")
    public ResponseEntity<?> oauth2Authenticate(@RequestBody Oauth2Jwt oauth2Jwt) {
        UserDetailsImpl userDetails = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<String> roles = userDetails.getAuthorities().stream()
                                .map(item -> item.getAuthority())
                                .collect(Collectors.toList());
        return ResponseEntity.ok(new JwtResponse(null,
                                                 userDetails.getId(),
                                                 userDetails.getUsername(),
                                                 userDetails.getEmail(),
                                                 roles));
    }

}
