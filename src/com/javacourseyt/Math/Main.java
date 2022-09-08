package com.javacourseyt.Math;

public class Main {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;

        // Math.max returns the higher number
        double z = Math.max(x, y);
        System.out.println(z);

        // Math.min returns the lower number
        z = Math.min(x, y);
        System.out.println(z);

        // Math.abs returns absolute value; positive number
        z = Math.abs(y);
        System.out.println(z);
        
        // Math.sqrt returns the square root
        z = Math.sqrt(x);
        System.out.println(z);
        z = Math.sqrt(y);
        System.out.println(z); // can't square root a negative number

        // Math.round
        z = Math.round(x);
        System.out.println(z);
        z = Math.round(y);
        System.out.println(z);

        // Math.ceil rounds up
        z = Math.ceil(x);
        System.out.println(z);
        
        // Math.floor rounds down
        z = Math.floor(x);
        System.out.println(z);

        System.out.println("Calling Triangle");
        com.javacourseyt.Math.Triangle.main(null);
    }
}
