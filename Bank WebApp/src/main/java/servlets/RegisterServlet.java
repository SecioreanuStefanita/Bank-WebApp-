package servlets;

import models.User;
import repositories.UserRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.sql.SQLException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("register.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException {
        String userCredentials = request.getReader().readLine();
        userCredentials = URLDecoder.decode(userCredentials);
        String userName = "";
        String userPassword = "";
        String userNume_Complet = "";
        String userEmail = "";
        String userAdresa = "";
        String userOras = "";
        String userLocalitate = "";
        String userZip = "";
        System.out.println(userCredentials);

        userName = userCredentials.split("&")[0];
        userPassword = userCredentials.split("&")[1];
        userNume_Complet = userCredentials.split("&")[2];
        userEmail = userCredentials.split("&")[3];
        userAdresa = userCredentials.split("&")[4];
        userOras = userCredentials.split("&")[5];
        userLocalitate = userCredentials.split("&")[6];
        userZip = userCredentials.split("&")[7];
        System.out.println(userZip);


            userName = userName.split("=")[1];
            userPassword = userPassword.split("=")[1];
            userNume_Complet = userNume_Complet.split("=")[1];
            userEmail = userEmail.split("=")[1];
            userAdresa = userAdresa.split("=")[1];
            userOras = userOras.split("=")[1];
            userLocalitate = userLocalitate.split("=")[1];
            userZip = userZip.split("=")[1];



            System.out.println("USER NAME :  " + userName);
            System.out.println("USER PASS  :  " + userPassword);


            try {
                if (UserRepository.userLogin(userName, userPassword) == null) {
                    UserRepository.registerUserCOMPLET(new User(userName,userPassword,userNume_Complet,userEmail,userAdresa,userOras,userLocalitate,userZip));
                    request.setAttribute("nume",userName);
                    response.sendRedirect(request.getContextPath() + "/mainpagehello?userName=" + userName);
                } else {
                    response.getWriter().println("User deja existent!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


    }

}
