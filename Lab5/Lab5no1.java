import java.util.ArrayList;
import java.util.Scanner;

public class Lab5no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int number;

        do {
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            arr.add(number);
        } while (number != 0);

        System.out.println(Avg(arr));
        System.out.println(Max(arr));
        System.out.println(Min(arr));
        remove(arr);
    }

    public static double Avg(ArrayList<Integer> arr) {
        double sum = 0.0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum / arr.size();
    }

    public static int Max(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        return max;
    }

    public static int Min(ArrayList<Integer> arr) {
        int min = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        return min;
    }

    public static void remove(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 != 0) {
                System.out.print(arr.get(i) + " ");
            }
        }
    }
}