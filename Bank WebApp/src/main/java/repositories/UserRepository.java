package repositories;

import models.Account;
import models.User;
import utils.DbConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRepository {



    public static String getUserByUsername(String Username) throws SQLException {
        Statement statement = DbConnection.getConnection().createStatement();
        String sql = "SELECT * FROM user WHERE Nume_login like '" + Username + "'";
        ResultSet resultSet=statement.executeQuery(sql);

        if(resultSet.next()){
            String UserId=resultSet.getString("idUser");
            return UserId;
        }
        return null;
    }


    public static void registerUser(User user) throws SQLException {
        String sql = "INSERT INTO user(nume_login, password) VALUES(?, ?)";
        PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(sql);
        preparedStatement.setString(1, user.getNume_login());
        preparedStatement.setString(2, user.getPassword());

        preparedStatement.execute();
    }

    public static void registerUserCOMPLET(User user) throws SQLException {
        String sql = "INSERT INTO user(nume_login, password, Nume_complet, Email, Adresa, Oras, Localitate, Zip) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(sql);
        preparedStatement.setString(1, user.getNume_login());
        preparedStatement.setString(2, user.getPassword());
        preparedStatement.setString(3,user.getNume_complet());
        preparedStatement.setString(4, user.getEmail());
        preparedStatement.setString(5, user.getAdresa());
        preparedStatement.setString(6,user.getOras());
        preparedStatement.setString(7, user.getLocalitate());
        preparedStatement.setString(8, user.getZip());

        preparedStatement.execute();
    }
    public static String getNume_completByUsername(String username)throws SQLException{
        Statement statement = DbConnection.getConnection().createStatement();
        String sql = "SELECT Nume_complet FROM user WHERE Nume_login like '" + username + "'";
        ResultSet resultSet=statement.executeQuery(sql);

        if(resultSet.next()){
            String Nume_complet=resultSet.getString("Nume_complet");
            return Nume_complet;
        }
        return null;
    }
    public static String getEmailByUsername(String username)throws SQLException{
        Statement statement = DbConnection.getConnection().createStatement();
        String sql = "SELECT Email FROM user WHERE Nume_login  like '" + username + "'";
        ResultSet resultSet=statement.executeQuery(sql);

        if(resultSet.next()){
            String Email=resultSet.getString("Email");
            return Email;
        }
        return null;
    }
    public static String getAdresaByUsername(String username)throws SQLException{
        Statement statement = DbConnection.getConnection().createStatement();
        String sql = "SELECT Adresa FROM user WHERE Nume_login like '" + username + "'";
        ResultSet resultSet=statement.executeQuery(sql);

        if(resultSet.next()){
            String Adresa=resultSet.getString("Adresa");
            return Adresa;
        }
        return null;
    }
    public static String getOrasByUsername(String username)throws SQLException{
        Statement statement = DbConnection.getConnection().createStatement();
        String sql = "SELECT Oras FROM user WHERE Nume_login like '" + username + "'";
        ResultSet resultSet=statement.executeQuery(sql);

        if(resultSet.next()){
            String Oras=resultSet.getString("Oras");
            return Oras;
        }
        return null;
    }
    public static String getLocalitateByUsername(String username)throws SQLException{
        Statement statement = DbConnection.getConnection().createStatement();
        String sql = "SELECT Localitate FROM user WHERE Nume_login like '" + username + "'";
        ResultSet resultSet=statement.executeQuery(sql);

        if(resultSet.next()){
            String Localitate=resultSet.getString("Localitate");
            return Localitate;
        }
        return null;
    }
    public static String getZipByUsername(String username)throws SQLException{
        Statement statement = DbConnection.getConnection().createStatement();
        String sql = "SELECT Zip FROM user WHERE Nume_login like '" + username + "'";
        ResultSet resultSet=statement.executeQuery(sql);

        if(resultSet.next()){
            String Zip=resultSet.getString("Zip");
            return Zip;
        }
        return null;
    }


    public static void UpdatePersonalInfo(String Nume_login, String Nume_complet,String Email,String Adresa,String Oras,String Localitate,String Zip) throws SQLException {
        Statement statement = DbConnection.getConnection().createStatement();
        String sql = "UPDATE user SET `Nume_complet` = '"+Nume_complet+"', `Email` = '"+Email+"', `Adresa` = '"+Adresa+"', `Oras` = '"+Oras+"', `Localitate` = '"+Localitate+"', `Zip` = '"+Zip+"' WHERE (`Nume_login` = '"+Nume_login+"');";
        statement.execute(sql);
        System.out.println(Nume_complet+Email+Adresa+Oras+Localitate+Zip);
    }




    public static User findByNume_login(String  Nume_login) throws SQLException {

            Statement statement = DbConnection.getConnection().createStatement();
            String sql = "SELECT * FROM user WHERE Nume_login like '" + Nume_login + "'";

            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                User user = new User(
                        resultSet.getString("idUser"),
                        resultSet.getString("password"),
                        resultSet.getString("Nume_login")
                );
                return user;
            } else
                return null;
        }


    public static User userLogin(String userName, String userPassword) throws SQLException {

        Statement statement = DbConnection.getConnection().createStatement();
        String sql = "SELECT * FROM user WHERE Nume_login like '" + userName + "'" + " and password like '" + userPassword + "'";

        ResultSet resultSet = statement.executeQuery(sql);

        if (resultSet.next()) {
            User user = new User(
                    resultSet.getString("idUser"),
                    resultSet.getString("password"),
                    resultSet.getString("Nume_login")
            );
            return user;
        } else
            return null;

    }
}
