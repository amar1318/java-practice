package arrayss;
public class Mock{
    public void reverse(int num){
        int rev = 0;
        while(num>0){
        rev = rev*10 + num%10;
        num = num/10;
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        Mock m = new Mock();
        int a = 123;
        m.reverse(a);

    }
}