package com.kea;

public class PlayerLinkedList {
    //Dummy nodes
    public PlayerListNode front;
    public PlayerListNode end;
    private Comparator comparator = new Comparator();

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
        //Keep running while next is not null
        //Run Comparator.compareType for current node to next
        // int compared = compareType(current, current.next)
        // switch (compared) case x: move bla bla
        PlayerListNode current = front.next; //TODO: Reminder that current is front.next here unlike other places
        boolean hasSwapped = true;
        while(hasSwapped) {
            hasSwapped = false;
            while(current.next != end) { // checks if there is anything to swap with
                int compare = comparator.compareAge(current, current.next); // compares first element to second element

                switch (compare) {
                    case 1: // swap
                        PlayerListNode first = current; // the first element
                        PlayerListNode second = current.next; // the second element

                        PlayerListNode before = current.prev;
                        PlayerListNode after = current.next.next;
                        // Next setup
                        second.next = first;
                        current.next = after;
                        before.next = second;

                        // Prev setup

                        current = current.next;
                        hasSwapped = true;
                        break;
                    case 0:
                        System.out.println(compare);
                        current = current.next;
                        break;
                    case -1:
                        System.out.println(compare);
                        current = current.next;
                        break;
                    default:
                        break;
                }
            }
            System.out.println(this.toString());
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

    public void add(String nextLine) {
    }
}
