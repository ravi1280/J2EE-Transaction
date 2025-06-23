package lk.jiat.ee.jta.servlet;

import jakarta.persistence.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.jiat.ee.jta.entity.User;

import java.io.IOException;
import java.lang.Object;
import java.util.List;



@WebServlet("/home")
public class Home extends HttpServlet {
    @PersistenceContext(unitName = "JTAPA")
    EntityManager em;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        Query query = em.createNativeQuery("select * from user");
//        List<Object[]> list = query.getResultList();
//        System.out.println(list);
//        list.forEach(li->{
//            System.out.println(li[0]+" "+li[1]+" "+li[2]);
//        });

       TypedQuery<User>  query = em.createQuery("SELECT u FROM User u", User.class);
       List<User> users = query.getResultList();
       users.forEach(user -> {
           System.out.println(user.getName()+"  "+user.getEmail());
       });

    }
}
