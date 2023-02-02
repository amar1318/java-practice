package codingproblems;

import java.util.HashMap;
import java.util.Map;

public class RomanToDecimal {

    //by using hashmap
    public static int romanToInt(String s){

        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int res = 0;
        for(int i = 0; i < s.length()-1; i++){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                res -= map.get(s.charAt(i));
            }
            else {
                res += map.get(s.charAt(i));
            }
        }
        return res + map.get(s.charAt(s.length()-1));
    }

    public static void main(String[] args) {
        String s = "LVIII";
        int result = romanToInt(s);
        System.out.println(result);
    }
}


/*
 
 SYMBOL       VALUE
  I            1
  IV           4
  V            5
  IX           9
  X            10
  XL           40
  L            50
  XC           90
  C            100
  CD           400
  D            500
  CM           900 
  M            1000 


 */
