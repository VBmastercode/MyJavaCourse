package task3;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // range

        float a,b,c;

        System.out.println("Hello. Input three value for variable 1 please.");
        a = sc.nextFloat();
        System.out.println("Input three value for variable 2 please.");
        b = sc.nextFloat();
        System.out.println("Input three value for variable 3 please.");
        c = sc.nextFloat();

        if (a>=-5 && a<=5 && b>=-5 && b<=5 && c>=-5 && c<=5) {
            System.out.println("All values in range -5 to 5");
        }	else { System.out.println("Some values out range -5 to 5");
        }
        // min max

        int d,e,f,max,min,error;

        System.out.println("Hello. Input three value for variable int1 please.");
        d = sc.nextInt();
        System.out.println("Input three value for variable int2 please.");
        e = sc.nextInt();
        System.out.println("Input three value for variable int3 please.");
        f = sc.nextInt();

        if (d > e && d > f) {
            max = d; }
        else { if (e > d && e > f) { max = e;}
        else {max = f;}
        }

        if (d < e && d < f) {
            min = d; }
        else { if (e < d && e < f) { min = e;}
        else {min = f;}
        }

        System.out.println("Max value is "+ max + " Min value is " + min);

        // http error codes

        System.out.println("Input HTTP error code number please.");
        error = sc.nextInt();
        sc.close();

        final String errorname;

        errorname = "err"+error;

        HTTPError httperror = HTTPError.valueOf(errorname);

        System.out.println("HTTP error code is - " + httperror.getCode() );


    }

}