package com.Order.test;

public class Person {
    private String username;
    private String userpassword;
    public Person() {
    }

    public Person(String username, String userpassword) {
        this.username = username;
        this.userpassword = userpassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", userpassword='" + userpassword + '\'' +
                '}';
    }
}
