package org.example;

import java.util.ArrayList;

public class Midnight {
    public static void main(String[] args) {
        String str ="";
//        StringBuffer StringBuffer = new StringBuffer();
//        StringBuilder StringBuilder = new StringBuilder();
//        String a = "Ada";
//        a = "Ada is a girl";
//        System.out.println(a);

        ArrayList<String> dogs = new ArrayList<String>();
        dogs.add("Shepard");
        dogs.add("Black");
        dogs.add("Xerxes");
        dogs.add("Anjelo");

        dogs.remove(3);
        dogs.set(2, "Gelato");

        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i));
        }
        System.out.println(dogs);
        String dt = new String("boy");
        dt = "girl";//new String("girl");
        int x = 8;

        ArrayList<ArrayList<String>> list = new ArrayList();
        ArrayList<String> food = new ArrayList<String>();
        food.add("Yam");
        food.add("Rice");
        food.add("Beans");
        food.add("Pasta");

        ArrayList<String> drinks = new ArrayList<String>();
        drinks.add("Sosa");
        drinks.add("Milk");
        drinks.add("Coke");

        ArrayList<String> stationery = new ArrayList<String>();
        stationery.add("Pencil");
        stationery.add("Pen");
        stationery.add("Paper");
        stationery.add("Clips");

        list.add(stationery);
        list.add(food);
        list.add(drinks);


        System.out.println(list);
        System.out.println(list.get(1).get(0));

        String[][] random = {
                {"Mustang", "Camaro", "Honda"},
                {"Rolls", "Samosa", "Cakes"},
                {"Sosa", "Milk", "Soda"}};

        for (int i = 0; i < random.length; i++) {
            System.out.println();
           for (int j = 0; j < random[i].length; j++)
                System.out.print(random[i][j] + " ");
        }
        System.out.println();

        for (String i : stationery) {
            System.out.println();
            System.out.print(i);

        }



    }
}
