package org.ui;

import org.backend.Switchboard;
import org.ui.equals.Equals;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Main implements ActionListener{
    String action = "n";
    char[] cont;
    Switchboard db = new Switchboard();

    // Creating text-field
    JTextField field = new JTextField("Insert", 10);

    Main(){
        // Creating main frame
        JFrame jfrm = new JFrame("Bubble sort");

        // Setting layout
        jfrm.setLayout(new FlowLayout());

        // Setting size
        jfrm.setSize(new Dimension(200, 150));

        // Setting closing operation
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating all items
        // Creating labels
        JLabel up = new JLabel("Insert numbers to be sorted:");

        // Creating buttons
        JButton submit = new JButton("Submit");
        JButton number = new JButton("Numbers");
        JButton words = new JButton("Words");

        // Adding components to frame
        jfrm.add(up);
        jfrm.add(field);
        jfrm.add(number);
        jfrm.add(words);
        jfrm.add(submit);

        // Adding action listeners
        submit.addActionListener(this);
        number.addActionListener(this);
        words.addActionListener(this);

        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Submit")){
            if(action.equals("n")) {
                db.sort(field.getText(), action);
            }
        } else if (e.getActionCommand().equals("Numbers")) {
            action = "n";
        }else if (e.getActionCommand().equals("Words")) {
            action = "w";
        }
    }

    String[] toArray(String a){
        for (int i = 0; i < a.length(); i++) {

        }
    }

    public static void main(String[] args) {
        // Running program
        SwingUtilities.invokeLater(Main::new);
    }
}