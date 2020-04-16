import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main (String[] args) {

        String[] sr = new String[10];
        String fileName = "test.txt";
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            int count = 1;
            System.out.println("Read data from file: " + fileName);
            while ((sr[count] = br.readLine()) != null) {
                System.out.println("row " + count + " read:" + sr[count]);
                count++;
            }
            br.close();
        } catch (Exception e) { e.printStackTrace(); }

        System.out.println();

        int z = 1; int maxln = sr[z].length(); int minln = sr[z].length(); int maxindx = 0; int minindx = 0;

        while ( sr[z] != null) {
            System.out.println("row " + z + " consist of " + sr[z].length() + " symbols");
            if (sr[z].length() >= maxln) {
                maxln = sr[z].length();
                maxindx = z;
            } else {
                if (sr[z].length() < minln) {
                    minln = sr[z].length();
                    minindx = z;
                }
            }

            int search = sr[z].indexOf("var");
            if (search >= 0) {
                System.out.println("row " + z + " include -var- ");
            }
            z++;
        }

        System.out.println("\nLongest row is " + maxindx + " Shortest row is " + minindx);

    }

}
