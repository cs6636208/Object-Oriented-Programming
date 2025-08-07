public class TestProgram {
    public static void main(String[] args) {
        System.out.println(g("A"));
    }

    public static String f() {
        System.out.println("A");
        return "A";
    }

    public static String g(String s) {
        return f() + s;
    }
}