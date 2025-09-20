import java.util.ArrayList;
import java.util.Scanner;

public class PQ21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            names.add(sc.next());
            scores.add(sc.nextInt());
        }

        int option = sc.nextInt();
        ArrayList<String> command = new ArrayList<>(); // เก็บคำสั่ง command แต่ละตัว เช่น SHOW, AVG, MAX, MIN, ....
        for(int i = 0; i < option; i++) { // วนตามค่า option เช่น 4 ครั้ง
            command.add(sc.next()); // วนลูปรับค่าแล้วไป add ที่ command ArrayList
        }
        
        for(String cmd : command) {
            switch(cmd) {
                case "SHOW":
                    SHOW(names, scores);
                break;
                case "AVG":
                    AVG(scores);
                break;
                case "MIN":
                    MIN(scores);
                break;
                case "MAX":
                    MAX(scores);
                break;
                case "LOW":
                    LOW(names, scores);
                break;
                case "MINNAME":
                    MINNAME(names, scores);
                break;
            }
        }
    }
    public static void SHOW(ArrayList<String> names, ArrayList<Integer> scores) {
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " " + scores.get(i));
        }
    }
    public static void AVG(ArrayList<Integer> scores) {
        int sum = 0;
        for(int score : scores) {
            sum += score;
        }
        double avg = (double)sum / scores.size();
        System.out.printf("Avg=%.2f\n", avg);
    }
    public static void MIN(ArrayList<Integer> scores) {
        int min = Integer.MAX_VALUE;
        for(int score : scores) {
            if(score < min) {
                min = score;
            }
        }
        System.out.println("Min=" + min);
    }
    public static void MAX(ArrayList<Integer> scores) {
        int max = Integer.MIN_VALUE;
        for(int score : scores) {
            if(score > max) {
                max = score;
            }
        }
        System.out.println("Max=" + max);
    }
    public static void LOW(ArrayList<String> names, ArrayList<Integer> scores) {
        boolean Low = false;
        for (int i = 0; i < scores.size(); i++) {
            if(scores.get(i) < 50) {
                System.out.println(names.get(i) + " " + scores.get(i));
                Low = true;
            }
        }
        if(!Low) {
            System.out.println("None");
        }
    }
    public static void MINNAME(ArrayList<String> names, ArrayList<Integer> scores) {
        int minScore = Integer.MAX_VALUE;
        for(int score : scores) {
            if(score < minScore) {
                minScore = score;
            }
        }
        for(int i = 0; i < scores.size(); i++) {
            if(scores.get(i) == minScore) {
                System.out.println(names.get(i));
            }
        }
    }
}
