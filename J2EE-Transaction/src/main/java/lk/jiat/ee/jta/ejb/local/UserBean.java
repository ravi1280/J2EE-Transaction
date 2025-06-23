package lk.jiat.ee.jta.ejb.local;

import jakarta.ejb.Local;
import jakarta.ejb.Remote;

@Local
public interface UserBean {

    boolean login(String email, String password);
    boolean register(String name,String email, String password,String contact);
}
