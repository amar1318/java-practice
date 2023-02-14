package com.javaPractice;
//Find Subarray with given sum | Set 1 (Non-negative Numbers)
//Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 13
//Output: Sum found between indexes 3 and 4

public class FindSubArray {
    static void findsum(int []arr, int sum){
        for(int i=0; i<arr.length; i++){
            int summ = arr[i];
            for(int j = i+1; j<arr.length; j++){
                summ = summ + arr[j];
                if(summ == sum){
                    System.out.println("sum found between "+i+" and "+j);
                    return;
                }
             }
        }
    }
    public static void main(String[] args) {
        int [] array = {1,4,20,3,10};
        int sum = 13;
        findsum(array, sum);
    }
}

