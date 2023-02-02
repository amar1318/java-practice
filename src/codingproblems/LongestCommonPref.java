package codingproblems;
//longest common preffix in array of String
//   Input: {"apple", "ape", "april"}
//   Output: "ap"

import java.util.Arrays;

public class LongestCommonPref {
    public static String prefix(String[] strs){
        if(strs == null || strs.length ==0)
        return "";

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length -1];

        int c = 0;
        while(c < first.length()){
            if(first.charAt(c) == last.charAt(c)){
                c++;
            }else{
                break;
            }
        }
        return c == 0 ? "" : first.substring(0, c);
    }
    public static void main(String[] args) {
        String[] strs = {"apple", "ape", "april"};
        String res = prefix(strs);
        System.out.println(res);
    }
}
