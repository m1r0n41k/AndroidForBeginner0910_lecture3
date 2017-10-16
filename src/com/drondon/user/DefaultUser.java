package com.drondon.user;

public class DefaultUser implements IUser{

    String defaultName = "Moderator";

    @Override
    public String getName() {
        return defaultName;
    }

    @Override
    public void setName(String name) {
        //You can't change name
    }

    @Override
    public String getLogin() {
        return "moderator@i.com";
    }

    @Override
    public String getPassword() {
        return "0000";
    }
}
