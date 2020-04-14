import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        int a = 0, b = 0;

        System.out.println("Input only positive numbers!");

        Scanner sc = new Scanner(System.in);

        try { a = sc.nextInt();
            b = sc.nextInt();}
        catch (InputMismatchException e) {System.out.println("Oops! Not integer");}

        try { System.out.println(squareRectangle (a, b));}
        catch (NegativeException e) {System.out.println("Input only positive numbers!");}

    }

    private static int squareRectangle (int a, int b) throws NegativeException{
        int sqtarea = 0;
        if (a > 0 & b > 0) {sqtarea = a * b; }
        else throw new  NegativeException ();
        return sqtarea;
    }

    private static class NegativeException extends Exception{
    }

}
