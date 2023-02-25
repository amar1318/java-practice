package com.javaPractice;
/*

2. Find minimum and maximum element in an array
        Input:  A[] = {3, 2, 1, 56, 10000, 167}
        Output: min = 1, max =  10000
*/
public class MinMax {
    public static int min(int []arr1){         //min
        int min = arr1[0];
        for(int i=1; i<arr1.length; i++){
            if(arr1[i]<min){
                min = arr1[i];
            }
        }
        return min;
        
    }

    public static int max(int []arr2){         //max
        int max = arr2[0];
        for(int i=1; i<arr2.length; i++){
            if(arr2[i]>max){
                max = arr2[i];
            }
        }
        return max;
        
    }

    public static void main(String[] args) {
        int []array = {1,2,3,4,5};
        System.out.println(min(array));         //output--1
        System.out.println(max(array));         //output--5
    }
    
}
