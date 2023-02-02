package Mapss;
//Write a program to find the highest frequency of a character in a given string
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;

public class FreqChar {
    public static void main(String[] args) {
        String str = "amar gawade you are beautiful";

        //creating a hashmap
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for(int i = 0; i<str.length(); i++){
            Character ch = str.charAt(i);
            if(freqMap.containsKey(ch) == true){
                int old_freq = freqMap.get(ch);
                int new_freq = old_freq + 1;
                freqMap.put(ch, new_freq);
            }else{
                freqMap.put(ch, 1);
            }
        }

        Set<Character> keys = freqMap.keySet();
        Character c = str.charAt(0);
        for(Character key : keys){
            if(freqMap.get(key)>freqMap.get(c)){
                c = key;
            }
        }System.out.println(c);
        
    }
}
