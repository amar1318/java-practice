package com.javaPractice;
/*
 * Sort an array of 0s, 1s and 2s | Dutch National Flag problem
 *  Input: {0, 1, 2, 0, 1, 2}
 *  Output: {0, 0, 1, 1, 2, 2}
 */
public class SortArr012 {
    public static void sortt(int []arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){    //time comp--O(n2)
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int [] array = {0,1,2,0,1,2,0,1,2};       //0,0,0,1,1,1,2,2,2
        sortt(array); 
    }
}



// 0,1,2,0,1,2,0,1,2         
// --0001112222

// start==0
// end==2
// mid==0



