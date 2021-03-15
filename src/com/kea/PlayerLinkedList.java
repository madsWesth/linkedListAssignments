package com.kea;

public class PlayerLinkedList {
    //Dummy nodes
    public PlayerListNode front;
    public PlayerListNode end;

    public PlayerLinkedList() {
        front = new PlayerListNode(new PlayerListNode(null,front),null); // initializes the dummy nodes.
        end = front.next;
        //clear();
    }


    public String toString() {
        if(front.next == end) {
            return "[]";
        } else {
            PlayerListNode current = front;
            String result = "[" + current.next.data.firstName; // fence TODO: Make a general toString? this one only displays age.
            current = current.next;
            while(current.next != end) {
                result += ", " + current.data.firstName;
                current = current.next;
            }
            result += "]";
            return  result;
        }
    }

    // Append
    public void add(Player nodeValue) {

        if(front.next == end) {
            PlayerListNode newNode = new PlayerListNode(nodeValue);
            //next
            newNode.next = end;
            front.next = newNode;
            //prev
            newNode.prev = front;
            end.prev = newNode;
        } else {
            PlayerListNode current = front;
            while(current.next != end) {
                current = current.next;
            }
            PlayerListNode newNode = new PlayerListNode(nodeValue);
            //next
            current.next = newNode;
            newNode.next = end;
            //prev
            newNode.prev = current;
            end.prev = newNode;
        }
    }

    // Insert TODO: Unnecessary?
    public void add(PlayerListNode node, int index) {

    }

    public PlayerListNode get(int index) {
        PlayerListNode current = front;
        for(int i = 0; i <= index; i++) {
            current = current.next;
        }
        return current;

    }

    public int indexOf(Player data) {
        int index = 0;
        PlayerListNode current = front;
        while(current.next != end) {
            if(current.next.data == data) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    //print list with index numbers, and remove afterwards
    public void remove(int index) {
        PlayerListNode current = front;
        if(index == 0) {
            current.next = current.next.next;
            current.next.prev = current;
        } else {
            current = get(index-1);
            current.next = current.next.next;
            current.next.prev = current;
        }
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

    public int size() {
        int count = 0;
        PlayerListNode current = front;
        while(current.next != end) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void clear() {
        front.next = end;
        end.prev = front;
    }
}
