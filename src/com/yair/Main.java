package com.yair;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome("ababa"));
    }
    public static boolean isPalindrome(String s){
        char[] c = s.toCharArray();
        int right = c.length-1;
        for (int i = 0; i < c.length/2; i++) {
            if (c[right] != c[i]){
                return false;
            }
            right--;
        }
        return true;
    }
}
