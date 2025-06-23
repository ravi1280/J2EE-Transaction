package lk.jiat.ee.jta.ejb;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lk.jiat.ee.jta.ejb.local.UserBean;
import lk.jiat.ee.jta.entity.User;
import org.hibernate.Session;

@Stateless
public class UserBeanImpl implements UserBean {
    @PersistenceContext(name = "JTAPA")
    private EntityManager em;

    @Override
    public boolean login(String email, String password) {
        return false;
    }

    @Override
    public boolean register(String name, String email, String password, String contact) {
        Session  session =em.unwrap(Session.class);
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPass(password);
        user.setContact(contact);

        session.save(user);

//        em.persist(user);

        return true;
    }
}
