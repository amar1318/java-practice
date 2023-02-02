package Mapss;

import java.util.HashMap;
import java.util.Map;

public class iteration1 {
    public static void main(String[] args) {
        Map<String, Integer> iterateMap = new HashMap<>();
        iterateMap.put("amar", 1);
        iterateMap.put("sagar", 2);
        iterateMap.put("swapnil", 3);
        iterateMap.put("Indrajeet", 4);
        
        for(Map.Entry<String, Integer> entry : iterateMap.entrySet()){
            System.out.println(entry.getKey() +"-"+entry.getValue());
        }
    }
}
