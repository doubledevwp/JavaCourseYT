package com.javacourseyt.Expressions;

import com.javacourseyt.Utility.Common;

public class Main {
    public static void main(String[] args) {
        int friends = 11;
        System.out.format("We are starting off with %d freinds." + Common.ANSI_NEWLINE, friends);
        
        friends++;
        System.out.format("YAY! We found a new friend: [INC] %d" + Common.ANSI_NEWLINE, friends);

        friends--;
        System.out.format("OH NO! We lost a friend: [DEC] %d" + Common.ANSI_NEWLINE, friends);

        friends += 4;
        System.out.format("We merged with another group of friends: [ADD] %d" + Common.ANSI_NEWLINE, friends);

        friends -= 2;
        System.out.format("Some friends went wandering: [SUB] %d" + Common.ANSI_NEWLINE, friends);

        friends *= 2;
        System.out.format("OH BOY! We found more friends: [MUL] %d" + Common.ANSI_NEWLINE, friends);

        friends /= 3;
        System.out.format("Oh man! We lost our friends again: [DIV] %d" + Common.ANSI_NEWLINE, friends);

        friends %= 2;
        System.out.format("Can we make even teams? [MOD] %d" + Common.ANSI_NEWLINE, friends);

        if (friends == 0) {
            System.out.println(Common.ANSI_GREEN + "Yes we can!" + Common.ANSI_RESET);
        } else {
            System.out.println(Common.ANSI_RED + "No we cannot!" + Common.ANSI_RESET);
        }
    }
}
