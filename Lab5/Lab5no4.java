import java.util.Scanner;

public class Algorithms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();
        int numCols = scanner.nextInt();
        int areaSize = scanner.nextInt();
        int[][] city = new int[numRows][numCols];
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                city[row][col] = scanner.nextInt();
            }
        }
        int maxPeople = 0;
        for (int startRow = 0; startRow <= numRows - areaSize; startRow++) {
            for (int startCol = 0; startCol <= numCols - areaSize; startCol++) {
                int currentSum = 0;
                for (int i = 0; i < areaSize; i++) {
                    for (int j = 0; j < areaSize; j++) {
                        currentSum += city[startRow + i][startCol + j];
                    }
                }
                if (currentSum > maxPeople) {
                    maxPeople = currentSum;
                }
            }
        }
        System.out.println(maxPeople);
    }
}
