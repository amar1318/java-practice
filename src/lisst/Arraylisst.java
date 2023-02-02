package lisst;

import java.util.ArrayList;
import java.util.List;

public class Arraylisst {
    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>();

        ll.add(0, 1);
        ll.add(1, 2);
        System.out.println(ll);
        List<Integer> ll2 = new ArrayList<>();
        ll2.add(1);
        ll2.add(2);
        ll2.add(3);

        ll.addAll(1, ll2);

        System.out.println(ll);

        ll.remove(1);

        System.out.println(ll);

        System.out.println(ll.get(2));

        ll.set(0, 5);

        System.out.println(ll);
    }
}
