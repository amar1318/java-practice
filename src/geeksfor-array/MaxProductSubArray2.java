package com.javaPractice;
//Maximum Product Subarray
//Input: arr[] = {6, -3, -10, 0, 2}
//Output:   180  // The subarray is {6, -3, -10}

//time complexity==O(n)
public class MaxProductSubArray2 {
    static void maxProd(int [] arr) {
        int prod = 1;
        int res = Integer.MIN_VALUE;
        for (int j : arr) {
            prod = prod * j;
            res = Math.max(prod, res);
            if (prod == 0) prod = 1;
        }
        prod = 1;

        for(int i= arr.length-1; i>=0; i--){
            prod = prod * arr[i];
            res = Math.max(prod, res);
            if (prod == 0) prod = 1;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int [] array = {6, -3, -10, 0, 2};
        maxProd(array);
    }
}
