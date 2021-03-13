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

    // Append
    public void add(Player nodeValue) {
        if(front == null) {
            front = new PlayerListNode(nodeValue);
        } else {
            PlayerListNode current = front;
            while(current.next != null) {
                current = current.next;
            }
            current.next = new PlayerListNode(nodeValue);
        }
    }

    // Insert
    public void add(PlayerListNode node, int index) {
        
    }
}
