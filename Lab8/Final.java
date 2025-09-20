package Lab8;

import java.util.ArrayList;

public class Final {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new SalariedEmployee("Thongthat", "Lamthong", "E1", 45000));
        employees.add(new SalariedEmployee("Thongthat1", "Lamthong1", "E2", 60000));

        employees.add(new ComEmployee("Jane", "Mckenna", "E3", 500000, 0.2));
        employees.add(new ComEmployee("Jame", "MckenU", "E4", 400000, 0.5));

        printEmp(employees);
    }

    public static void printEmp(ArrayList<Employee> a) {
        System.out.println("<-- SalariedEmployee -->");
        for (Employee emp : a) {

            if (emp instanceof SalariedEmployee) {
                System.out.printf("First Name %s Last Name %s Earning %.2f Bonus %.2f\n", emp.getFirstname(), emp.getLastname(), emp.earning(), emp.bonus(6));
            }
        }
        System.out.println();
        System.out.println("<-- ComEmployee -->");
        for (Employee emp : a) {
            if (emp instanceof ComEmployee) {
                System.out.printf("First Name %s Last Name %s Earning %.2f Bonus %.2f\n", emp.getFirstname(), emp.getLastname(), emp.earning(), emp.bonus(6));
            }
        }
    }
}
