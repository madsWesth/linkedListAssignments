package com.kea;

public class Club {
    String clubName;
    static Team[] teamList;

    public Club(String clubName) {
        this.clubName = clubName;
    //    this.teamList[0] = new Team("team1");
    //    this.teamList[1] = new Team("team2");
    }

    public void printAllPlayers() {
        teamList[0].getPlayerList().toString();
        teamList[1].getPlayerList().toString();
    }

    public void printAllByName() {
        
    }

}
