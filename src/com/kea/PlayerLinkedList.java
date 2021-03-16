package com.kea;

public class PlayerLinkedList {
    //Dummy nodes
    public PlayerListNode front;
    public PlayerListNode end;
    private NodeComparator comparator = new NodeComparator();

    public PlayerLinkedList() {
        front = new PlayerListNode(new PlayerListNode(null,front),null); // initializes the dummy nodes.
        end = front.next;
        //clear();
    }

    public String toString() {
        if(front.next == end) {
            return "[]";
        } else {
            int count = 1;
            PlayerListNode current = front;
            String result = "[\n" + count + ".\n" + current.next.data.toString(); // fence
            current = current.next;
            count++;
            while(current.next != end) {
                result += "\n" + count + ".\n" + current.next.data.toString();
                current = current.next;
                count++;
            }
            result += "\n]";
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

    public void sortByAge() {
        PlayerListNode current = front.next; //TODO: Reminder that current is front.next here unlike other places
            while(current != end) { // checks if there is anything to swap with in the previous element, at "end" there is nothing to compare.
                int compare = 0; // don't swap
                if(current!= front.next) { // doesn't check for first element
                    compare = comparator.compareAge(current.prev, current); // compares first element to second element
                }

                switch (compare) {
                    case 1: // swap
                        //next
                        current.prev.prev.next = current; // 2 positions prior's next is now current
                        current.prev.next = current.next; //
                        current.next = current.prev; // current next swap

                        //prev
                        current.next.next.prev = current.next;
                        current.prev = current.prev.prev; //
                        current.next.prev = current;

                        // don't go next because we want to keep checking the same element (the one that was smaller)
                        break;
                    case 0:
                        current = current.next;
                        break;
                    case -1:
                        current = current.next;
                        break;
                    default:
                        break;
                }
                System.out.println("Compare: " + compare);
            }

            System.out.println(this.toString());
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
