import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        //monthdays

        int[] dayofmonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int j,z;

        System.out.println("Input number of the month (1-12)");
        Scanner sc = new Scanner(System.in);
        z = sc.nextInt();
        j = z - 1;
        System.out.println("Total number of od days in month #" + z + " is " + dayofmonth[j] );

        //ten ints

        int[] arr1 = new int[10];

        for (int i = 0; i < 10; i++ ) {
            System.out.println("Input number of int variable #" + i);
            arr1[i] = sc.nextInt();
        }

        int sum5 = 0; boolean neg = false;

        for (int i = 0; i < 5; i++) {
            if (arr1[i] < 0 ) {
                neg = true;
                break;  }
            sum5 = sum5 + arr1[i];
        }

        if (neg == true) {
            int product = 1;
            for (int i = 5; i < 10; i++) {
                if (arr1[i] > 0) {product = product * arr1[i];}}
            System.out.println("Product of last 5 = " + product);
        } else {
            System.out.println("Sum of first 5 = " + sum5);
        }

    }
}
