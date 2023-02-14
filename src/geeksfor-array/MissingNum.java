package com.javaPractice;
//Find the Missing Number
//Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 8
//Output: 5
public class MissingNum {
    static void missingNum(int []arr, int n){
        int sumOfN = ((n + 1) * (n + 2)) / 2;
        int miss = 0;
        for(int i=0; i<arr.length; i++){
            sumOfN -= arr[i];
        }System.out.println(sumOfN);
    }
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 5};
        int n = array.length;
        missingNum(array, n);
    }
}
