package sett;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOps {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();
        a.addAll(Arrays.asList(new Integer[]{1,3,2,4,8,9,0}));
        Set<Integer> b = new HashSet<>();
        b.addAll(Arrays.asList(new Integer[]{1,3,7,5,4,0,7,5}));

        //to find union
        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("union: "+ union);

        //to find intersection
        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("intersection: "+intersection);

        //to find difference
        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.println("difference: "+difference);

    }
}
