package com.kea;

import java.util.Collections;


public class Main {

    public static void main(String[] args) {
	// write your code here
        //initialize at start
        PlayerLinkedList teamList1 = new PlayerLinkedList();
        PlayerLinkedList teamList2 = new PlayerLinkedList();

        Team team1 = new Team("Team1", teamList1);
        Team team2 = new Team("Team2", teamList2);


        //mainMenu();

        //JDBCWriter.connectDB();
        PlayerLinkedList list = new PlayerLinkedList();
        Player mads = new Player();
        mads.firstName = "mads";
        mads.age = 23;
        Player frederik = new Player();
        frederik.firstName = "frederik";
        frederik.age = 22;
        Player jimmy = new Player();
        jimmy.firstName = "jimmy";
        jimmy.age = 29;
        Player kasper = new Player();
        kasper.firstName = "kasper";
        kasper.age = 25;

        list.add(mads);
        list.add(jimmy);
        list.add(frederik);
        list.add(kasper);

        //System.out.println(list.get(3).data.firstName);
        //list.remove(3);
        System.out.println(list.toString());
        //System.out.println(list.size());
        //JDBCReader jdbcReader = new JDBCReader();
        //jdbcReader.printTableFromDB("members");
        list.sortByAge();
        System.out.println(list.toString());

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
