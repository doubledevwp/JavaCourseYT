package com.javacourseyt.userinput;

import java.util.Scanner;
import com.javacourseyt.Utility.Common;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.print("How old are you? ");
        int age = Common.tryParse(scanner.next());
        System.out.println("You're " + age + " years old!");
        
        if (age < 18) {
            System.out.println("WOW! You're young!");
        } else if (age >= 18 && age < 21) {
            System.out.println("You can join the military!  Go be patriotic!");
        } else if (age >= 21) {
            System.out.println("FINALLY!  How is adulting?!");
        }        

        System.out.print("What is your favorite food? ");
        String food = scanner.next();
        System.out.println("You like " + food + "!");
    }
}
