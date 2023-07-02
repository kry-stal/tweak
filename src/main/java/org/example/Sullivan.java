package org.example;
import java.util.Scanner;
public class Sullivan {
    public static void main(String[] args) {
        printF();



    }
    static void printF(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER YOUR HEIGHT: ");
        Double height = scanner.nextDouble();

        System.out.printf("You are %.2f inches", height);
        System.out.println();

        System.out.println("ENTER YOUR NAME: ");
        String name = scanner.next();

        System.out.printf("Hello %s welcome", name);
        System.out.println();

        System.out.println("ENTER RANDOM NUMBER: ");
        double random = scanner.nextDouble();
//flags
        System.out.printf("\n %-20f", random);

        System.out.printf("\n %+f", random);

        System.out.printf("\n %020f", random);
        System.out.printf("\n %,f", random);


    }
}
