import java.awt.*;
import javax.swing.*;

public class ShowColors extends JFrame {

    public ShowColors() {
        super("Using Colours");

        // Set up the frame
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a custom panel for drawing
        add(new ColorPanel());

        setVisible(true);
    }

    // Custom JPanel with overridden paintComponent method
    class ColorPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Set color using RGB integers
            g.setColor(new Color(255, 0, 0));
            g.fillRect(25, 25, 100, 20);
            g.drawString("Current RGB: " + g.getColor(), 130, 40);

            // Set color using RGB floats
            g.setColor(new Color(0.0f, 1.0f, 0.0f));
            g.fillRect(25, 50, 100, 20);
            g.drawString("Current RGB: " + g.getColor(), 130, 65);

            // Set color using predefined Color constant
            g.setColor(Color.BLUE);
            g.fillRect(25, 75, 100, 20);
            g.drawString("Current RGB: " + g.getColor(), 130, 90);
        }
    }

    public static void main(String[] args) {
        new ShowColors();
    }
}
