package Lab8;

public abstract class Employee {

    private String firstname;
    private String lastname;
    private String id;

    public Employee(String firstname, String lastname, String id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getId() {
        return id;
    }

    public abstract double earning();

    public abstract double bonus(int year);
}

class SalariedEmployee extends Employee {

    private double salary;

    public SalariedEmployee(String firstname, String lastname, String id, double sal) {
        super(firstname, lastname, id);
        this.salary = sal;
    }

    @Override
    public double earning() {
        return salary * 0.05;
    }

    @Override
    public double bonus(int year) {
        if (year > 5) {
            return salary * 12;
        } else {
            return salary * 6;
        }
    }
}

class ComEmployee extends Employee {

    private double grossSale;
    private double ComRate;

    public ComEmployee(String firstname, String lastname, String id, double sales, double percent) {
        super(firstname, lastname, id);
        this.grossSale = sales;
        this.ComRate = percent;
    }

    @Override
    public double earning() {
        return grossSale * ComRate;
    }

    @Override
    public double bonus(int year) {
        if (year > 5) {
            return grossSale * 6;
        } else {
            return grossSale * 3;
        }
    }
}
