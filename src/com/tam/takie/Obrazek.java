package com.tam.takie;

import javax.swing.*;
import java.awt.*;

public class Obrazek extends JFrame {

    private ImageIcon obraz1;
    private JLabel etykieta1;
    private ImageIcon obraz2;
    private JLabel etykieta2;
    private ImageIcon obraz3;
    private JLabel etykieta3;

    Obrazek () {

        setLayout(new FlowLayout());

        obraz1 = new ImageIcon(getClass().getResource("sonicicon1.png"));
        etykieta1 = new JLabel(obraz1);
        add(etykieta1);

        obraz2 = new ImageIcon(getClass().getResource("sonicgold.png"));
        etykieta2 = new JLabel(obraz2);
        add(etykieta2);

        obraz3 = new ImageIcon(getClass().getResource("sonichead.png"));
        etykieta3 = new JLabel(obraz3);
        add(etykieta3);

    }
    public static void main (String[] args){
        Obrazek gui = new Obrazek();
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setTitle("Obrazki");
        gui.pack();
    }
}
