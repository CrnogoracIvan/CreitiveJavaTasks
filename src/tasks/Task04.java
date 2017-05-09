package tasks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Ivan Crnogorac on 5/8/2017.
 */
public class Task04 {

    public static int[] mergeArrays2 ( int[] foo, int[] bar){
        int[] merged = new int[foo.length + bar.length];
        System.arraycopy(foo, 0, merged, 0, foo.length);
        System.arraycopy(bar, 0, merged, foo.length, bar.length);

        Set <Integer> nodupes = new HashSet <Integer>();

        for (int i = 0; i < merged.length; i++) {
            nodupes.add(merged[i]);
        }

        int[] nodupesarray = new int[nodupes.size()];
        int i = 0;
        Iterator <Integer> it = nodupes.iterator();
        while (it.hasNext()) {
            nodupesarray[i] = it.next();
            i++;
        }

        return nodupesarray;
}

    public static void main(String[] args) {
         int[] foo = {1, 2, 3, 5, 7};
         int[] bar = {1, 4, 6, 7, 8};

        for (int i: mergeArrays2(foo, bar)
             ) {
            System.out.println(i);
        }
    }
}
