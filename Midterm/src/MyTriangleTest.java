import java.util.Scanner;

class MyTriangle {
    public boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3);
    }

    public double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
}

public class MyTriangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        MyTriangle triangle = new MyTriangle();
        if (triangle.isValid(side1, side2, side3)) {
            System.out.printf(String.format("%.2f", triangle.area(side1, side2, side3)));
        } else {
            System.out.println(0);
        }
    }
}