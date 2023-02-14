package com.javaPractice;

//  Move all negative numbers to beginning and positive to end with constant extra space
//      Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
//      Output: -12 -13 -5 -7 -3 -6 11 6 5


public class NegativeNum {

    static void sortNegativeNumbers(int []arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                continue;
            }
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        int [] array = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        sortNegativeNumbers(array);
    }
}
