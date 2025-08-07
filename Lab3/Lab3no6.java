import java.util.Scanner;

public class Lab3no6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        scanner.close();
        String cleanedText = text1.replaceAll("[^a-zA-Z]", "").toUpperCase();
        System.out.println((isPalindrome(cleanedText) ? 0 : 1));
    }

    public static boolean isPalindrome(String s) {
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}