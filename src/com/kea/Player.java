package com.kea;

public class Player {
    int id = -1;
    String firstName = "";
    String lastName = "";
    int age = -1;
    Team team;
    //Team team; todo uwu

    public Player(int key, String firstName, String lastName, int age, String team) {
        this.id = key;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        switch (team) {
            case "1st":
                this.team = Club.teamList[0];
                break;
            case "2nd":
                this.team = Club.teamList[1];
                break;
        }
        this.team.addPlayer(this);  //hmmmm
    }

    public Player() {       //todo remove?

    }

    public String toString() {
        return firstName + " " + lastName  + "\n" +
                "age: " + age + "\n" +
                team.getTeamName();
    }

}
