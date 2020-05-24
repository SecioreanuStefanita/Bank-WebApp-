package models;

public class User {

    private String idUser;
    private String Nume_login;
    private String Password;
    private String Nume_complet ;
    private String Email;
    private String Adresa;
    private String Oras;
    private String Localitate;
    private String Zip;

    public User(String nume_login, String password, String nume_complet, String email, String adresa, String oras, String localitate, String zip) {
        Nume_login = nume_login;
        Password = password;
        Nume_complet = nume_complet;
        Email = email;
        Adresa = adresa;
        Oras = oras;
        Localitate = localitate;
        Zip = zip;
    }

    public String getNume_complet() {
        return Nume_complet;
    }

    public void setNume_complet(String nume_complet) {
        Nume_complet = nume_complet;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAdresa() {
        return Adresa;
    }

    public void setAdresa(String adresa) {
        Adresa = adresa;
    }

    public String getOras() {
        return Oras;
    }

    public void setOras(String oras) {
        Oras = oras;
    }

    public String getLocalitate() {
        return Localitate;
    }

    public void setLocalitate(String localitate) {
        Localitate = localitate;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        Zip = zip;
    }

    public User(String idUser, String nume_login, String password) {
        this.idUser = idUser;
        Nume_login = nume_login;
        Password = password;
    }

    public User( String nume_login, String password) {
        Nume_login = nume_login;
        Password = password;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNume_login() {
        return Nume_login;
    }

    public void setNume_login(String nume_login) {
        Nume_login = nume_login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
