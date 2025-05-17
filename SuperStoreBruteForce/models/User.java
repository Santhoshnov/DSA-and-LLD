package models;

public class User {
    public String name;
    public String role;
    public String password;

    public User(String name, String role, String password) {
        this.name = name;
        this.role = role;
        this.password = password;
    }
}
