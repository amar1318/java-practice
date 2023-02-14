package com.javaPractice;
//Find common elements in three sorted arrays
//      Input: 
//          ar1[] = {1, 5, 10, 20, 40, 80} 
//          ar2[] = {6, 7, 20, 80, 100} 
//          ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} 
//      Output: 20, 80\]

public class CommonElement {
    static void commonElement(int []a, int []b, int []c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length && k<c.length){
            if(a[i] == b[j] && b[j] == c[k]){
                System.out.print(a[i]+" ");
                i++;
                j++;
                k++;
            }else if(a[i]<b[j]){
                i++;
            }else if(b[j]<c[k]){
                j++;
            }else{
                k++;
            }

        }
    }
    public static void main(String[] args) {
        int ar1[] = {1, 5, 10, 20, 40, 80};
        int ar2[] = {6, 7, 20, 80, 100} ;
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
        commonElement(ar1, ar2, ar3);
    }
}
