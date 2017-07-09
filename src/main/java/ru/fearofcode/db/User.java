package ru.fearofcode.db;

/**
 * Created by Max on 7/9/2017.
 */
public class User {
    private int id;

    private String name;
    private String password;
    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{id: " + id
                + ", name: " + name
                + ", password: " + password
                + "}";
    }

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
