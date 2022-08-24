package com.javacourseyt.Menu;

import java.util.Scanner;
import com.javacourseyt.Utility.Common;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Choose from the menu options:");
            System.out.println("\t1 -  Variables");
            System.out.println("\t2 - Swap Variables");
            System.out.println("\t3 - User Input");
            System.out.println("\t4 - Expressions");
            System.out.println("\t999 - Exit");
            System.out.print("Choice: ");

            choice = Common.tryParse(scanner.next());

            // System.out.println(Common.ANSI_NEWLINE);

            switch (choice) {
                case 1:
                    System.out.println("Calling Variables");
                    com.javacourseyt.variables.Main.main(null);
                    break;
                case 2:
                    System.out.println("Calling Swap Variables");
                    com.javacourseyt.swapvariables.Main.main(null);
                    break;
                case 3:
                    System.out.println("Calling User Input");
                    com.javacourseyt.userinput.Main.main(null);
                    break;
                case 4:
                    System.out.println("Calling Expressions");
                    com.javacourseyt.Expressions.Main.main(null);
                    break;
                
                
                case 999:
                    System.out.println(Common.ANSI_GREEN + "We hope you had a good time!\nPlease come again soon!" + Common.ANSI_RESET);
                    break;
                default:
                    System.out.println(Common.ANSI_RED + "Invalid selection.  Please try again!" + Common.ANSI_RESET);
                    break;
            }
            // System.out.println(Common.ANSI_NEWLINE);
        } while (choice != 999);
    }
}