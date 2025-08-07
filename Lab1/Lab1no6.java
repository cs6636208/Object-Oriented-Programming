// ข้อ 6
import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input number of columns and rows: ");
        int maxColumns = input.nextInt();
        int maxRows = input.nextInt();
        System.out.printf("%4s", ""); 
        for (int col = 2; col <= maxColumns; col++) {
            System.out.printf("%4d", col); 
        }
        System.out.println(); 
        System.out.print("----"); 
        for (int col = 2; col <= maxColumns; col++) {
            System.out.print("----"); 
        }
        System.out.println();
        for (int row = 2; row <= maxRows; row++) {
            System.out.printf("%4d", row); 
            for (int col = 2; col <= maxColumns; col++) {
                System.out.printf("%4d", row * col);
            }
            System.out.println(); 
        }
        input.close();
    }
}