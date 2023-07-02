package org.example;

import java.io.FilterOutputStream;

public class PlayWright {
    public static void main(String[] args) {
      boolean ans =  isPalindrome("Racecar");
        System.out.println(ans);
        String str = "Kaka";

        System.out.printf("Hello %s",str);



    }

    //    public static void checkPalindrome(){
//        String task = "boy";
//        char[] str = task.toCharArray();
//        for (int i = 0; i < str.length; i++){ //i equ.0 start point as long as
//        }
//
//        System.out.println(str);
    public static boolean isPalindrome(String str) {

        StringBuilder builder = new StringBuilder();

        for (int index = str.length() - 1; index >= 0; index--) {
            builder.append(str.charAt(index));
        }

        return str.equalsIgnoreCase(builder.toString());
//        if (true) {
//            System.out.printf("%s is palindrome",str);
//        }
//        else {System.out.printf("%s is not a palindrome",str);}
  }


}

