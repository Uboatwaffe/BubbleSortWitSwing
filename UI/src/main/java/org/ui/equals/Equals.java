package org.ui.equals;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Equals {
    // Variables
    String equals = "";
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
}
