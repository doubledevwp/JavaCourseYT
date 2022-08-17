package com.javacourseyt.userinput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        System.out.println("You're " + age + " years old!");

        System.out.print("What is your favorite food? ");
        String food = scanner.next();
        System.out.println("You like " + food + "!");
    }
}
