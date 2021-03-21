package td.book.tdbook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class users {

    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRSTNAME", length = 100)
    private String firstName;

    @Column(name = "LASTNAME", length = 100)
    private String lastName;

    @Column(name = "EMAIL", nullable = false, length = 255)
    private String email;

    @Column(name = "PASSWORD", nullable = false, length = 100)
    private String password;
    
}
