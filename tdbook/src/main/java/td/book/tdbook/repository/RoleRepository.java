package td.book.tdbook.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import td.book.tdbook.model.ERole;
import td.book.tdbook.model.TdBookRole;

@Repository
@Component("RoleRepository")
public interface RoleRepository extends JpaRepository<TdBookRole, Long> {

    //Optional<Role> findByName(ERole name);

}
