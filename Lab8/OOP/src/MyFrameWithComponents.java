import javax.swing.*;

public class MyFrameWithComponents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MyFrameWithComponents");
        JButton jbtOK = new JButton("OK");
        frame.add(jbtOK);
        frame.getContentPane().add(new JButton("OKKKK"));
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}