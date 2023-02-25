package com.javaPractice;

//Find a peak element which is not smaller than its neighbours
//Input: array[]= {5, 10, 20, 15}
//Output: 20

public class PeakElement{

    public static void peak(int[] ar){
        if(ar[0]>ar[1]){           //if 1st element is peak
            System.out.println(ar[0]);
        }

        if(ar[ar.length-1]>ar[ar.length-2]){  //if last element is peak
            System.out.println(ar[ar.length-1]);
        }
        for(int i=1; i<ar.length-1; i++){     //if middle element is peak
            if(ar[i]>=ar[i-1] && ar[i]>=ar[i+1]){
                System.out.println(ar[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};                //output---6
        peak(arr);
    }
    
}