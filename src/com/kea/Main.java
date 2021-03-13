package com.kea;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //mainMenu();
        PlayerLinkedList list = new PlayerLinkedList();
        list.front = new PlayerListNode();
        list.front.data = 5;
        list.front.next = new PlayerListNode();
        list.front.next.data = 12;
        System.out.println(list);
    }
}
