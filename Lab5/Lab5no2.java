import java.util.ArrayList;
import java.util.Scanner;

public class Star {
    public static void addStars(ArrayList<String> listword) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < listword.size(); i++) {
            String text = listword.get(i);
            list.add(text);
            list.add("*");
        }
        listword.clear();
        listword.addAll(list);
    }

    public static void removeStars(ArrayList<String> listword) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < listword.size(); i++) {
            String text = listword.get(i);
            if (!text.equals("*")) {
                list.add(text);
            }
        }
        listword.clear();
        listword.addAll(list);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        do {
            String input = scanner.nextLine();
            if (input.equals("1") || input.equals("2")) {
                if (input.equals("1")) {
                    addStars(list);
                } else {
                    removeStars(list);
                }
                System.out.println(list);
            } else {
                list.add(input);
            }
        } while (scanner.hasNextLine());
    }
}
