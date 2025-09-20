
import java.util.Scanner;

public class rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double w1 = sc.nextDouble();
        double h1 = sc.nextDouble();

        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double w2 = sc.nextDouble();
        double h2 = sc.nextDouble();

        double r1Left = x1 - w1 / 2;
        double r1Right = x1 + w1 / 2;
        double r1Top = y1 + h1 / 2;
        double r1Bottom = y1 - h1 / 2;

        double r2Left = x2 - w2 / 2;
        double r2Right = x2 + w2 / 2;
        double r2Top = y2 + h2 / 2;
        double r2Bottom = y2 - h2 / 2;

        if (r2Left >= r1Left && r2Right <= r1Right && r2Top <= r1Top && r2Bottom >= r1Bottom) {
            System.out.println("r2 is inside r1");
        } else if (r2Right > r1Left && r2Left < r1Right && r2Top > r1Bottom && r2Bottom < r1Top) {
            System.out.println("r2 is overlaps r1");
        } else {
            System.out.println("r2 doesn't overlaps r1");
        }
    }
}
