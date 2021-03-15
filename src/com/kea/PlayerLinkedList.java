package com.kea;

import javax.swing.plaf.InsetsUIResource;

public class PlayerLinkedList {
    public PlayerListNode front;
    public PlayerListNode back;

    public PlayerLinkedList() {
        front.next = new PlayerListNode(); // initializes the dummy nodes.
        back.next = new PlayerListNode();
        clear(); // sets their pointers correctly.
    }


    public String toString() {
        if(front == null) {
            return "[]";
        } else {
            String result = "[" + front.data.age; // fence TODO: Make a general toString? this one only displays age.
            PlayerListNode current = front;
            while(current.next != null) {
                result += ", " + current.data.age;
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

    public PlayerListNode get(int index) {
return null;
    }

    public void sortByAge(Comparator comparator) {
        //Keep running while next is not null
        //Run Comparator.compareType for current node to next
        // int compared = compareType(current, current.next)
        // switch (compared) case x: move bla bla
        PlayerListNode current = front;
        //TODO: need to check for list size 2, in which case current.next.next will always be null
        while(current.next != null) { // checks if there is anything to swap with
            int compare = comparator.compareAge(current, current.next);
            if(current.next.next != null) { // checks if there is a third link

            }

            switch (compare) {
                case 1: // swap
                    PlayerListNode cont = current;
                    PlayerListNode next = current.next; // saves middle part that is swapped left
                    current.next = current.next.next; // moves reference to next node
                    next.next = current; // moves next reference to next node
                    front.next = next;
                    break;
                case 0:
                    System.out.println(compare);
                    break;
                case -1:
                    System.out.println(compare);
                    current = current.next;
                    break;
                default:
                    break;
            }
        }
    }

    public void clear() {
        front.next = back;
        back.prev = front;
    }
}
