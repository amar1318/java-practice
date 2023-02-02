package arrayss;

public class MissingNum {
    static int findMissingNum(int[] num, int n){
        int sum = ((n+1) * (n+2))/2;
        System.out.println(sum);
        for(int i=0; i<n; i++){
            sum -= num[i];
        }
        return sum;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int n = arr.length;
        int result = findMissingNum(arr, n);
        System.out.println(result);
    }
}
