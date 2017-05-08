package tasks;

/**
 * Created by Ivan Crnogorac on 5/8/2017.
 */
public class Task01 {

    public static void main(String[] args) {

        String D = "Dev";
        String O = "Ops";


        for (int i = 1; i <= 100 ; i++) {

            if (i % 3 == 0 && i % 5 == 0 ){
                System.out.println(i + " " + D + O);

            }else if (i % 3 == 0) {
                System.out.println(i + " " + D);

            }else if (i % 5 == 0){
                System.out.println(i + " " + O);
            }
        }
    }
}
