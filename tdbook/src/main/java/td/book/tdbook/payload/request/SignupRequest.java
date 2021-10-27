package td.book.tdbook.payload.request;

import java.util.Set;

import lombok.Data;

@Data
public class SignupRequest {

    private String username;

    private String email;

    private Set<String> role;

    private String password;
    
}
