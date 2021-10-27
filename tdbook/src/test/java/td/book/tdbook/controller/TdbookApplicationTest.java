package td.book.tdbook.controller;

import static org.mockito.ArgumentMatchers.isNotNull;
import static org.mockito.ArgumentMatchers.notNull;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import td.book.tdbook.controller.UserController;

//@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TdbookApplicationTest {

    @Autowired
    UserController userController;

    @Test
    public void contextLoad() {
        Assertions.assertThat(userController).isNot(null);
    }
}
