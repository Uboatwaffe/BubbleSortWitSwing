package org.ui.equals;

import java.awt.*;
import javax.swing.*;

public class Equals {
    // Variables
    static String equals = "";
    public Equals(){
        // Creating main frame
        JFrame frm = new JFrame("Equals");

        // Setting layout
        frm.setLayout(new FlowLayout());

        // Setting size
        frm.setSize(new Dimension(200, 150));

        // Setting closing operation
        frm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        // Creating labels
        JLabel up = new JLabel(equals);

        // Adding components to frame
        frm.add(up);

        // Showing frame
        frm.setVisible(true);
    }
    public static void setEquals(String[] a){
        for (String x:
             a) {
            equals += " " + x + " ";
        }
        equals = equals.trim();
        equals = equals.replace("0.0", "");
    }
    public static void clearEquals(){
        equals = " ";
    }
}
