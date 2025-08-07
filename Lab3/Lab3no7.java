import java.util.Scanner;

public class Lab3no7 {
    public boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3);
    }

    public double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lab3no7 triangle1 = new Lab3no7();
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        if (triangle1.isValid(side1, side2, side3)) {
            System.out.println(String.format("%.2f", triangle1.area(side1, side2, side3)));
        } else {
            System.out.println("0");
        }

        scanner.close();
    }
}
