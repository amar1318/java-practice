package com.javaPractice;

/*
 * Write a program to reverse an array or string
 * Input  : arr[] = {1, 2, 3}
 * Output : arr[] = {3, 2, 1}
 */

public class ArrayReverse {
    public static void reverse(){
        int [] arr = {1,2,3,4,5};
        int start = 0;                 // start = 1
        int end = arr.length-1;        // end = 5
        while(start < end){
            int temp = arr[start];     //temp = 1
            arr[start] = arr[end];     //start = 5
            arr[end] = temp;           //end = 1
            start++;
            end--;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        reverse();
    }
}
