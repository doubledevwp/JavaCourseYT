package com.javacourseyt.Math;

import java.util.Scanner;

import com.javacourseyt.Utility.Common;

public class Triangle {
    public static void main(String[] args) {
        Double x = null;
        Double y = null;
        Double z = null;

        try (Scanner scanner = new Scanner(System.in)) {
            while (x == null) {
                System.out.print("Enter side x: ");
                x = Common.tryParseDouble(scanner.next());
            }
    
            while (y == null) {
                System.out.print("Entere side y: ");
                y = Common.tryParseDouble(scanner.next());
            }
    
            z = Math.sqrt((x * x) + (y * y));
            System.out.println("Hypotenuse is: " + z);
        }
    }
}
