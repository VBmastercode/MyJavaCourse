public class Employee {

    private String name;
    private int department_number, salary;

    Employee (String name, int department_number, int salary) {
        this.name = name;
        this.department_number = department_number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartment_number() {
        return department_number;
    }

    public int getSalary() {
        return salary;
    }
}


