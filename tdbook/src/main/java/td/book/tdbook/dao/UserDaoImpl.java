package td.book.tdbook.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import td.book.tdbook.model.User;

@Repository
public class UserDaoImpl implements UserDao {

    // @PersistenceContext
    // private EntityManager entityManager;

    // @Override
    // public List<User> list() {
    //     Query query = entityManager.createQuery("FROM User");
    //     return query.getResultList();
    // }

    // @Override
    // public void save(User u) {
    //     entityManager.persist(u);
    // }

}
