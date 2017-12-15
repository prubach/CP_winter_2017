package com.tam.takie;

import javax.swing.*;
import java.awt.*;

public class Okno extends JFrame{

    public Okno() {

        setIconImage(Toolkit.getDefaultToolkit().getImage(Okno.class.getResource("sonichead.png")));
    }

    public static void main (String [] args){

        Okno gui = new Okno();

        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);

        gui.setSize(300,300);

        gui.setVisible(true);

        gui.setTitle("Okno_ONE");

     /*   gui.setIconImage(new ImageIcon(getClass() .getResource("sonicicon1.png")).getImage());*/

    }


}
