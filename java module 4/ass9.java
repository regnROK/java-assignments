import javax.swing.*;
import java.awt.*;

class ass9 {
    private static void buildButton(String value, Color color, JPanel toAdd) {
        JButton button = new JButton(value);
        button.setForeground(color);
        toAdd.add(button);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Assignment 9");
        frame.setSize(600, 600);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buildButton("BLUE", Color.BLUE, buttonPanel);
        buildButton("ORANGE", Color.ORANGE, buttonPanel);
        buildButton("RED", Color.RED, buttonPanel);
        buildButton("GREEN", Color.GREEN, buttonPanel);
        buildButton("MAGENTA", Color.MAGENTA, buttonPanel);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        mainPanel.add(new JButton("NORTH"), BorderLayout.NORTH);
        mainPanel.add(new JButton("WEST"), BorderLayout.WEST);
        mainPanel.add(new JButton("EAST"), BorderLayout.EAST);
        mainPanel.add(new JLabel("CENTER"), BorderLayout.CENTER);

        frame.setContentPane(mainPanel);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}