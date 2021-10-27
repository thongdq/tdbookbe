package td.book.tdbook.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import td.book.tdbook.model.ERole;
import td.book.tdbook.model.Role1;
import td.book.tdbook.repository.RoleRepository;

@Service
@Transactional
public class RoleServiceImp implements RoleService {

    @Autowired
    @Qualifier("RoleRepository")
    RoleRepository roleRepository;

    // @Override
    // public Optional<Role> findByName(ERole name) {
    //     //return roleRepository.findByName(name);
    //     return null;
    // }

}
