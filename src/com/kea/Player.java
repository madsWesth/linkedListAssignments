package com.kea;

public class Player {
    int id = -1;
    String firstName = "";
    String lastName = "";
    int age = -1;
    String team = "";
    //Team team; todo uwu

    public Player(int key, String firstName, String lastName, int age, String team) {
        this.id = key;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.team = team;
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
