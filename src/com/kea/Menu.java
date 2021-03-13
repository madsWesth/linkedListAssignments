package com.kea;

public class Menu {

    public static void mainMenu(){
        String[] listMenu = new String[]{"Create new Member", "List all Members", "Search for a Member",
                "Search for all Members on a team", "Search for players between age", "Delete a Member",
                "Read from Database", "Update Database", "Exit"};
        GenericMenu startMenu = new GenericMenu("- Football Club -", "Choose an option: ", listMenu);

        boolean run = true;
        while (run) {
            startMenu.printMenu();
            switch (startMenu.readChoice()) {
                case 1:
                    System.out.println("Create new Member");
                    break;
                case 2:
                    System.out.println("List all Members");
                    break;
                case 3:
                    System.out.println("Search for a Member");
                    break;
                case 4:
                    System.out.println("Search for all Members on a team");
                    break;
                case 5:
                    System.out.println("Search for players between age");
                    break;
                case 6:
                    System.out.println("Delete a Member");
                    break;
                case 7:
                    System.out.println("Read from Database");
                    break;
                case 8:
                    System.out.println("Update Database");
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.exit(1);
                    break;
            }
        }
    }
}
