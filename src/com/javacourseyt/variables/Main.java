package com.javacourseyt.variables;

public class Main {
    public static void main(String[] arg) {
        String x = "water";
        String y = "Kool-aid";
        String temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        
        temp = x;
        x = y;
        y = temp;
        
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
