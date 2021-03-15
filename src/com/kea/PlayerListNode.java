package com.kea;

public class PlayerListNode {
    public Player data;
    public PlayerListNode next;
    public PlayerListNode prev; //TODO: Add functionality in LinkedList

    public PlayerListNode(Player data) {
        this(data, null, null);
    }
    public PlayerListNode(PlayerListNode next) {
        this(null, next ,null);
    }

    public PlayerListNode(Player data, PlayerListNode next, PlayerListNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public PlayerListNode() {
        
    }

}
