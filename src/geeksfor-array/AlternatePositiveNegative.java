package com.javaPractice;

import java.util.ArrayList;

//Rearrange array in alternating positive & negative items with O(1) extra space | Set 1
//Input:  arr[] = {1, 2, 3, -4, -1, 4}
//Output: arr[] = {-4, 1, -1, 2, 3, 4}
public class AlternatePositiveNegative {
    static void arrangeInArr(int[] nums) {
        int even_idx = 0, odd_idx = 1;
        int[] ans = new int[nums.length];

        for (int num : nums) {
            if (num >= 0) {
                ans[even_idx] = num;
                even_idx += 2;    //updating idx to put positive int in alternate places
            } else {
                ans[odd_idx] = num;
                odd_idx += 2;
            }
        }
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
    public static void main(String[] args) {
        int [] nums = {3,1,-2,-5,2,-4};
        arrangeInArr(nums);
    }
}