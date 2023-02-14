package com.javaPractice;
//Count pairs with given sum
//Input:  arr[] = {1, 5, 7, -1}, sum = 6
//Output:  2
public class CountPairs {
    static void totalPairs(int []arr, int sum){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int currentSum = arr[i];
            for(int j=i+1; j<arr.length; j++){
                currentSum += arr[j];
                if(currentSum == sum){
                    count++;
                }currentSum = arr[i];   //after counting one pair, set ccurrentSum---to default. so it can detect next pair
            }
        }System.out.println(count);
    }
    public static void main(String[] args) {
        int [] array = {1, 5, 7, -1, 5, 5, 5, 5};
        int sum = 6;
        totalPairs(array, sum);
    }
}
