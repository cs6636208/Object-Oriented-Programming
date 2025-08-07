class Complex1 {
    private double r, i;

    Complex1(double r, double i) {
        this.r = r;
        this.i = i;
    }

    Complex1(Complex1 c) {
        this(c.r, c.i);
    }

    public void add(Complex1 c) {
        r += c.r;
        i += c.i;
    }

    public void sub(Complex1 c) {
        r -= c.r;
        i -= c.i;
    }

    public void mul(Complex1 c) {
        double tempr = ((this.r * c.r) - (this.i * c.i));
        double tempi = ((this.r * c.i) + (this.i * c.r));
        this.r = tempr;
        this.i = tempi;
    }

    public void divide(Complex1 c) {
        double tempr = (this.r * c.r + this.i * c.i) / ((c.r * c.r) + (c.i * c.i));
        double tempi = (this.i * c.r - this.r * c.i) / ((c.r * c.r) + (c.i * c.i));
        this.r = tempr;
        this.i = tempi;
    }

    public void print() {
        System.out.println(r + " " + i + "i");
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setI(double i) {
        this.i = i;
    }

}

public class Lab2no1 {
    public static void main(String args[]) {
        Complex1 a = new Complex1(1.0, 2.0);// 1+2i
        Complex1 b = new Complex1(3.0, 4.0);// 3+4i
        Complex1 c = new Complex1(a);
        c.add(b);
        c.print();
        c.setR(1.0);
        c.setI(2.0);
        c.sub(b);
        c.print();
        c.setR(1.0);
        c.setI(2.0);
        c.mul(b);
        c.print();
        c.setR(1.0);
        c.setI(2.0);
        c.divide(b);
        c.print();
    }
}