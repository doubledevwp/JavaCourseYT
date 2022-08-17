package com.javacourseyt.start;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Choose from the menu options:");
            System.out.println("\t1 -  Integers");
            System.out.println("\t2 - Variables");
            System.out.println("\t3 - User Input");
            System.out.println("\t999 - Exit");
            System.out.print("Choice: ");

            choice = scanner.nextInt();
            System.out.println("\n\n");

            switch (choice) {
                case 1:
                    System.out.println("Calling Integers");
                    com.javacourseyt.integers.Main.main(null);
                    break;
                case 2:
                    System.out.println("Calling Variables");
                    com.javacourseyt.variables.Main.main(null);
                    break;
                case 3:
                    System.out.println("Calling User Input");
                    com.javacourseyt.userinput.Main.main(null);
                    break;
                default:
                    break;
            }
            System.out.println("\n\n");
        } while (choice != 999);
    }
}
