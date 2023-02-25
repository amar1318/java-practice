package com.javaPractice;
/*
 * 4. program to sort an array in ascending order
 *    Input: arr[] = {0, 23, 14, 12, 9}
*     Output: {0, 9, 12, 14, 23}
 */

public class SortArray {
    public static void sort(int []arr){
        for(int i=0; i<arr.length; i++){      //sort using for loop or bubble sort
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];    //temp = 4
                    arr[i] = arr[j];      // i = 2
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int [] array = {4,5,7,2,1,9,0};      //output--0 1 2 4 5 7 9
        sort(array);
    }
}
