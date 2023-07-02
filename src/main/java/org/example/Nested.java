package org.example;

import java.util.Scanner;

public class Nested {

    public static void main(String[] args) {
        nestedLoop();

    }

    public static void nestedLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number Of Rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter Number Of Columns: ");
        int columns = scanner.nextInt();
        System.out.println("Enter Symbol: ");
        String symbol = scanner.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }
    }


}

