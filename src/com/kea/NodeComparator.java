package com.kea;

import java.util.Comparator;

public class NodeComparator {

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

    public int compareName(PlayerListNode node1, PlayerListNode node2) {
        return node1.data.firstName.compareToIgnoreCase(node2.data.firstName);
    }

}
