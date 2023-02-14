package com.javaPractice;
//  Union and Intersection of two sorted arrays
//      Input: arr1[] = {1, 3, 4, 5, 7}
//             arr2[] = {2, 3, 5, 6} 
//      Output: Union : {1, 2, 3, 4, 5, 6, 7} 
//              Intersection : {3, 5}

import java.util.ArrayList;

public class UnionIntersection {
    static void Union(int []arr1, int []arr2){    //union.length==9
        int [] union = new int[arr1.length+arr2.length];
        for(int i=0; i<arr1.length; i++){
            union[i] = arr1[i];                  //union = {1,3,4,5,7, }
        }

        for(int j = 0; j<arr2.length; j++){
            union[arr1.length + j] = arr2[j];    //union = {1,3,4,5,7,2,3,5,6}
        }

        for(int k=0; k<union.length; k++){
            System.out.print(union[k] + " ");
        }System.out.println();
    }
    static void Intersection(int []arr1, int []arr2){
        ArrayList arr = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i< arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
                j++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else{
                arr.add(arr1[i]);
                i++;
                j++;
            }
        }System.out.println(arr);
    }
    public static void main(String[] args) {
        int []arr1 = {1, 3, 4, 5, 7};
        int []arr2 = {2, 3, 5, 6};

        Union(arr1, arr2);
        Intersection(arr1, arr2);
    }
}
