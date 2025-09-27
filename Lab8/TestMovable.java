
interface Movable {

    void moveUp();

    void moveDown();

    void moveLeft();

    void moveRight();
}

class MovablePoint implements Movable {

    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public String toString() {
        return "Point(" + x + "," + y + ") speed=(" + xSpeed + "," + ySpeed + ")";
    }

}

class MovableCircle implements Movable {

    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle(center=" + center.toString()
                + ", radius=" + radius + ")";
    }
}

public class TestMovable {

    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1, 2, 3, 4);
        System.out.println(point);
        point.moveUp();
        point.moveRight();
        System.out.println("After moving up and right: " + point);

        MovableCircle circle = new MovableCircle(5, 6, 1, 1, 10);
        System.out.println(circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println("After moving down and left: " + circle);
    }
}
