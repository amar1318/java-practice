package com.javaPractice;
//Find the first repeating element in an array of integers
//      Input: arr[] = {10, 5, 3, 4, 3, 5, 6}
//      Output: 5 
public class RepeatingElement {
    static void repeating(int []arr){
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i]+" ");
                    System.exit(1);
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] array = {10, 5, 3, 4, 3, 5, 6};
        repeating(array);
    }
}
