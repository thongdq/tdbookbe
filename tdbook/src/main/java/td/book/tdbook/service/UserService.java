package td.book.tdbook.service;

import java.util.List;
import java.util.Optional;

import td.book.tdbook.model.User;

public interface UserService {

    public List<User> list();
    public void save(User u);
    public Optional<User> findByuserName(String userName);
    public Optional<User> findByEmail(String email);
    Boolean existsByuserName(String userName);
    Boolean existsByEmail(String email);


}
