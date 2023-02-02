package Mapss;
//using hashmap find frequent character
import java.util.HashMap;

public class FrequentChar {
    public static void main(String[] args) {
        String str = "abracadabra";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                int old = map.get(ch);
                int now = old + 1;
                map.put(ch, now);
            }else{
                map.put(ch, 1);
            }
        }

        char max = str.charAt(0);
        for(Character key : map.keySet()){
            if(map.get(key)>map.get(max)){
                max = key;
            }
        }
        System.out.println(max);
    }
}
