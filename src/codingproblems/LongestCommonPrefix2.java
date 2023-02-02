package codingproblems;

public class LongestCommonPrefix2 {

    static String prefix2(String [] strs){

        if(strs.length == 0) return "";
        String prefix = strs[0];
        for(int i=1; i<strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"apple", "ape", "april"};
        String res = prefix2(strs);
        System.out.println(res);
    }
}


/*

    prefix = apple
 
    [ape, april]

    then we compare prefix with next words in the String arr
    and remove the last chars of the prefix(apple)->appl->app->ap




*/