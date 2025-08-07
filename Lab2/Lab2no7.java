import java.util.Scanner;

public class Lab2no7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double w1 = scanner.nextDouble();
        double h1 = scanner.nextDouble();

        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double w2 = scanner.nextDouble();
        double h2 = scanner.nextDouble();

        double r1Lft = x1 - w1 / 2;
        double r1Rgt = x1 + w1 / 2;
        double r1Top = y1 + h1 / 2;
        double r1Btm = y1 - h1 / 2;

        double r2Lft = x2 - w2 / 2;
        double r2Rgt = x2 + w2 / 2;
        double r2Top = y2 + h2 / 2;
        double r2Btm = y2 - h2 / 2;

        if (r2Lft >= r1Lft && r2Rgt <= r1Rgt &&
                r2Top <= r1Top && r2Btm >= r1Btm) {
            System.out.println("r2 is inside r1");
        } else if (r2Rgt > r1Lft && r2Lft < r1Rgt &&
                r2Top > r1Btm && r2Btm < r1Top) {
            System.out.println("r2 overlaps r1");
        } else {
            System.out.println("r2 doesn't overlap r1");
        }

        scanner.close();
    }
}
