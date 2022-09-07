package com.javacourseyt.GUI;

import javax.swing.JOptionPane;
import com.javacourseyt.Utility.Common;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        Integer age = null;
        while (age == null) {
            age = Common.tryParseInt(JOptionPane.showInputDialog("Enter your age"));
            if (age instanceof Integer) {
                JOptionPane.showMessageDialog(null, "You are " + age + " years old");
            } else {
                JOptionPane.showMessageDialog(null, Common.GetErrorMessage());
            }
        }

        Double height = null;
        while (height == null) {
            height = Common.tryParseDouble(JOptionPane.showInputDialog("Enter your height"));
            if (height instanceof Double) {
                JOptionPane.showMessageDialog(null, "You are " + height + " inches tall");
            } else {
                JOptionPane.showMessageDialog(null, Common.GetErrorMessage());
            }
        }
    }
}
