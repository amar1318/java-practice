package com.javaPractice;
//Find duplicates in O(n) time and O(1) extra space | Set 1
//Input : n = 7 and array[] = {1, 2, 3, 6, 3, 6, 1}
//Output: 1, 3, 6
//Explanation: 1, 3 and 6 appears more than once in the arr

//method 1--we can do it by using nested loop, but it will take more time--O(n2)..which is not reliable
//method 2--

public class FindDuplicateInLessTime {
    static void findDup(int []arr){
        for (int i = 0; i < arr.length; i++) {
            int index=Math.abs(arr[i])-1;        
            if (arr[index] < 0) {
                System.out.print(index+1);
            } else {
                arr[index] = -arr[index];
            }
        }
    }
    
    public static void main(String[] args) {
        int []array = {1, 2, 3, 6, 3, 6, 1};
        findDup(array);

    }
}



/*
1st loop
{1, 2, 3, 6, 3, 6, 1}
index =  1-1 = 0
arr[index]<0 ==false
arr[index] = -1;
{-1, 2, 3, 6, 3, 6, 1}

2nd loop
{-1, 2, 3, 6, 3, 6, 1}
index = 2-1=1
arr[index]<0 ==false
arr[index] = -2
{-1, -2, 3, 6, 3, 6, 1}

3rd loop
{-1, -2, 3, 6, 3, 6, 1}
index = 3-1 = 2
arr[index]<0 ==false
arr[index] = -3
{-1, -2, -3, 6, 3, 6, 1}

4th loop
{-1, -2, -3, 6, 3, 6, 1}
index = 6-1 = 5
arr[index] < 0 == false
arr[index] = -6
{-1, -2, -3, -6, 3, -6, 1}

5th loop
{1, 2, 3, 6, 3, 6, 1}
index = 3-1 = 2
arr[index] < 0 ==true               print on consol--index+1=3===3(which is duplicate element)
{-1, -2, -3, -6, 3, -6, 1}           no change in arr

6th loop
{1, 2, 3, 6, 3, 6, 1}
index = 6-1 = 5
arr[index] <0 ==true                print --index+1== 6 
{-1, -2, -3, -6, 3, -6, 1}           no change in arr

7th loop
{1, 2, 3, 6, 3, 6, 1}
index = 1-1 = 0
arr[index] < 0==true                print index+1 ==1


output====== 3 6 1

 */