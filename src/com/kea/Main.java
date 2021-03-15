package com.kea;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //mainMenu();

        JDBCWriter.connectDB();
        PlayerLinkedList list = new PlayerLinkedList();
        list.add(new Player());
        /*
        list.front = new PlayerListNode(new Player());
        list.front.data.age = 20;
        list.front.next = new PlayerListNode(new Player());
        list.front.next.data.age = 12;
        list.front.next.next = new PlayerListNode(new Player());
        list.front.next.next.data.age = 15;
        Comparator comp = new Comparator();
        list.sortByAge(comp);
        System.out.println(list.toString());
        */
        /*
        String name = "abe";
        String name2 = "bente";
        int d = name.compareToIgnoreCase(name2);
        System.out.println(d);
         */
    }
}
