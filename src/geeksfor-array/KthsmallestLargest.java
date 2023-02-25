package com.javaPractice;
/*
 * 5. K’th Smallest/Largest Element in Unsorted Array
 *    Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3     // 3 4 7 10 15 20
 *    Output: 7
 */
public class KthsmallestLargest {
    public static void kthelement(int[]arr, int k){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("smallest--" + arr[k-1]);
        System.out.println("largest--"+ arr[arr.length-k]);
    }
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,3,8,9,1};
        int k = 2;
        kthelement(arr, k);

    }
}

//sorted arr -- 1 3 4 5 6 7 8 9
//2nd smallest --3
//2nd largest --8
