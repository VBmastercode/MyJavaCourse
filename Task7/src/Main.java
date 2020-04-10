import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String s1, s2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first string");
        s1 = sc.nextLine();
        System.out.println("Input second string");
        s2 = sc.nextLine();

        // methode 1

        int s1lenght = s1.length();
        int s2lenght = s2.length();

        for (int i = 0; i <= (s2lenght - s1lenght); i++) {
            String str3 = s2.substring(i, (i + s1lenght));
            if (str3.equals(s1)) {
                System.out.println(s2 + " <include> " + s1);
            }
        }

        // methode 2

        int index1 = -1;
        index1 = s2.indexOf(s1);
        if (index1 >= 0) {
            System.out.println(s2 + " <include> " + s1);
        } else {
            System.out.println(s2 + " <doesnt include> " + s1);
        }

        // names

        String sinit, sname, ssurname, smlname;

        System.out.println("Input surname name and middle name, please");
        sinit = sc.nextLine();

        String[] parts = sinit.split(" ");

        ssurname = parts[0];
        sname = parts[1];
        smlname = parts[2];

        System.out.println(ssurname + " " + sname.charAt(0) + "." + smlname.charAt(0));
        System.out.println(sname);
        System.out.println(sname + " " + smlname + " " + ssurname);

        // regex

        String sregname;
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");

        for (int i = 0; i < 6; i++) {
            System.out.println("Input name, please");
            sregname = sc.nextLine();
            Matcher m = p.matcher(sregname);

            if (m.matches()) {
                System.out.println("Name " + sregname + " is valid");
            } else {
                System.out.println("Oops, not valid name");
            }

        }
    }


}

