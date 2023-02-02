package arrayss;
//this is another method using temp array
import java.util.Arrays;

public class ReverseArr{
public static void main(String [] args){
  int [] arr = {1, 2, 3, 4};
  int [] revArr = new int [arr.length];
    for(int i = arr.length-1; i>-1; i--){
      revArr[arr.length-i-1] = arr[i];
  }
  System.out.println("reversed arr:" + Arrays.toString(revArr));
 }
}