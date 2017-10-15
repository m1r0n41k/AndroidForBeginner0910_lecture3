package com.drondon.user;

import java.util.List;

public class Admin extends BaseUser {

    private UsersProvider usersProvider;

    public Admin(UsersProvider usersProvider) {
        super("admin", "qwerty");

        this.usersProvider = usersProvider;
    }

    public void printAllUsers() {

    }

    public void removeUser(IUser user) {

    }


    public interface UsersProvider {
        List<IUser> getUsers();
    }
}
