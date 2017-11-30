package pl.waw.sgh;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateOperations {

    public static void main(String[] args) {
        Long startMillis = System.currentTimeMillis();
        Date date = new Date();
        System.out.println(date);
//1512040920239
        System.out.println(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        boolean success = false;
        Date outDate = null;
        while (!success) {
            try {
                //String inDate = null;
                String inDate = JOptionPane.showInputDialog(null,
                       "Please provide a date:");
                outDate = sdf2.parse(inDate);

                // Add 10 days to the date provided
                Calendar c = Calendar.getInstance();
                c.setTime(outDate);
                c.add(Calendar.DATE, 10);
                outDate = c.getTime();
                //
                success = true;
            } catch (ParseException|NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Can't interpret the provided date, please try again");
                e.printStackTrace();
            } /*catch (NullPointerException ne) {
                JOptionPane.showMessageDialog(null, "oops....");
            }*/
        }
        JOptionPane.showMessageDialog(null, "Success, your date: " + sdf.format(outDate));
        Long stopMillis = System.currentTimeMillis();
        JOptionPane.showMessageDialog(null, "Thank you it took: " + (stopMillis-startMillis) +" ms");

    }
}
