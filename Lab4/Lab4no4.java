import java.util.*;

public class AscendSortFreq {
    private double[] A;

    public AscendSortFreq(double[] A) {
        this.A = A;
    }

    public double[] AscendSort(double[] A) {
        double[] B = Arrays.copyOf(A, A.length);
        Arrays.sort(B);
        return B;
    }

    public void SortCommuFreq(double[] B) {
        int n = B.length;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (B[i] == B[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.print(" " + count);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] data = new double[n];
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextDouble();
        }
        AscendSortFreq sorter = new AscendSortFreq(data);
        double[] sorted = sorter.AscendSort(data);
        System.out.println("" + Arrays.toString(sorted));
        sorter.SortCommuFreq(sorted);

        scanner.close();
    }
}
