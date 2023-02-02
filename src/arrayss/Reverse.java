package arrayss;
import java.util.Arrays;

public class Reverse{
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};
        
        for(int i =0; i<arr.length/2; i++){
            int j = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = j;
        }
        System.out.println("reversed arr: " + Arrays.toString(arr));
        
    }
}