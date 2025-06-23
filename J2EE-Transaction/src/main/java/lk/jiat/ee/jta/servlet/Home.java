package lk.jiat.ee.jta.servlet;

import jakarta.ejb.EJB;
import jakarta.persistence.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.jiat.ee.jta.ejb.local.UserBean;
import lk.jiat.ee.jta.entity.User;

import java.io.IOException;
import java.lang.Object;
import java.util.List;



@WebServlet("/home")
public class Home extends HttpServlet {

    @EJB
    UserBean userBean;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        userBean.register("RavishkaIndraji","Ravii@gmail.com","12345","0718584846");

    }
}
