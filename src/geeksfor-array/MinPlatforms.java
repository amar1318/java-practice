package com.javaPractice;

import java.util.Arrays;

//Minimum Number of Platforms Required for a Railway/Bus Station
//input--int []arr = { 900, 940, 950, 1100, 1500, 1800 };
//        int []dep ={ 910, 1200, 1120, 1130, 1900, 2000 };
//output--3
public class MinPlatforms {
    static void minPlatforms(int []arr, int []dep){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int plat = 1, res=1;    //if there is only one train, we're always going to need min 1 platform
        int i=1;                //we've taken 1 for the 1st train arrived
        int j=0;                //we've taken 0 because we don't know the 1st train departed or not
        while (i< arr.length && j< arr.length){
            if (arr[i]<=dep[j]){
                plat++;
                i++;
            } else if (arr[i]>dep[j]) {
                plat--;
                j++;
            }
            if (plat>res){
                res = plat;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int []arr = { 900, 940, 950, 1100, 1500, 1800 };
        int []dep ={ 910, 1200, 1120, 1130, 1900, 2000 };
        minPlatforms(arr, dep);
    }
}
