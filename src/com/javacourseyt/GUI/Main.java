package com.javacourseyt.GUI;

import javax.swing.JOptionPane;
import com.javacourseyt.Utility.Common;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Common.tryParseInt(JOptionPane.showInputDialog("Enter your age"));
        if (age > 0) {
            JOptionPane.showMessageDialog(null, "You are " + age + " years old");
        } else {
            JOptionPane.showMessageDialog(null, Common.ERROR_MESSAGE);
        }

        double height = Common.tryParseDouble(JOptionPane.showInputDialog("Enter your height"));
        if (height > 0.0) {
            JOptionPane.showMessageDialog(null, "You are " + height + " inches tall");
        } else {
            JOptionPane.showMessageDialog(null, Common.ERROR_MESSAGE);
        }
    }
}
