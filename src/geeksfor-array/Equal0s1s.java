package com.javaPractice;

import java.util.HashMap;
import java.util.Map;

//Count subarrays with equal number of 1’s and 0’s
//Input: arr[] = {1, 0, 0, 1, 0, 1, 1}
//Output: 8
//Explanation: The index range for the 8 sub-arrays are: (0, 1), (0, 3), (0, 5), (1, 6), (2, 3), (2, 5), (3, 4), (4, 5)
public class Equal0s1s {
    static void subArrays(int []arr){
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += (arr[i] == 0) ? -1 : arr[i];
            map.put(sum, map.get(sum) == null ? 1 : map.get(sum) +1);
        }
        int count = 0;
        for(Map.Entry<Integer, Integer> itr : map.entrySet()){
            if(itr.getValue() > 1){
                count += ((itr.getValue() * (itr.getValue() -1))/2);
            }
        }
        if(map.containsKey(0)){
            count+=map.get(0);
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int [] array = {1, 0, 0, 1, 0, 1, 1}; 
        subArrays(array);
    }
}
