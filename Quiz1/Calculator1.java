
import java.awt.*;
import javax.swing.*;

public class Calculator1 extends JFrame {

    public Calculator1() {
        JPanel c1 = new JPanel();
        c1.setLayout(new GridLayout(5, 4, 5, 5));

        String[] displ = {"c", "()", "%", "/",
            "7", "8", "9", "*",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "+/-", "0", ".", "="};
        add(c1, BorderLayout.CENTER);

        for (String s : displ) {
            c1.add(new JButton("" + s));
        }

        JTextField textfield = new JTextField();
        textfield.setEditable(false);
        textfield.setHorizontalAlignment(JTextField.LEFT);
        textfield.setPreferredSize(new Dimension(0, 40));
        textfield.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(textfield, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        Calculator1 frame = new Calculator1();
        frame.setTitle("Calculator");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
