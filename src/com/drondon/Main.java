package com.drondon;

import com.drondon.user.Admin;
import com.drondon.user.IUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<IUser> users = new ArrayList<IUser>();

    private static String menu = "\n\nДля работы с приложение выберите один из пунктов меню\n\n" +
            "Меню:" +
            "1: Войти в системы" +
            "0: Выход" +
            "\n";

    public static void main(String[] args) {
        users.add(new Admin(getUserProvider()));
        startApplication();
    }

    private static void startApplication() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(menu);
            System.out.print("Введите пунт меню:");
            int menuId = scanner.nextInt();
            System.out.println();
            switch (menuId) {
                case 1:
                    startLogin(scanner);
                    break;

                case 0:
                    System.out.println("Спасибо, что воспользовались нашим сервисом!");
                    return;

                default:
                    System.out.println("Пункт меню " + menuId + " не поддерживаеться!");
                    break;
            }
        }
    }

    private static void startLogin(Scanner scanner) {
        System.out.print("Введите имя пользвателя или почту: ");
        String login = scanner.nextLine();
        System.out.println();

        if (!isValidLogin(login)) {
            System.out.println("Имя пользователя должно быть больше 6 символов!");
            return;
        }

        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();
        System.out.println();

        if (!isValidPassword(password)) {
            System.out.println("Пароль должен быть больше 6 символов!");
            return;
        }

        if (!validateUser(login, password, scanner)) {
            return;
        }

    }

    private static boolean validateUser(String login, String password, Scanner scanner) {
        return false;
    }

    private static boolean isValidLogin(String login) {
        return login.length() >= 6;
    }

    private static boolean isValidPassword(String password) {
        return password.length() >= 6;
    }

    public static Admin.UsersProvider getUserProvider() {
        return new Admin.UsersProvider() {
            @Override
            public List<IUser> getUsers() {
                return users;
            }
        };
    }
}