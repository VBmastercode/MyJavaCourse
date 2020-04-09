import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        //monthdays -----------------------------------------------------

        int[] dayofmonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int j,z;

        System.out.println("Input number of the month (1-12)");
        Scanner sc = new Scanner(System.in);
        z = sc.nextInt();
        j = z - 1;
        System.out.println("Total number of od days in month #" + z + " is " + dayofmonth[j] );

        //ten ints -----------------------------------------------------

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

        // 5 int ----------------------------------------------------

        int[] arr2 = new int[5]; int b = 0; int secndposind = 0;

        for (int i = 0; i < 5; i++ ) {
            System.out.println("Input number of int variable #" + i);
            arr2[i] = sc.nextInt();
        }

        int arrmin = arr2[0]; int minindx = 0;

        for (int i = 0; i < 4; i++ ) {
            if (arrmin > arr2[i+1]) { arrmin = arr2[i]; minindx = i;}
            if (arr2[i] > 0 ) {b++;}
            if ( b == 2) { secndposind = i;}
            }

        System.out.println("Second positive integer position is " + secndposind);
        System.out.println("Min value = " + arrmin + " position #" + minindx);

        // sorting

        int tmp; int negind = 0;

        for (int i = 0; i < 5; i++) {
            if (arr2[i] < 0){negind = i; break;}
        }

            for (int i = 0; i < negind - 1; i++) {
            for (int y = i + 1; y < arr2.length; y++) {
                if (arr2[i] < arr2[y]) {
                    tmp = arr2[i];
                    arr2[i] = arr2[y];
                    arr2[y] = tmp;
                }
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        int product = 1;
        for (int i = 0; i < 5; i++) {
            if ((arr2[i] % 2) == 0) {product = product * arr2[i];}}
        System.out.println("Product = " + product);

        // Car ----------------------------------------------------------------

        Car car0 = new Car("Coupe", 2007, 2000);
        Car car1 = new Car("Sedan", 1995, 1600);
        Car car2 = new Car("PickUp", 2012, 3000);
        Car car3 = new Car("Van", 2012, 2500);

        Car[] carclassname = {car0, car1, car2, car3};

        int yearnum;
        System.out.println("Input year of production");
        yearnum = sc.nextInt();

        for (int i = 0; i < 4; i++) {
            if (yearnum == carclassname[i].getYear()) {
                System.out.println(carclassname[i]);
            }
        }

        System.out.println();

        Car tmp1;

        for (int i = 0; i < 3; i++) {
            for (int y = i + 1; y < 4; y++) {
                if (carclassname[i].getYear() < carclassname[y].getYear()) {
                    tmp1 = carclassname[i];
                    carclassname[i] = carclassname[y];
                    carclassname[y] = tmp1;
                }
            }
        }

        for (int i = 0; i < carclassname.length; i++) {
            System.out.println(carclassname[i]);
        }

        sc.close();

    }

}
