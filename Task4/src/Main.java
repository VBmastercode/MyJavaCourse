import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        int[] Arr1 = { 16, -20, 74, 37, -28, 63, 93, -54, 48, 61};

        int max = Arr1[0];
        int i = 0; int sump = 0; int ncount = 0;
        while (i < Arr1.length) {
            if (Arr1[i] > max) {
                max = Arr1[i];
            }
            if (Arr1[i] > 0) {
                sump = sump + Arr1[i];
            } else {ncount++;}

            i++;
        }

        if (ncount > (Arr1.length/2)) {
            System.out.println("Amount of negative numbers bigger then amount of positive ones");
        } else {
            System.out.println("Amount of positive numbers bigger then amount of negative ones");
        }

        System.out.print("Maximum = " + max + " Sum of positive numbers = " + sump + " Amount of negative numbers = " + ncount);
        System.out.println();

        // Employee

        Employee employee0 = new Employee( "Anna", 1,10000);
        Employee employee1 = new Employee( "Victor", 2,12000);
        Employee employee2 = new Employee( "Maxim", 2,11000);
        Employee employee3 = new Employee( "Svetlana", 3,9000);
        Employee employee4 = new Employee( "Oleg", 4,10500);

        int y = 0; int z = 0; int j = 0;
        Employee[] employeeclassname = {employee0, employee1, employee2, employee3, employee4};

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Input number of Department (1-4)");
        y = sc.nextInt();
        System.out.println("Employees of Department #" + y);
        sc.close();

        while (z < 5) {
            if (y == employeeclassname[z].getDepartment_number()) {
                System.out.println(employeeclassname[z].getName());
            }
            z++;
        }

        int[][] sort = new int[5][5];

        for (int l=0; l < 5; l++){
            sort[1][l] = employeeclassname[l].getSalary();
            sort[0][l] = l;
        }

        int tmp,tmp1;
        for (int m = 0; m < 4; m++) {
            for (int n = m + 1; n < 5; n++) {
                if (sort[1][m] < sort[1][n]) {
                    tmp = sort[1][m]; tmp1 = sort[0][m];
                    sort[1][m] = sort[1][n];sort[0][m] = sort[0][n];
                    sort[1][n] = tmp; sort[0][n] = tmp1;
                }
            }
        }

        System.out.println();

        for (int t = 0; t < 5; t++) {
            System.out.println(employeeclassname[sort[0][t]].getName() + " " + sort[1][t]);
        }

    }
}
