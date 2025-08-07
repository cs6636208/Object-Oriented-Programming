import java.util.Scanner;

public class RoachPopulation1 {
    private int population;

    public RoachPopulation1(int initialSize) {
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
        RoachPopulation1 kitchen = new RoachPopulation1(initialPopulation);
        for (int i = 0; i < cycles; i++) {
            kitchen.waitCycles();
            kitchen.spray();
        }
        System.out.println(kitchen.getRoaches());
        scanner.close();
    }
}