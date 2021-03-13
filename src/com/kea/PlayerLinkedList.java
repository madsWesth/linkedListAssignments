package com.kea;

import javax.swing.plaf.InsetsUIResource;

public class PlayerLinkedList {
    public PlayerListNode front;

    public String toString() {
        if(front == null) {
            return "[]";
        } else {
            String result = "[" + front.data; // fence
            PlayerListNode current = front;
            while(current.next != null) {
                result += ", " + current.next.data;
                current = current.next;
            }
            result += "]";
            return  result;
        }
    }

    public void add(PlayerListNode node) {
        
    }
}
