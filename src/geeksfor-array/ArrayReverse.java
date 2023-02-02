package com.velocity;

/*
 * Write a program to reverse an array or string
 * Input  : arr[] = {1, 2, 3}
 * Output : arr[] = {3, 2, 1}
 */

public class ArrayReverse {
    public static void reverse(){
        int [] arr = {1,2,3,4,5};
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
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
