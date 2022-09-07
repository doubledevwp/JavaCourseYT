package com.javacourseyt.Utility;

import javax.xml.stream.events.EndElement;

public class Common {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_NEWLINE = "\n\n";

    private static String ERROR_MESSAGE;

    public static String GetErrorMessage() {
        return ERROR_MESSAGE;
    }
    
    private static void SetErrorMessage(String message) {
        ERROR_MESSAGE = message;
    }

    public static Integer tryParseInt(Object obj) {
        SetErrorMessage("");
        try {
            return Integer.parseInt(obj.toString());
        } catch (NumberFormatException e) {
            System.out.println(ANSI_NEWLINE + ANSI_RED + e + ANSI_RESET);
            System.out.println(ANSI_RED + "Invalid input.  Must be a number." + ANSI_RESET);
            SetErrorMessage("Invalid input.  Must be a number.");
            return null;
        }
    }

    public static Double tryParseDouble(Object obj) {
        SetErrorMessage("");
        try {
            return Double.parseDouble(obj.toString());
        } catch (NumberFormatException e) {
            System.out.println(ANSI_NEWLINE + ANSI_RED + e + ANSI_RESET);
            System.out.println(ANSI_RED + "Invalid input.  Must be a number or decimal." + ANSI_RESET);
            SetErrorMessage("Invalid input.  Must be a number or decimal.");
            return null;
        }
    }
}
