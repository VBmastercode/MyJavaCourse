package task2;

public class Employee {

    private String name;
    private int rate;
    private int hours;
    int Salary;
    Double Bonuses;


    public static int totalSum;

    public Employee () {}

    public Employee (String name, int rate ) {
        this.name = name;
        this.rate = rate;
    }

    public Employee (String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public int getSalary () {
        this.Salary = rate*hours;
        return Salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + ", salary=" + Salary + "]";
    }

    public int changeRate (int rate) {
        this.rate = rate;
        this.Salary = rate*hours;
        return Salary;
    }

    public double getBonuses () {
        this.Bonuses = Salary*0.1;
        return Bonuses;
    }

}