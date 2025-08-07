import java.util.Scanner;

class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

class ClosestPairFinder {
    private Point[] points;

    public ClosestPairFinder(Point[] points) {
        this.points = points;
    }

    public double findMinDistance() {
        double minDist = Double.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double dist = points[i].distanceTo(points[j]);
                if (dist < minDist) {
                    minDist = dist;
                }
            }
        }
        return minDist;
    }
}

public class ClosestPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Point[] points = new Point[n];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            double x = Double.parseDouble(input[0]);
            double y = Double.parseDouble(input[1]);
            points[i] = new Point(x, y);
        }

        ClosestPairFinder finder = new ClosestPairFinder(points);
        double minDistance = finder.findMinDistance();

        System.out.printf("%.2f\n", minDistance);

        scanner.close();
    }
}
