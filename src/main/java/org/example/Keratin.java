package org.example;

public class Keratin {


    public static void main(String[] args) {
//        arrayCim();
        arrayTim();
    }


    public static void arrayCim() {
        String[] songs = {"Ife", "Faithful", "Win", "Sade"};
        songs[0] = "Stranger";
//        System.out.println(songs[3]);
//        for (int i = 0; i < songs.length; i++) {
//            System.out.println(songs[i]);
//        }

        for(String song: songs){
            System.out.println(song);
        }
    }

    public static void arrayTim() {

        String[][] cars = new String[3][3];
        cars[0][0] = "Hundai";
        cars[0][1] = "Camaro";
        cars[0][2] = "Sedan";
        cars[1][0] = "Golf";
        cars[1][1] = "Camry";
        cars[1][2] = "Volkswagen";
        cars[2][0] = "Prado";
        cars[2][1] = "Benz";
        cars[2][2] = "BMW";

        String[][] carsExplained = {
               // col 0,    col 1,    col 2
                {"Hundai", "Camaro", "sedan"},//row 0
                {"Golf",   "Camry",   "Volkswagen"},//row 1
                {"Prado",   "Benz",   "BMW"}//row 2
        };

        for (int row = 0; row < carsExplained.length; row++) {
            System.out.println();
            for (int col = 0; col < carsExplained[row].length; col++) {
                System.out.print(carsExplained[row][col] + " ");
            }
        }
    }


}



