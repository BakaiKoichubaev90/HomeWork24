package HomeWork24;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> b = new HashSet<>(Arrays.asList(1,2,0));
        System.out.println(symmetricDifference(a,b));

    }

    public static Set<Integer> symmetricDifference(Set<Integer> a, Set<Integer> b) {
        Set<Integer> c = new HashSet<>(a);
        c.addAll(b);
        Set<Integer> temp = new HashSet<>(a);
        temp.retainAll(b);
        c.removeAll(temp);

        return c;
    }


}



