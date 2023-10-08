package com.Proyect1.Intro.dao;
import com.Proyect1.Intro.models.User;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;



@Repository
@Transactional
public class UsersDaoImp implements UsersDao{

@PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List getUser() {
        String query = "FROM User";
        return entityManager.createQuery(query).getResultList();

    }

    @Override
    public void delete(Long id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }
}
