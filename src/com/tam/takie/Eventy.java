package com.tam.takie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eventy extends JFrame {
    private JLabel etykieta;
    private JButton przycisk;


    public Eventy(){                          //constructor
        setLayout(new FlowLayout());
        setIconImage(Toolkit.getDefaultToolkit().getImage(Eventy.class.getResource("sonichead.png")));

        przycisk = new JButton("Tu Naciskac");
        add(przycisk);

        etykieta = new JLabel("Nie bylo nacisniete!?");
        add(etykieta);

        event omg = new event ();
        przycisk.addActionListener(omg);
    }

    public class event implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) { //nie przeszkadza e?
            etykieta.setText("A teraz juz bylo...");
        }
    }
    public static void main (String [] args){
        Eventy gui = new Eventy();
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setTitle("Miernik Naciskania");
        gui.setSize(300, 300);
        gui.setVisible(true);
    }
}
