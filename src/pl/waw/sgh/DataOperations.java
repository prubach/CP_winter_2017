package pl.waw.sgh;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataOperations {

    public static void main(String[] args) {

        Long startMillis = System.currentTimeMillis();

        Date date = new Date();
        System.out.println(date);

        System.out.println(System.currentTimeMillis());



        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd GG:mm:ss");
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);


        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        boolean success = false;
        Date outDate = null;

        while (!success) {
            try {
             //String inDate = null;

                String inDate = JOptionPane.showInputDialog(null, "Please provide a date: ");
                outDate = sdf2.parse(inDate);

               Calendar c = Calendar.getInstance();
               c.setTime(outDate);
               c.add(Calendar.DATE, 10);
               outDate = c.getTime();



                success = true;

            } catch (ParseException|NullPointerException e) {   //LOOK, two exceptions!
                JOptionPane.showMessageDialog(null, "Can't interpret the provided date, please try again");
                e.printStackTrace();
            }

       /*     catch (NullPointerException ne) {
                JOptionPane.showMessageDialog(null, "oops...");*/
            }
        JOptionPane.showMessageDialog(null, "yay");
        long stopMillis = System.currentTimeMillis();
        JOptionPane.showMessageDialog(null, "Thank you");
        }

    }
// LOOK it up online!!!!
