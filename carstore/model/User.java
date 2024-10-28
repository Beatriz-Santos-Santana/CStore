package br.com.carstore.model;

public class User {

    private String username;
    private String password;

    public User(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
