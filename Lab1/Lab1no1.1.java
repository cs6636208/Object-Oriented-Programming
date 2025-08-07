// ข้อ 1
import javax.swing.JOptionPane;

public class TemperatureC1 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(
            null,
            "Enter temperature in Fahrenheit:",
            "Fahrenheit to Celsius",
            JOptionPane.QUESTION_MESSAGE
        );
        double fahrenheit = Double.parseDouble(input);
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        String message = fahrenheit + "°F = " + String.format("%.2f", celsius) + "°C";
        JOptionPane.showMessageDialog(null, message, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
