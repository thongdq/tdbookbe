package td.book.tdbook.controller;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import td.book.tdbook.model.ERole;
import td.book.tdbook.model.Role1;
import td.book.tdbook.model.User;
import td.book.tdbook.model.UserRole;
import td.book.tdbook.payload.request.LoginRequest;
import td.book.tdbook.payload.request.SignupRequest;
import td.book.tdbook.payload.response.JwtResponse;
import td.book.tdbook.payload.response.MessageResponse;
import td.book.tdbook.security.jwt.JwtUtils;
import td.book.tdbook.security.services.UserDetailsImpl;
import td.book.tdbook.service.RoleService;
import td.book.tdbook.service.UserRoleService;
import td.book.tdbook.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    UserService uservice;

    // @Autowired
    // RoleService roleService;

    // @Autowired
    // UserRoleService userRoleService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtUtils jwtUtils;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        // Authentication authentication = authenticationManager.authenticate(
        //     new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

        // SecurityContextHolder.getContext().setAuthentication(authentication);
        // String jwt = jwtUtils.generateJwtToken(authentication);

        // UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        // List<String> roles = userDetails.getAuthorities().stream()
        //                         .map(item -> item.getAuthority())
        //                         .collect(Collectors.toList());

        // return ResponseEntity.ok(new JwtResponse(jwt,
        //                                          userDetails.getId(),
        //                                          userDetails.getUsername(),
        //                                          userDetails.getEmail(),
        //                                          roles));
        return null;
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) throws Exception {
        // if(uservice.existsByuserName(signUpRequest.getUsername())) {
        //     return ResponseEntity
        //             .badRequest()
        //             .body(new MessageResponse("Error: Username is already taken!"));
        // }

        // if (uservice.existsByEmail(signUpRequest.getEmail())) {
        //     return ResponseEntity
        //             .badRequest()
        //             .body(new MessageResponse("Error: Email is already in use!"));
        // }

        // // Create new user's account
        // User user = new User(signUpRequest.getUsername(),
        //                         signUpRequest.getEmail(),
        //                         passwordEncoder.encode(signUpRequest.getPassword()));

        // UserRole userRoleModel;

        // Set<String> strRoles = signUpRequest.getRole();
        // Set<Role> roles = new HashSet<>();

        // if(strRoles == null) {
        //     Role userRole = roleService.findByName(ERole.ROLE_USER)
        //                     .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
        //     roles.add(userRole);
        // } else {
        //     strRoles.forEach(role -> {
        //         switch(role) {
        //             case "admin":
        //                 Role adminRole = roleService.findByName(ERole.ROLE_ADMIN)
        //                                  .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
        //                 roles.add(adminRole);
        //                 break;
        //             case "mod":
        //                 Role modRole = roleService.findByName(ERole.ROLE_MODERATOR)
        //                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
        //                 roles.add(modRole);

        //                 break;
        //             default:
        //                 Role userRole = roleService.findByName(ERole.ROLE_USER)
        //                                 .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
        //                 roles.add(userRole);
        //         }
        //     });
        // }

        // uservice.save(user);

        // Iterator<Role> iterator = roles.iterator();
        // while(iterator.hasNext()) {

        //     Role role = iterator.next();

        //     userRoleModel = new UserRole(user, role, new Date());
        //     userRoleService.save(userRoleModel);
        // }

        // return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
        return null;
    }

}
