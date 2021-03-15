package com.kea;

public class Team {
    private String teamName;
    private PlayerLinkedList playerList;

    public Team(String teamName) {
        this.teamName = teamName;
        this.playerList = new PlayerLinkedList();
    }

    public String getTeamName() {
        return teamName;
    }

    public PlayerLinkedList getPlayerList() {
        return playerList;
    }
}
