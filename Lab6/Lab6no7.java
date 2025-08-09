class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean contains(double x, double y) {
        double x1 = this.x - width / 2;
        double x2 = this.x + width / 2;
        double y1 = this.y + height / 2;
        double y2 = this.y - height / 2;
        if (x >= x1 && x <= x2 && y >= y2 && y <= y1) {
            return true;
        }
        return false;
    }

    public boolean contains(MyRectangle2D r) {
        double x1 = this.x - width / 2;
        double x2 = this.x + width / 2;
        double y1 = this.y + height / 2;
        double y2 = this.y - height / 2;
        double rx1 = r.x - r.width / 2;
        double rx2 = r.x + r.width / 2;
        double ry1 = r.y + r.height / 2;
        double ry2 = r.y - r.height / 2;

        if (rx1 >= x1 && rx1 <= x2 && rx2 >= x1 && rx2 <= x2 && ry1 <= y1 && ry1 >= y2 && ry2 <= y1 && ry2 >= y2) {
            return true;
        }
        return false;
    }

    public boolean overlaps(MyRectangle2D r) {
        double x1 = this.x - width / 2;
        double x2 = this.x + width / 2;
        double y1 = this.y + height / 2;
        double y2 = this.y - height / 2;
        double rx1 = r.x - r.width / 2;
        double rx2 = r.x + r.width / 2;
        double ry1 = r.y + r.height / 2;
        double ry2 = r.y - r.height / 2;

        if ((rx1 >= x1 && rx1 <= x2) || (rx2 >= x1 && rx2 <= x2)) {
            if ((ry1 <= y1 && ry1 >= y2) || (ry2 <= y1 && ry2 >= y2)) {
                return true;
            }
        }
        return false;
    }
}

public class Lab6no7 {
    public static void main(String args[]) {
        // กำหนดขนาดสี่เหลี่ยมผืนผ้า
        MyRectangle2D MainreRectangle2D = new MyRectangle2D(2.5, 4, 2.5, 43);

        // เช็คว่าถ้ามีจุด point (x, y) อยู่ภายในสี่เหลี่ยม
        System.out.println(MainreRectangle2D.contains(1.5, 3.0));
        System.out.println(MainreRectangle2D.contains(15, 25));
        System.out.println("---------------------------------------");

        // เช็คว่าถ้ามีสี่เหลี่ยม rectangle อยู่ภายในสี่เหลี่ยม
        // สร้างสี่เหลี่ยมขึ้นมาเพื่อเช็คกับสี่เหลี่ยม MainreRectangle2D
        MyRectangle2D SM1 = new MyRectangle2D(1.5, 5, 0.5, 3);
        MyRectangle2D OS1 = new MyRectangle2D(4, -12, 7, 32);

        System.out.println(MainreRectangle2D.contains(SM1));
        System.out.println(MainreRectangle2D.contains(OS1));
        System.out.println("---------------------------------------");

        MyRectangle2D PO1 = new MyRectangle2D(0, 0, 4, 2);
        MyRectangle2D IO1 = new MyRectangle2D(5, 10, 3, 32);

        // เช็คว่าถ้ามีสี่เหลี่ยม rectangle ที่มีบางส่วนซ้อนทับกัน
        // สร้างสี่เหลี่ยมขึ้นมาเพื่อเช็คกับสี่เหลี่ยม MainreRectangle2D
        System.out.println(MainreRectangle2D.overlaps(PO1));
        System.out.println(MainreRectangle2D.overlaps(IO1));
    }
}