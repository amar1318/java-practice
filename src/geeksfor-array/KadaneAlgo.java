package com.javaPractice;

public class KadaneAlgo {
    static void largestSum(int []arr){
        int sum = 0;
        int res  = arr[0];
        for(int i=0; i< arr.length; i++){
            sum += arr[i];
            if(sum > res) res = sum;
            if(sum < 0) sum = 0;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int []array = { -2, -3, 4, -1, -2, 1, 5, -3 };
        largestSum(array);
    }
}
