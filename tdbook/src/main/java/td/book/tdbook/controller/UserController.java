package td.book.tdbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import td.book.tdbook.model.User;
import td.book.tdbook.service.BookService;
import td.book.tdbook.service.UserService;

//@Slf4j
@CrossOrigin(origins = "http://localhost:4200")
//indicates that the data returned by each method will be written straight into the response body instead of rendering a template.
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    // @Autowired
    // BookService bookService;

    // @GetMapping
    // public String getAllUsers() {
    //     return "All users";
    // }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.list();
    }

    @PostMapping
    public void newUser(@RequestBody User newUser) {
        userService.save(newUser);
    }
    
}
