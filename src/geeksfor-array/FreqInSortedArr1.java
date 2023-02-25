package com.javaPractice;
/*
 * Count number of occurrences (or frequency) in a sorted array
 *  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 1
 *  Output: 2 
 */
public class FreqInSortedArr1 {
    public static int binarySearch(int []arr, int start, int end, int x){
        int mid = start + (end-start)/2;
        if(arr[mid] == x) return mid;
        if(arr[mid] < x) return binarySearch(arr, start, mid-1, x);
        return binarySearch(arr, mid+1, end, x);
        
        
    }
    public static void freq1(int []arr, int k){
        int ind = binarySearch(arr, 0, arr.length-1, k);
        
        //count element on the left side
        int count = 1;
        int left = ind-1;
        while(left>0 && arr[left] == k){
            count++;
            left--;
        }

        //count element on the right side
        int right = ind+1;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,3,5,6};
        int k = 3;
        freq1(array, k);
    }
}
