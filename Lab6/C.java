class A {
    public A() {
        System.out.println("The no-arg constructor of A is invoked");
    }
}

class B extends A {
    public B() {
    }
}

public class C {
    public static void main(String[] args) {
        B b = new B();
    }
}