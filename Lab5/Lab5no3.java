import java.util.ArrayList;
import java.util.Scanner;

public class Lab5no3 {

    public static void intersect(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    System.out.print(list1.get(i) + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int num;

        while (true) {
            num = scanner.nextInt();
            if (num == 0)
                break;
            else
                list1.add(num);
        }

        while (true) {
            num = scanner.nextInt();
            if (num == 0)
                break;
            else
                list2.add(num);
        }

        intersect(list1, list2);
    }
}
