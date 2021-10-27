package td.book.tdbook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import td.book.tdbook.model.User;
import td.book.tdbook.repository.UserRepository;

@Service
@Transactional
public class UserServiceImp implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }

    @Override
    public void save(User u) {
        userRepository.save(u);
    }

    @Override
    public Optional<User> findByuserName(String userName) {
        return userRepository.findByuserName(userName);
    }

    @Override
    public Boolean existsByuserName(String userName) {
        return userRepository.existsByuserName(userName);
    }

    @Override
    public Boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

}
