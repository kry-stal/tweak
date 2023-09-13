package org.example;

import java.util.Scanner;

public class Schlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER NUMBER PLAYER: ");
        int number = scanner.nextInt();

        if (number >= 6) {
            System.out.println("YOU WIN!");
        } else {
            System.out.println("YOU LOSE!");
        }
    }
}
