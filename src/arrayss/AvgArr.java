package arrayss;

public class AvgArr {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int sum = 0;
        int avg = 0;
        int length = arr.length;
        for(int i: arr){
            sum+= i;
        }
System.out.println("avg: "+ sum/length);
    }
}
