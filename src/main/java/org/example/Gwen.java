package org.example;

import java.util.Arrays;

public class Gwen {
    public static void main(String[] args) {
//        inverseString();

//        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr = {3, 2, 4};

        int[] ans = twoSum(arr, 6);
        System.out.println(Arrays.toString(ans));

    }


    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void inverseString() {
        String len = "Ten", nel = "";
        char xen;

        System.out.println(len);
        for (int i = 0; i < len.length(); i++) {
            xen = len.charAt(i);
            nel = xen + nel;
        }
        System.out.println("Reversed word: " + nel);
    }
}
