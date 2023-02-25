package com.javaPractice;

public class Factorial1 {
    static int factorial(int a){
        if(a == 0) return 1;
        return a * factorial(a-1);
    }
    public static void main(String[] args) {
        int aa = 11;
        int res= factorial(aa);
        System.out.println(res);
    }
}
