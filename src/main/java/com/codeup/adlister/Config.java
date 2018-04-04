package com.codeup.adlister;

public class Config {
    private String password = "codeup";
    private String user = "root";
    private String url = "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";

    public String getPassword() {
        return password;
    }

    public String getUser() {
        return user;
    }

    public String getUrl() {
        return url;
    }

    public Config() {
    }
}
