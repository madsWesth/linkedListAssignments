package com.kea;

public class Player {
    String firstName = "";
    String lastName = "";
    int age = -1;
    Team team;

    public Player(String firstName, String lastName, int age, String team) {
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
        this.team.addPlayer(this);
    }

    public Player() {       //todo remove?

    }

    public String toString() {
        return firstName + " " + lastName  + " | " +
                "age: " + age + " | " + team.getTeamName() + "\n";
    }

}
