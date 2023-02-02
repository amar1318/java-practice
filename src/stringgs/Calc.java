package stringgs;
//Java program to calculate sum of integers in string.
public class Calc {
    public static void main(String[] args) {
        int sum = 0;
        String str = "h1 y0u ar6 b6aut1ful";
        for(int i=0;i<str.length();i++){ 
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
            sum+=(str.charAt(i)-'0');
            }
        }System.out.println(sum);

    }
}
