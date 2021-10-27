package td.book.tdbook.controller;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import td.book.tdbook.controller.UserController;
import td.book.tdbook.model.Book;
import td.book.tdbook.model.User;
import td.book.tdbook.repository.RoleRepository;
import td.book.tdbook.service.BookService;
import td.book.tdbook.service.UserService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(UserController.class)
//@SpringBootTest
//@ContextConfiguration(classes = {UserControllerTest.class})
//@AutoConfigureMockMvc
public class UserControllerTest {

    // @TestConfiguration
    // public static class TodoServiceTest2Configuration{
    //     @Bean
    //     UserService userService(){
    //         return new UserServiceImp();
    //     }
    // }

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @MockBean
    private BookService bookService;

    @Test
    public void testFindAll() throws Exception {
        List<User> allUser = IntStream.range(0, 5)
                                .mapToObj(i -> new User("User" + i, "usermai" + i, "userpass" + i))
                                .collect(Collectors.toList());

        //given(userService.list()).willReturn(allUser);

        Mockito.when(userService.list()).thenReturn(allUser);

        mockMvc.perform(get("/users"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$", Matchers.hasSize(5)));
            //.andExpect(content().string(containsString("All users")));
    }

    @Test
    public void testFindAllBook() throws Exception {
        List<Book> allBook = IntStream.range(0, 5)
                                .mapToObj(i -> new Book(Long.valueOf(i), "title" + i, "uath" + i))
                                .collect(Collectors.toList());

        //given(userService.list()).willReturn(allUser);

        Mockito.when(bookService.findAll()).thenReturn(allBook);

        mockMvc.perform(get("/books"))
            .andExpect(status().isOk());
            //.andExpect(jsonPath("$", Matchers.hasSize(5)));
            //.andExpect(content().string(containsString("All users")));
    }


}
