package com.kea;

import java.util.Scanner;

public class Menu {
    Club club = new Club("klubben");

    public static void mainMenu(){
        String[] listMenu = new String[]{"List all Members", "Search Menu", "Manage Team Menu", "Exit"};
        GenericMenu startMenu = new GenericMenu("- Football Club -\n- Main Menu -", "Choose an option: ", listMenu);

        boolean run = true;
        while (run) {
            startMenu.printMenu();
            switch (startMenu.readChoice()) {
                case 1:

                    break;
                case 2:
                    System.out.println("Search Menu");
                    searchMenu();
                    break;
                case 3:
                    System.out.print("What team do you want to manage?: ");
                    Scanner sc = new Scanner(System.in);
                    int team = sc.nextInt();
                    if (team == 1 || team == 2) {
                        manageTeamMenu(team);
                        break;
                    }else {
                        System.out.println(team + " is not a valid option");
                        break;
                    }
                case 4:
                    System.out.println("See you again soon! ^^");
                    System.exit(0);
                    break;
                default:
                    System.exit(1);
                    break;
            }
        }
    }

    public void manageTeamMenu(int team) {
        String[] listMenu = new String[]{"Add a Member to team nr. " + team, "Delete a Member from team nr. " + team, "Main Menu"};
        GenericMenu startMenu = new GenericMenu("- Football Club -\n- Manage Team nr. " + team + " -", "Choose an option: ", listMenu);

        boolean run = true;
        while (run) {
            startMenu.printMenu();
            switch (startMenu.readChoice()) {
                case 1:
                    System.out.println("Add a Member to team nr. " + team);
                    break;

                Scanner scn;
                String firstName;
                String lastName;
                int age;
                String teamName;
                scn = new Scanner(System.in);

                switch (team) {
                    case 1:
                        firstName = scn.next();
                        lastName = scn.next();
                        age = scn.nextInt();
                        teamName = scn.next();

                        Club.teamList[0].addPlayer(firstName, lastName, age, teamName);
                        club.writer.insert(firstName, lastName, age, teamName);
                        break;
                    case 2:
                        firstName = scn.next();
                        lastName = scn.next();
                        age = scn.nextInt();
                        teamName = scn.next();

                        Club.teamList[1].addPlayer(firstName, lastName, age, teamName);
                        club.writer.insert(firstName, lastName, age, teamName);
                        break;
                }

                break;
                case 2:
                    System.out.println("Delete a Member from team nr. " + team);
                    Player tmpPlayer;
                    int choice;
                    switch (team) {
                        case 1:
                            System.out.println(Club.teamList[0].getPlayerList().toString());
                            choice = startMenu.readChoice();
                            tmpPlayer = Club.teamList[0].getPlayerList().get(choice).data;
                            Club.teamList[0].removePlayer(choice);
                            club.writer.removePlayer(tmpPlayer.firstName, tmpPlayer.lastName);
                            break;
                        case 2:
                            Club.teamList[1].getPlayerList().toString();
                            choice = startMenu.readChoice();
                            tmpPlayer = Club.teamList[1].getPlayerList().get(choice).data;
                            Club.teamList[1].removePlayer(choice);
                            club.writer.removePlayer(tmpPlayer.firstName, tmpPlayer.lastName);
                            break;

                        break;
                        case 3:
                            System.out.println("Returning to Main Menu...");
                            mainMenu();
                            break;
                        default:
                            System.out.println("Invalid input please try again...");
                            break;
                    }
            }
        }
    }

    public static void searchMenu(){
        String[] listMenu = new String[]{"Search for a Member", "Search for all Members on a team", "Search for players between an age", "Main Menu"};
        GenericMenu startMenu = new GenericMenu("- Football Club -\n- Search Menu -", "Choose an option: ", listMenu);

        boolean run = true;
        while (run) {
            startMenu.printMenu();
            switch (startMenu.readChoice()) {
                case 1:
                    System.out.print("Write the name of the member you want to search for: ");
                    Scanner sc = new Scanner(System.in);
                    String name = sc.nextLine();
                    System.out.println("\nHere are all the members containing your search " + '"' + name + '"' + ":");
                    Club club = new Club("Boldklubben");
                    club.reader.printTableFromDB("members");
                    club.printAllByName(name);
                    break;
                case 2:
                    System.out.println("Search for all members on a team");
                    break;
                case 3:
                    System.out.println("Search for players between an age");
                    break;
                case 4:
                    System.out.println("Returning to Main Menu...");
                    mainMenu();
                    break;
                default:
                    System.out.println("Invalid input please try again...");
                    break;
            }
        }
    }
}