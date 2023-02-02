package arrayss;
//Find a peak element which is not smaller than its neighbours
//arr = {1,2,3,1,4,6,5}  output = 3, 6

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,4,6,5};
        for(int i =1; i<arr.length-1; i++){
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                System.out.println(arr[i]);
            }
            
        }
    }
}
