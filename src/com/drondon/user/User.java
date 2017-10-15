package com.drondon.user;

import com.drondon.task.ITask;

import java.util.ArrayList;
import java.util.List;

public class User extends BaseUser {

    private List<ITask> tasks = new ArrayList<>();

    public User(String login, String password) {
        super(login, password);
    }

    public void printAllTasks() {

    }

    public void addTask(ITask task) {

    }

    public void removeTask(ITask task) {

    }

    public ITask getTask(int id) {
        return tasks.get(id);
    }

}
