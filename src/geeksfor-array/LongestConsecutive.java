package com.javaPractice;

import java.util.Arrays;
import java.util.Enumeration;

//Longest Consecutive Subsequence
//Input: arr[] = {1, 9, 3, 10, 4, 20, 2}
//Output: 4
//Explanation: The subsequence 1, 3, 4, 2 is the longest subsequence of consecutive elements
public class LongestConsecutive {
    static int longestCon(int []arr){
        Arrays.sort(arr);         //{1, 2, 3, 4, 9, 10, 20}
        int count = 1;
        int max = 0;
        for(int i=0; i< arr.length-1; i++){
            if(arr[i] ==arr[i+1]){    //if numbers are duplicate, then skip
                continue;
            }
            if (arr[i]+1 == arr[i+1]){
                count++;
                max = Math.max(max, count);
            }else {
                count = 1;
            }
        }
        return Math.max(max, count);

    }
    public static void main(String[] args) {
        int []array = {1, 9, 3, 10, 4, 20, 2};
        int res = longestCon(array);
        System.out.println(res);
    }
}
