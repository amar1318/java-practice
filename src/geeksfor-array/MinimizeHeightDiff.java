package com.javaPractice;

import java.util.Arrays;

//Minimize the maximum difference between the heights
//Input: arr[] = {1, 15, 10}, k = 6
//Output:  Maximum difference is 5.
//Explanation: Change 1 to 7, 15 to 9 and 10 to 4. Maximum difference is 5 (between 4 and 9).
public class MinimizeHeightDiff {
    static void minimizeHeightDiff(int []arr, int k){
        Arrays.sort(arr);                    //{1, 10, 15} -->k=6-->{7, 4, 9}--res =
        int min=0, max=0,res=0;
        res = arr[arr.length-1]-arr[0];      //15-1 = 14
        for (int i=1; i< arr.length; i++){
            if(arr[i]>=k){
                max = Math.max(arr[i-1]+k,arr[arr.length-1]-k );     //max(7, 9) = 9
                min = Math.min(arr[i]-k,arr[0]+k );                  //min(4, 7) = 4      max-min=9-4= 5
                res = Math.min(res, max-min);                        //min(14, 5) = 5(ans)
            }else {
                continue;
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int []array = {1, 15, 10};
        int k = 6;
        minimizeHeightDiff(array, k);
    }
}
