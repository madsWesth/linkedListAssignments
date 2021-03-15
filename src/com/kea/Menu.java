package com.kea;

import java.util.Scanner;

public class Menu {

    public static void mainMenu(){
        String[] listMenu = new String[]{"List all Members", "Search Menu", "Manage Team Menu", "Exit"};
        GenericMenu startMenu = new GenericMenu("- Football Club -\n- Main Menu -", "Choose an option: ", listMenu);

        boolean run = true;
        while (run) {
            startMenu.printMenu();
            switch (startMenu.readChoice()) {
                case 1:
                    System.out.println("List all Members");
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

    public static void manageTeamMenu(int team){
        String[] listMenu = new String[]{"Add a Member to team nr. " + team, "Delete a Member from team nr. " + team, "Main Menu"};
        GenericMenu startMenu = new GenericMenu("- Football Club -\n- Manage Team nr. " + team + " -", "Choose an option: ", listMenu);

        boolean run = true;
        while (run) {
            startMenu.printMenu();
            switch (startMenu.readChoice()) {
                case 1:
                    System.out.println("Add a Member to team nr. " + team);
                    break;
                case 2:
                    System.out.println("Delete a Member from team nr. " + team);
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

    public static void searchMenu(){
        String[] listMenu = new String[]{"Search for a Member", "Search for all Members on a team", "Search for players between an age", "Main Menu"};
        GenericMenu startMenu = new GenericMenu("- Football Club -\n- Search Menu -", "Choose an option: ", listMenu);

        boolean run = true;
        while (run) {
            startMenu.printMenu();
            switch (startMenu.readChoice()) {
                case 1:
                    System.out.println("Search for a Member");
                    break;
                case 2:
                    System.out.println("Delete a Member from team nr. ");
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