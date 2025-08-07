import java.util.ArrayList;

public class Employee {
    private String firstname;
    private String lastname;
    private String id;
    private double salary;

    public Employee(String firstname, String lastname, String id, double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.salary = salary;
    }

    public double earning() {
        return salary * 0.95;
    }

    public double bonus(int year) {
        if (year > 5) {
            return salary * 12;
        } else {
            return salary * 6;
        }
    }

    public static void printEmp(ArrayList<Employee> a, int year) {
        System.out.printf("%s %s %s %s\n", "First name", "Last name", "Earning", "Bonus");
        for (Employee e : a) {
            System.out.printf("%s %s %.2f %.2f\n", e.firstname, e.lastname, e.earning(), e.bonus(year));
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> arrayEarn = new ArrayList<>();
        Employee e1 = new Employee("Thongthat", "Lamthong", "001", 30000);
        Employee e2 = new Employee("Jame", "Bonn", "002", 40000);
        Employee e3 = new Employee("Lisa", "BlackPink", "003", 50000);

        arrayEarn.add(e1);
        arrayEarn.add(e2);
        arrayEarn.add(e3);

        int workingYears = 6;

        Employee.printEmp(arrayEarn, workingYears);
    }
}
