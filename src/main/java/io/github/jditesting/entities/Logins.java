package io.github.jditesting.entities;

public class Logins {
    public String name, password;
    public Logins() { }
    public Logins(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public Logins setName(String name) {
        this.name = name;
        return this;
    }
    public Logins setPassword(String password) {
        this.password = password;
        return this;
    }
}