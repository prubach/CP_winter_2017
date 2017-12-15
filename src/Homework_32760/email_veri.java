package Homework_32760;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email_veri {

    public static void main (String[] args){



        Scanner scanny = new Scanner(System.in);
        System.out.println("Please put in e-mail you would like to check");
        System.out.print("Right here ->>>");

        String email = scanny.nextLine();

        System.out.println("You put in: ");
        System.out.println(email);

        Pattern ofmail = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher ofmatch = ofmail.matcher(email);

        if (ofmatch.matches()) {

            System.out.println("It's a mail!");
        }
        else {
            System.out.println("FAIL!");
        }
    }

}

