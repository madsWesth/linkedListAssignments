package com.kea;

public class Club {
    String clubName;
    static Team[] teamList;

    public Club(String clubName) {
        this.clubName = clubName;
        this.teamList[0] = new Team("team1");
        this.teamList[1] = new Team("team2");
    }

}
