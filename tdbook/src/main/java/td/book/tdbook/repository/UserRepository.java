package td.book.tdbook.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import td.book.tdbook.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //JpaRepository extend PagingAndSortingRepository which in turn extends CrudRepository interface

    Optional<User> findByuserName(String userName);

    Optional<User> findByEmail(String email);

    Boolean existsByuserName(String userName);

    Boolean existsByEmail(String email);

}
