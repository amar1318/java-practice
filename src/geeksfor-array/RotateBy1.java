package com.javaPractice;
//  Program to cyclically rotate an array by one
//      Input:  arr[] = {1, 2, 3, 4, 5}
//      Output: arr[] = {5, 1, 2, 3, 4}
public class RotateBy1 {
    static void rotate(int []arr){
        for(int i=0; i<arr.length; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1];
            arr[arr.length-1] = temp;
        }
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        rotate(array);
    }
}
