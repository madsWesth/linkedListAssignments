package com.kea;

import java.util.Comparator;

public class NodeComparator implements Comparator<Player> {

    public int compareAge(PlayerListNode node1, PlayerListNode node2) {
        int compare = 0;
        if(node1.data.age > node2.data.age) {
            compare = 1;
        } else if(node1.data.age < node2.data.age) {
            compare = -1;
        } else {
            compare = 0;
        }
        return compare;
    }

    public int compare(Player player1, Player player2) {
        return player1.firstName.compareToIgnoreCase(player2.firstName);
    }

}
