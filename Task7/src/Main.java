import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        String s1,s2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first string");
        s1 = sc.nextLine();
        System.out.println("Input second string");
        s2 = sc.nextLine();

        int s1lenght = s1.length();
        int s2lenght = s2.length();

        for (int i = 0; i <= (s2lenght - s1lenght); i++) {
            String str3 = s2.substring(i,(i+s1lenght));
            if (str3.equals(s1) ) {
                System.out.println(s2 + " <include> " + s1);
            }
        }

    }
}
