package tasks;

import java.util.Scanner;

/**
 * Created by Ivan Crnogorac on 5/8/2017.
 */
public class Task02 {

    public static boolean isNumber(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (Exception var2) {
            System.out.println("Unos mora biti broj!");
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String unos;
        int unosInt;

        do {
            System.out.println("Unesite broj kojem želite da odredite factorial");
            unos = sc.nextLine();
        } while (!isNumber(unos));

        unosInt = Integer.parseInt(unos);
        int factorial = 1;

        for (int i = 1; i <= unosInt ; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial broja " + unosInt + " je: " + factorial);
    }
}
