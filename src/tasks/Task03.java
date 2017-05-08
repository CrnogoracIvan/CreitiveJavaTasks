package tasks;

import java.util.Scanner;

/**
 * Created by Ivan Crnogorac on 5/8/2017.
 */
public class Task03 {

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
        boolean prost = true;
        int unosInt;
        int control = 2;

        do {
            System.out.println("Unesite broj:");
            unos = sc.nextLine();
        } while (!isNumber(unos));


        unosInt = Integer.parseInt(unos);
        while (control < unosInt){
            if (unosInt % control == 0){
                prost = false;
            }
            break;
        }
    if (prost){
        System.out.println("Broj " + unosInt + " je prost broj.");
    } else {
        System.out.println("Broj " + unosInt + " je složen broj.");
    }

    }
}
