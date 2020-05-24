package servlets;


import models.Account;
import repositories.AccountRepository;
import repositories.UserRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/AdaugareCont")
public class AdaugareContServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("userName");
        request.setAttribute("name", name);

        request.getRequestDispatcher("adaugareCont.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
        String userName=request.getParameter("userName");
        String btn_submit=request.getParameter("btn_submit");
        try {

            AccountRepository.adaugareContDupaNume_login(userName,request.getParameter("amount"),request.getParameter("valuta"),request.getParameter("nrCard"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        response.sendRedirect(request.getContextPath() + "/AdaugareCont?userName=" + userName);


    }


}