package org.example;

public class Crass {
    public static void main(String[] args) {

        int a = 2;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println(multiply(a,b,c));
        System.out.println(add(a,b,c,d));




    }
    static int multiply(int x, int y, int z){
        return x*y*z;
    }
    static int add(int x, int y) {
        return x + y;
    }
    static int add(int x, int y, int z) {
        return x + y + z;
    }

    static int add(int x, int y, int z, int a) {
        return x + y + z + a;
    }

    }
