package com.kea;

public class PlayerListNode {
    public Player data;
    public PlayerListNode next;
    public PlayerListNode prev; //TODO: Add functionality in LinkedList

    public PlayerListNode(Player data) {
        this.data = data;
    }
}
