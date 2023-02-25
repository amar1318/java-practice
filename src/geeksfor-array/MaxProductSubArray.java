package com.javaPractice;
//Maximum Product Subarray
//Input: arr[] = {6, -3, -10, 0, 2}
//Output:   180  // The subarray is {6, -3, -10}

//time complexity==O(n2)
public class MaxProductSubArray {
    static void maxProduct(int []arr){
        int maxProdArr = arr[0];
        for(int i=0; i<arr.length; i++){
            int currProd = arr[i];
            for (int j=i+1; j<arr.length; j++){
                maxProdArr = Math.max(currProd, maxProdArr);
                currProd *= arr[j];
            }
        }System.out.println(maxProdArr);
    }
    public static void main(String[] args) {
        int [] array = {6, -3, -10, 0, 2};
        maxProduct(array);
    }
}
