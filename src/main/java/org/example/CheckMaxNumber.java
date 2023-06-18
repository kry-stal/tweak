package org.example;

import java.util.Scanner;

public class CheckMaxNumber {

    public static void main(String[] args) {
        int res = checkMaxNumber();
        System.out.println("Max = " + res);
        checkNumber();

    }

    public static int checkMaxNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER NUMBER:  ");
        int x = scanner.nextInt();
        System.out.println("ENTER 2nd NUMBER: ");
        int y = scanner.nextInt();

        if (x > y) {
            return x;
        } else {
            return y;
        }

    }

    public static void checkNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER NUMBER:  ");
        int a = scanner.nextInt();

        if (a > 0) {
            System.out.println("Positive");
        } else if (a < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("zero");
        }
    }
}




