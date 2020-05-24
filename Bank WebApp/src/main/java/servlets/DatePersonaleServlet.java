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

@WebServlet("/Date Personale")
public class DatePersonaleServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("userName");
        request.setAttribute("name", name);

        request.getRequestDispatcher("datePersonale.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
        String userName=request.getParameter("userName");
        String btn_submit=request.getParameter("btn_submit");
        try {


            UserRepository.UpdatePersonalInfo(request.getParameter("userName"),request.getParameter("fname"),request.getParameter("email"),request.getParameter("adr"),
                    request.getParameter("city"),request.getParameter("state"),request.getParameter("zip"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        response.sendRedirect(request.getContextPath() + "/Date Personale?userName=" + userName);


    }


}
