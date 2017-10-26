package pl.waw.sgh;

import java.util.Scanner;

public class EmailCheck {
    public static void main(String[] args) {
        final String EMAIL_OK = "user@sgh.pl";
        final String EMAIL_NOT_OK1 = "@sgh.pl";

        String email = EMAIL_NOT_OK1;

        System.out.print("Please provide email: ");
        String input = new Scanner(System.in).nextLine();
        System.out.println("Got: " + input);

    }
}
