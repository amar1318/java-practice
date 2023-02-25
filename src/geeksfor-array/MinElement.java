package com.javaPractice;
//Find the Minimum element in a Sorted and Rotated Array
//Input: arr[] = {5, 6, 1, 2, 3, 4}
//Output: 1
//Explanation: 1 is the minimum element present in the array.

//method 1-- we can find min element by using min variable and updating it as we find new minimum element.

public class MinElement {
    static void minElement(int []arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }System.out.println(min);
    }

    public static void main(String[] args) {
        int []array = {5, 6, 2, 3, 4};
        minElement(array);
    }
}
