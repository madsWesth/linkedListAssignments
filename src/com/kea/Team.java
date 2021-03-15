package com.kea;

public class Team {
    private String teamName;
    private PlayerLinkedList playerList;

    public Team(String teamName, PlayerLinkedList playerList) {
        this.teamName = teamName;
        this.playerList = playerList;
    }

    public String getTeamName() {
        return teamName;
    }
}
