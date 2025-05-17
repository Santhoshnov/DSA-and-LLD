package services;

import models.*;

public class ProfileService {
    private User[] users = new User[10];
    private int userCount = 0;

    public void registerUser(String name, String role, String password) {
        if (userCount < users.length) {
            users[userCount++] = new User(name, role, password);
            System.out.println("User registered: " + name);
        } else {
            System.out.println("User limit reached.");
        }
    }
}
