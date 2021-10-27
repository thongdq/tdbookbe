package td.book.tdbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import td.book.tdbook.security.AppProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
//@EnableJpaRepositories("td.book.tdbook.repository")
public class TdbookApplication {

    public static void main(String[] args) {
        SpringApplication.run(TdbookApplication.class, args);
    }

}
