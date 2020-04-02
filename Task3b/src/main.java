import java.util.Scanner;

public class main {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;
        int y = 0;

        System.out.println("Hello. Input value for A please.");
        a = sc.nextInt();
        System.out.println("Input value for B please.");
        b = sc.nextInt();
        System.out.println("Input value for C please.");
        c = sc.nextInt();

        if ((a % 2) == 0) {
            y++;
        }
        if ((b % 2) == 0) {
            y++;
        }
        if ((c % 2) == 0) {
            y++;
        }

        System.out.println("Quantity of odd numbers is " + y);

        // day of week

        System.out.println("Input number of day of a week");

        switch (sc.nextInt()) {
            case 1:
                System.out.println("Monday, Понедельник, Lunes");
                break;
            case 2:
                System.out.println("Tuesday, Вторник, Martes");
                break;
            case 3:
                System.out.println("Wednesday, Среда, Miércoles");
                break;
            case 4:
                System.out.println("Thursday, Четверг, Jueves");
                break;
            case 5:
                System.out.println("Friday, Пятница, Viernes ");
                break;
            case 6:
                System.out.println("Saturday, Суббота, Sábado");
                break;
            case 7:
                System.out.println("Sunday, Воскресенье, Domingo");
                break;
        }

        // Countries and Continents

        String countryname;

        System.out.println("Input country`s name");
        sc.nextLine();
        countryname = sc.nextLine();

        Countries countries = Countries.valueOf(countryname);

        System.out.println("Country " + countryname + " located in " + countries.getContinent());

        // Products

        Product product = new Product("IBM", 1200, 10);
        Product product1 = new Product("DELL", 1000, 8);
        Product product2 = new Product("HP", 1100, 12);
        Product product3 = new Product("ASUS", 800, 20);

        if (product.getPrice() > product1.getPrice() && product.getPrice() > product2.getPrice() && product.getPrice() > product3.getPrice()) {
            System.out.println(product.getName() + " has the biggest price");
        } else if (product1.getPrice() > product.getPrice() && product1.getPrice() > product2.getPrice() && product1.getPrice() > product3.getPrice()) {
            System.out.println(product1.getName() + " has the biggest price");
        } else {
            if (product2.getPrice() > product.getPrice() && product2.getPrice() > product1.getPrice() && product2.getPrice() > product3.getPrice()) {
                System.out.println(product2.getName() + " has the biggest price");
            } else {
                System.out.println(product3.getName() + " has the biggest price");
            }
        }

        if (product.getQuantity() > product1.getQuantity() && product.getQuantity() > product2.getQuantity() && product.getQuantity() > product3.getQuantity()) {
            System.out.println(product.getName() + " has the biggest quantity");
        } else if (product1.getQuantity() > product.getQuantity() && product1.getQuantity() > product2.getQuantity() && product1.getQuantity() > product3.getQuantity()) {
            System.out.println(product1.getName() + " has the biggest quantity");
        } else {
            if (product2.getQuantity() > product.getQuantity() && product2.getQuantity() > product1.getQuantity() && product2.getQuantity() > product3.getQuantity()) {
                System.out.println(product2.getName() + " has the biggest quantity");
            } else {
                System.out.println(product3.getName() + " has the biggest quantity");
            }
        }

    }
}
