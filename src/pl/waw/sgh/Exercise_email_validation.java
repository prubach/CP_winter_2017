package pl.waw.sgh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_email_validation {
    public static void main(String[] args) {
        final String EMAIL_OK = "user@sgh.pl";
        final String EMAIL_NOT_OK = "@sgh.pl";




        String email = EMAIL_OK;

        Pattern pattern = Pattern.compile(".+@.+\\.[a-z]+");

        Matcher mat = pattern.matcher(email);


        if (mat.matches()) {
            System.out.println("It's a mail!");
        } else {
            System.out.println("nope");


        }
    }
}

/*
PUT INPUT AT HOME~~~~~~*/
