package tasks;

/**
 * Created by Ivan Crnogorac on 5/8/2017.
 */
public class Task04 {

    public static void main(String[] args) {

        int[] foo = {1, 2, 3, 5, 7};
        int[] bar = {1, 4, 6, 7, 8};
        int[] baz = new int[foo.length + bar.length];

        System.arraycopy(foo, 0, baz, 0, foo.length);
      //  System.arraycopy(bar, 0, baz, foo.length, bar.length);

        for (int i: baz) {
          // System.out.println(i);

        }

        for (int i = 0; i <foo.length ; i++) {
            baz[i] = foo[i];
        }

        for (int i = 0; i <baz.length ; i++) {
            for
        }

        }
    }

}
