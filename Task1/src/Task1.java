package Task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a,b;
        String answer;

        System.out.println("Hello. Input value for A please.");
        a = sc.nextInt();
        System.out.println("Input value for B please.");
        b = sc.nextInt();

        float c = ((float)a/b);

        System.out.println("A+B=" + (a+b));
        System.out.println("A-B=" + (a-b));
        System.out.println("A*B=" + (a*b));
        System.out.println("A/B=" + c);

        System.out.println("How are you?");
        sc.nextLine();
        answer = sc.nextLine();
        System.out.println("You are " + answer);
        sc.close();

    }

}