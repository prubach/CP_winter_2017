package Homework_32760;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class email_veri2 extends JFrame{

    private JLabel label;
    private JButton button;
    /*static */private JTextField entry;
    private JLabel out;
    String email="ghhgh";



    public email_veri2()
    {

        setLayout(new FlowLayout());
        setIconImage(Toolkit.getDefaultToolkit().getImage(email_veri2.class.getResource("sonichead.png")));


        label = new JLabel("Please enter an e-mail to validate:");
        add(label);

        entry = new JTextField(30);
        add(entry);

        button = new JButton("Validate now!");
        add(button);

        out = new JLabel("");
        add(out);

        JFrame myFrame = this;

        button.addActionListener(new ActionListener() {  //fail start
            @Override
            public void actionPerformed(ActionEvent e) {

                String mail = entry.getText();

                out.setText(entry.getText());  //other way with
                JOptionPane.showMessageDialog(myFrame,"Got: " + entry.getText());  //with
                buttonPressed();
            }
        });


        System.out.println(email);

    }

    private void buttonPressed(){
        email=entry.getText();   //fail end
    }  //one way

    public static void main (String [] args)
    {
        email_veri2 gui= new email_veri2();
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setSize(400, 200);
        gui.setVisible(true);
        gui.setTitle("E-mail validator!");

        email_veri2 gui2= new email_veri2();
        gui2.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui2.setSize(400, 200);
        gui2.setVisible(true);
        gui2.setTitle("E-mail validator!");



    }





}
