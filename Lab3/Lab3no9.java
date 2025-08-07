import java.util.Scanner;

public class Lab3no9 {
    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0;
    }

    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;
    }

    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
        return onTheSameLine(x0, y0, x1, y1, x2, y2) && (x2 >= Math.min(x0, x1) && x2 <= Math.max(x0, x1)
                && y2 >= Math.min(y0, y1) && y2 <= Math.max(y0, y1));
    }

    public static boolean RightOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) < 0;
    }

    public static void main(String[] args) {
        double x0, y0, x1, y1, x2, y2;
        Scanner scanner = new Scanner(System.in);
        x0 = scanner.nextDouble();
        y0 = scanner.nextDouble();
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        scanner.close();
        if (Lab3no9.leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
            System.out.println(2);
        } else if (Lab3no9.onTheSameLine(x0, y0, x1, y1, x2, y2)) {
            System.out.println(0);
        } else if (Lab3no9.RightOfTheLine(x0, y0, x1, y1, x2, y2)) {
            System.out.println(1);
        } else if (Lab3no9.onTheLineSegment(x0, y0, x1, y1, x2, y2)) {
            System.out.println(3);
        }
    }
}
