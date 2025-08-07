import java.util.Scanner;

public class Lab3no5 {
    private int population;

    public Lab3no5(int initialSize) {
        this.population = initialSize;
    }

    public void waitCycles() {
        this.population = this.population * 2;
    }

    public void spray() {
        int reduction = (int) (this.population * 0.10);
        this.population = this.population - reduction;
    }

    public int getRoaches() {
        return this.population;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialPopulation = scanner.nextInt();
        int cycles = scanner.nextInt();
        Lab3no5 kitchen = new Lab3no5(initialPopulation);
        for (int i = 0; i < cycles; i++) {
            kitchen.waitCycles();
            kitchen.spray();
        }
        System.out.println(kitchen.getRoaches());
        scanner.close();
    }
}