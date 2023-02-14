package com.javaPractice;

import java.util.HashMap;
import java.util.Map;

//Find first non-repeating element in a given Array of integers
//Input: {9, 4, 9, 6, 7, 4}
//Output: 6
public class NonRepeatingElement {
    static void nonRepeating(int []arr){
        Map<Integer, Integer> map = new HashMap<>();
            for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }
        for(int i=0; i<arr.length; i++){
            if(map.get(arr[i]) == 1){
                System.out.println(arr[i] +" ");
                System.exit(1);
            }
        }
    }
    public static void main(String[] args) {
        int [] array = {9, 4, 9, 6, 7, 4};
        nonRepeating(array);
    }
}
