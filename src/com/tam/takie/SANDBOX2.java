package com.tam.takie;

import javax.swing.*;
import java.awt.*;

public class SANDBOX2 extends JFrame{

    JTable table;

    public SANDBOX2(){

        setLayout(new FlowLayout());

        String [] colNames = {"name", "eyecolor", "gender"};

        String [] [] data = {
                {"jguio", "jgkioe","juiofer"},
                {"jiogt", "fjioe", "jfior"},
        };

        table = new JTable(data, colNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 500));
        table.setFillsViewportHeight(true);

        JScrollPane scroll = new JScrollPane(table);
        add(scroll);

    }

    static public boolean isCellEditable (int row, int col){
        return false;
    }

    public static void main(String[] args) {
        SANDBOX2 gui = new SANDBOX2();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(600,200);
        gui.setVisible(true);
        gui.setTitle("costam");

        isCellEditable(0,0);

    }
}
