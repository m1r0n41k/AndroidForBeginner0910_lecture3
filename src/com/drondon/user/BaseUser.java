package com.drondon.user;


public abstract class BaseUser implements IUser {

    private String name;
    private String login;
    private String password;

    public BaseUser(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
