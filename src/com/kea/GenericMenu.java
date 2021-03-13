package com.kea;
import java.util.Scanner;

class GenericMenu {
    private final String menuHeader;
    private final String leadText;
    private final String[] menuItems;

    /**
     * Array to keep track on different parts of the menu
     * @param menuHeader Header for the menu
     * @param leadText prompt for user input
     * @param menuItems All the different menu options
     */
    public GenericMenu(String menuHeader, String leadText, String[] menuItems) {
        this.menuHeader = menuHeader;
        this.leadText = leadText;
        this.menuItems = menuItems;
    }

    /**
     * Printing out the menu
     */
    public void printMenu() {
        String printString = menuHeader + "\n";

        for (int i = 1; i <= menuItems.length; i++) {
            printString += i + ". " + menuItems[i - 1] + "\n";
        }
        System.out.println("\n" + printString);
    }

    /**
     * Dictates the users choice navigating the menu
     * @return the input typed by user
     */
    public int readChoice() {
        Scanner scanner = new Scanner(System.in);
        boolean validChoice = false;
        int choice = -1;

        while (! validChoice) {
            System.out.print(leadText);
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                validChoice = true;
            } else {
                System.out.println("Please enter an integer!");
                scanner.nextLine();
            }
        }
        return choice;
    }
}
