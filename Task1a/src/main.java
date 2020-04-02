import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        double pr,ar;
        String answer;

        System.out.println("Hello. Input value for radius of the table.");
        a = sc.nextInt();
        pr = 2 * 3.14 * a;
        ar = 3.14 * a * a;
        System.out.println("Table`s perimetr = " + pr + " Table`s area = " + ar);


        String name, address;
        sc.nextLine();
        System.out.println("What is your name?");
        name = sc.nextLine();
        System.out.println("Where are you live " + name + "?" );
        address = sc.nextLine();
        System.out.println(name + ", your address is" + address + "!" );


        int c1,c2,c3,t1,t2,t3,total1,total2,total3;
        System.out.println("Rate for country1?");
        c1 = sc.nextInt();
        System.out.println("Rate for country2?");
        c2 = sc.nextInt();
        System.out.println("Rate for country3?");
        c3 = sc.nextInt();
        System.out.println("Time for country1?");
        t1 = sc.nextInt();
        System.out.println("Time for country2?");
        t2 = sc.nextInt();
        System.out.println("Time for country3?");
        t3 = sc.nextInt();

        total1 = c1 * t1;
        total2 = c2 * t2;
        total3 = c3 * t3;

        System.out.println("Cost for call to country1 is" + total1);
        System.out.println("Cost for call to country2 is" + total2);
        System.out.println("Cost for call to country3 is" + total3);
        System.out.println("Total cost of calls = " + (total1 + total2 + total3));
        sc.close();

    }

}