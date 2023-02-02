package Mapss;

public class MaxChar {
    public static void main(String[] args) {
        String str = "grass is greeener on the other side";

        int[] freq = new int[str.length()];
        char minChar = str.charAt(0);
        char maxChar = str.charAt(0);

        char [] charArr = str.toCharArray();

        for(int i=0; i<charArr.length; i++){
            freq[i] = 1;
            for(int j=i+1; j<charArr.length; j++){
                if(charArr[i] == charArr[j] && charArr[i] != '0'){
                    freq[i]++;
                    charArr[j] = '0';
                }
            }
        }

        int min = freq[0];
        int max = freq[0];
        for(int i=0; i<freq.length; i++){
            if(min>freq[i] && freq[i] != '0'){
                min = freq[i];
                minChar = charArr[i];
            }

            if(max<freq[i]){
                max = freq[i];
                maxChar = charArr[i];
            }
        }

        System.out.println("max : "+maxChar);
        System.out.println("min : "+minChar);
    }
}
