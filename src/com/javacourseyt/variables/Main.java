package com.javacourseyt.variables;

public class Main {
    public static void main(String[] args) {
        boolean a = false; // 1 bit; true || false
        byte b = 0; // 1 byte; -128 to 127
        short c = 0; // 2 bytes; -32,768 to 32,767
        int d = 0; // 4 bytes; -2 billion to 2 billion
        long e = 0L; // 8 bytes; -9 quintillion to 9 quintillion and needs to have 'L' appeneded at the end
        float f = 0f; // 4 bytes; 6 - 7 digits and needs to have 'f' appended at the end EXAMPLE: 3.141592f
        double g = 0; // 8 bytes; 15 digits EXAMPLE: 3.141592653589793
        char h = 'a'; // 2 bytes; single ASCII value
        String i = "Words"; // varies; sequence of char || an array of char

        System.out.println(f);
    }
}
