package com.kea;

public class Player {
    String firstName = "";
    String lastName = "";
    int age = -1;
    //Team team; todo uwu

    public Player(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        //this.teamName = teamName
    }

    public Player() {

    }

    public String toString() {
        return firstName + " " + lastName  + "\n" +
                "age: " + age + "\n" +
                "--teamName here--";
        //todo add teamName team.getName
    }

}
