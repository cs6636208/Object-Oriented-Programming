import java.util.Scanner;

public class Lab3no10 {
    private int count = 0;
    private int[][] N;
    private int[] M;
    public Scanner scanner = new Scanner(System.in);

    public Lab3no10(int n, int m) {
        this.N = new int[n][2];
        this.M = new int[m];
    }

    public int getCount() {
        return count;
    }

    public void AddPlane() {
        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < N[i].length; j++) {
                N[i][j] = scanner.nextInt();
            }
        }
    }

    public void AddLight() {
        for (int i = 0; i < M.length; i++) {
            M[i] = scanner.nextInt();
        }
    }

    public void CountNumberOfLight() {
        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if (N[i][0] < M[j] && M[j] < N[i][1]) {
                    count++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Lab3no10 light = new Lab3no10(n, m);
        light.AddPlane();
        light.AddLight();
        light.CountNumberOfLight();
        System.out.println(light.getCount());
    }
}