package com.javacourseyt.Utility;

public class Common {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_NEWLINE = "\n\n";

    public static Integer tryParse(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println(ANSI_NEWLINE + ANSI_RED + e + ANSI_RESET);
            System.out.println(ANSI_RED + "Invalid input.  Must be a number." + ANSI_RESET);
            return 0;
        }
    }
}
