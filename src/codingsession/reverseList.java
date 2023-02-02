package codingsession;

import java.util.*;

public class reverseList {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();
        lst.add(12);
        lst.add(23);
        lst.add(55);
        Collections.reverse(lst);
        System.out.println(lst);
    }
}
