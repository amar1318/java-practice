package com.velocity;
/*
 * Count number of occurrences (or frequency) in a sorted array
 *  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 1
 *  Output: 2 
 */
public class FreqInSortedArr {
    public static void freq(int []arr, int k){
        int count = 0;
        for(int i=0; i<arr.length; i++){  //using for loop
            if(arr[i] == k){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int [] array = {1,2,3,3,5,6};
        int k = 3;
        freq(array, k);
    }
}
