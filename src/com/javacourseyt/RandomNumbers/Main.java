package com.javacourseyt.RandomNumbers;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // nextInt returns -2B through 2B
        Integer x = random.nextInt();
        System.out.println(x);

        // nextInt(n) returns 0 through n
        // Mimicing a d6
        x = random.nextInt(6) + 1;
        System.out.println(x);

        // nextDouble returns 0 through 0.999...
        Double y = random.nextDouble();
        System.out.println(y);

        // nextBoolean returns true or false
        Boolean z = random.nextBoolean();
        System.out.println(z);
    }
}
