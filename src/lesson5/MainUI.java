package lesson5;

import javax.swing.*;

public class MainUI {
    public static void main(String[] args) {
        JTextArea text = new JTextArea(40,40);
        text.setText("Hello! Put your image here");

        JFrame frame = new JFrame();
        frame.setTitle("Hello, Java!");
        frame.setSize(640,480);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(text);
        frame.setVisible(true);

    }
}
