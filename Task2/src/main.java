package task2;

public class main {

    public static void main (String[] args) {

        int TotalSalary;

        Employee employee1 = new Employee ("Victor",1000,10);
        Employee employee2 = new Employee ("Anna",900,8);
        Employee employee3 = new Employee ("Igor",1000,5);

        TotalSalary = employee1.getSalary() + employee2.getSalary() + employee3.getSalary();

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println("Total salary = " + TotalSalary);
    }
}