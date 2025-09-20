import java.util.*;

public class PQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            names.add(sc.next());
            scores.add(sc.nextInt());
        }

        int option = sc.nextInt();
        sc.nextLine();

        ArrayList<String> commands = new ArrayList<>();

        for (int i = 0; i < option; i++) {
            commands.add(sc.nextLine().trim());
        }

        for(String cmd : commands) {
            switch(cmd) {
                case "SHOW":
                    for(int i = 0; i < names.size(); i++) {
                        System.out.println(names.get(i) + " " + scores.get(i));
                    }
                break;
                case "MAX":
                    int max = Integer.MIN_VALUE;
                    for(int score : scores) {
                        if(score > max) {
                            max = score;
                        }
                    }
                    System.out.println("Max=" + max);
                break;
                case "MIN":
                    int min = Integer.MAX_VALUE;
                    for(int score : scores) {
                        if(score < min) {
                            min = score;
                        }
                    }
                    System.out.println("Min=" + min);
                break;
                case "AVG":
                    int sum = 0;
                    for(int score : scores) {
                        sum += score;
                    }
                    double avg = (double)sum / scores.size();
                    System.out.printf("Avg=%.2f\n", avg);
                break;
                case "LOW": 
                    boolean foundLow = false;
                    for (int i = 0; i < scores.size(); i++) {
                        if(scores.get(i) < 50) {
                            System.out.println(names.get(i) + " " + scores.get(i));
                            foundLow = true;
                        }
                    }
                    if(!foundLow) {
                        System.out.println("None");
                    }
                break;
                case "MINNAME":
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
                break;
                default:
                    System.out.println("Invalid command: " + cmd);
                break;
            }
        }
    }
}
