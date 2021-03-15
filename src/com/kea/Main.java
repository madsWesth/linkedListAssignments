package com.kea;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //initialize at start
        Club club = new Club("Boldklubben");

        //mainMenu();

        //JDBCWriter.connectDB();
        PlayerLinkedList list = new PlayerLinkedList();
        Player mads = new Player();
        mads.firstName = "mads";
        Player frederik = new Player();
        frederik.firstName = "frederik";
        Player jimmy = new Player();
        jimmy.firstName = "jimmy";
        Player kasper = new Player();
        kasper.firstName = "kasper";
        list.add(mads);
        list.add(frederik);
        list.add(jimmy);
        list.add(kasper);
        System.out.println(list.get(3).data.firstName);
        //list.remove(3);
        System.out.println(list.toString());
        System.out.println(list.size());

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
