package com.kea;

public class PLayerLinkedList {
    public PlayerListNode front;


    public void printList() {
        PlayerListNode current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
