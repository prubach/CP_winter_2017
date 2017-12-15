package pl.waw.sgh;

import javax.swing.*;


//
///*input to swing*/
//
//public class guiInput {
//
//    public static void main(String[] args) {
//
//        String input = JOptionPane.showInputDialog(null, "Please provide your name");
//
//        JOptionPane.showMessageDialog(null, "Hello!");
//
//        int decision = JOptionPane.showConfirmDialog(null, "Do you want to continue?");
//        JOptionPane.showMessageDialog(null, "Your decission is: "+ decision);
//
//    }
//}



/*on*/




/*input to swing*/

public class guiInput {

    public static void main(String[] args) {

        int decision = JOptionPane.YES_OPTION;

        while (decision != JOptionPane.NO_OPTION) {

            String input = JOptionPane.showInputDialog(null, "Please provide your name");

            JOptionPane.showMessageDialog(null, "Hello! "+input);

            decision = JOptionPane.showConfirmDialog(null, "Do you want to continue?");
            JOptionPane.showMessageDialog(null, "Your decission is: " + decision);

        }
    }}

