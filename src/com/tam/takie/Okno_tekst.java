package com.tam.takie;

import Homework_32760.email_veri2;

import javax.swing.*;
import java.awt.*;

public class Okno_tekst extends JFrame {

    private JLabel labby;
    private JButton przycisk;
    private JTextField field;

    public Okno_tekst() {   //contructor

        setIconImage(Toolkit.getDefaultToolkit().getImage(Okno_tekst.class.getResource("sonichead.png")));
        setLayout(new FlowLayout());

        labby = new JLabel("Wpisz co chcesz! Tak czy tak nie zadziala");
        add(labby);

        field = new JTextField("Tu wpisz");
        add(field);

        przycisk = new JButton("Nacisnij mnie!");
        add(przycisk);
    }

    public static void main (String[] args){
        Okno_tekst okno = new Okno_tekst();
        okno.setDefaultCloseOperation(EXIT_ON_CLOSE);
        okno.setSize(300, 300);
        okno.setVisible(true);
        okno.setTitle("Test Drugi");
    }
}
