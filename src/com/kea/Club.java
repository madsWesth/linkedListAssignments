package com.kea;

import java.util.ArrayList;
import java.util.Collections;

public class Club {
    String clubName;
    static Team[] teamList = new Team[2];
    JDBCReader reader = new JDBCReader();
    JDBCWriter writer = new JDBCWriter();

    public Club(String clubName) {
        this.clubName = clubName;
        this.teamList[0] = new Team("team1");
        this.teamList[1] = new Team("team2");
    }

    public void printAllPlayers() {
        teamList[0].getPlayerList().toString();
        teamList[1].getPlayerList().toString();
    }

    public void printAllByName(String name) {
        PlayerLinkedList list = new PlayerLinkedList();
        PlayerLinkedList playerList1 = teamList[0].getPlayerList();
        PlayerLinkedList playerList2 = teamList[1].getPlayerList();
        for(int i = 0; i < playerList1.size(); i++) {
            if(playerList1.get(i).data.firstName.contains(name)) {
                list.add(playerList1.get(i).data);
            }
        }
        for(int i = 0; i < playerList2.size(); i++) {
            if(playerList2.get(i).data.firstName.contains(name)) {
                list.add(playerList2.get(i).data);
            }
        }
        list.sortByName();
        System.out.println(list.toString());
    }
}
