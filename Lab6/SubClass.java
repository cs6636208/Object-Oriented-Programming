
class Superclass {

    private int num = 1;

    protected int getNumber() {
        return num;
    }
}

class SubClass extends Superclass {

    private int num = 10;

    // overiding method
    protected int getNumbers() {
        return num + 5;
    }

    public static void main(String[] args) {
        SubClass s = new SubClass();
        System.out.println(s.getNumber());
    }
}