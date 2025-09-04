
class Fruit {

}

class Apple extends Fruit {

    void makeApple() {
        System.out.println("Making apple...");
    }
}

class Orange extends Fruit {

    void makeOrangeJuice() {
        System.out.println("Making orange juice...");
    }
}

class GoldenDelicious extends Apple {

}

class Mcintosh extends Apple {

}

public class Lab7no3 {

    public static void main(String[] args) {
        Fruit fruit = new GoldenDelicious();
        Orange orange = new Orange();

        System.out.println(fruit instanceof Orange);
        System.out.println(fruit instanceof Apple);
        System.out.println(fruit instanceof GoldenDelicious);
        System.out.println(fruit instanceof Mcintosh);
        System.out.println(orange instanceof Orange);
        System.out.println(orange instanceof Fruit);
        // System.out.println(orange instanceof Apple); // ไม่ใช่ เพราะ Orange กับ Apple ไม่มีความสัมพันธ์กัน

        // 8. Can fruit invoke this method? makeApple()
        // fruit.makeApple(); เรียกใช้ไม่ได้ เพราะ fruit เป็นประเภท Fruit ไม่ใช่ Apple ต้อง Casting เป็น Apple ก่อน
        ((Apple) fruit).makeApple(); // Casting fruit to Apple now we can call makeApple()
        // Can orange invoke this method? makeApple()
        // orange.makeApple(); // เรียกใช้ไม่ได้ เพราะ orange เป็นประเภท Orange ไม่ใช่ Apple ต้อง Casting เป็น Apple ก่อน
        // 9. Can orange invoke this method? makeOrangeJuice()
        orange.makeOrangeJuice();
        // Can fruit invoke this method? makeOrangeJuice()
        // fruit.makeOrangeJuice(); // เรียกใช้ไม่ได้ เพราะ fruit เป็นประเภท Fruit ไม่ใช่ Orange ต้อง Casting เป็น Orange ก่อน
    }
}
