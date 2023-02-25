package com.javaPractice;
//Find if there is a subarray with 0 sum
//Input: {4, 2, -3, 1, 6}
//Output: true
public class SubArrayWithSum0 {
    static void subArray(int []arr){
        int currSum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                currSum += arr[j];
                if(currSum == 0){
                    System.out.println(true);
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] array = {4, 2, -3, 1, 6};
        subArray(array);
    }
}
