package com.kea;

public class Team {
    private String teamName;
    private PlayerLinkedList playerList;

    public Team(String teamName) {
        this.teamName = teamName;
        this.playerList = new PlayerLinkedList();
    }

    public void addPlayer(String firstName, String lastName, int age, String team) {
        Player player = new Player(firstName, lastName, age, team);
        playerList.add(player);
    }

    public void addPlayer(Player player) {
        playerList.add(player);
    }

    public void removePlayer(int index) {
        //print list of players so user can choose?
        playerList.remove(index);

    }

    public String getTeamName() {
        return teamName;
    }

    public PlayerLinkedList getPlayerList() {
        return playerList;
    }
}
