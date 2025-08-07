import java.util.ArrayList;

public class Lab5no5 {
    private String firstname;
    private String lastname;
    private String id;
    private double salary;

    public Lab5no5(String firstname, String lastname, String id, double salary) {
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

    public static void printEmp(ArrayList<Lab5no5> a, int year) {
        System.out.printf("%s %s %s %s\n", "First name", "Last name", "Earning", "Bonus");
        for (Lab5no5 e : a) {
            System.out.printf("%s %s %.2f %.2f\n", e.firstname, e.lastname, e.earning(), e.bonus(year));
        }
    }

    public static void main(String[] args) {
        ArrayList<Lab5no5> arrayEarn = new ArrayList<>();
        Lab5no5 e1 = new Lab5no5("Thongthat", "Lamthong", "001", 30000);
        Lab5no5 e2 = new Lab5no5("Jame", "Bonn", "002", 40000);
        Lab5no5 e3 = new Lab5no5("Lisa", "BlackPink", "003", 50000);

        arrayEarn.add(e1);
        arrayEarn.add(e2);
        arrayEarn.add(e3);

        int workingYears = 6;

        Lab5no5.printEmp(arrayEarn, workingYears);
    }
}
