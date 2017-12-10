package Homework_32760;

import java.util.Scanner;

public class Fibo {

    public static long a = 0, b = 1, c; //Sadly int gave up on iteration 47, poor int, replaced at such young age. And I have heard 40 is the new 30 :(
    public static int i;

    public static void series() {            //Please check out notes on the bottom for details about this method.
        System.out.println(i + ".  " + a);
        c = a + b;
        a = b;
        b = c;
    }

    public static void main(String[] args) {
        System.out.println("How many Fibonacci numbers would you like to calculate?");
        System.out.print("Please put the amount right here -->>> ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("You have entered " + k + ". You want to see " +k+ " numbers. Here goes! \n");

        System.out.println("Um, wait.. Last update so many cool features have been added! I mean.. just look!");
        System.out.println("Please choose which loop you would like to use for our calculations.");
        System.out.println("Availible choices are: for, while and do_while. Choose wisely.\n");
        System.out.print("Choice entry -->>>");
        Scanner menu = new Scanner(System.in);
        String wyborowa = menu.nextLine();
        System.out.println("\r\n");
        go_to:
        switch (wyborowa) {

            case "for":
                for (i = 0; i < k; i++) {
                    series();
                    System.out.println("\nThe program was extremly successful! Remember, there is no spoon.");
                    break;//TODO In this loop I'm getting an extra spoon text on start, why? :/

                }

            case "while":
                while (i < k) {
                    series();
                    i++;
                }
                System.out.println("\nThe program was extremly successful! Remember, there is no spoon.");
                break;

            case "do_while":
                do {
                    series();
                    i++;
                }
                while (i < k);
                System.out.println("\nThe program was extremly successful! Remember, there is no spoon.");
                break;

            default:
                System.out.println("BUONT ZKUADNI! (i.e. Syntax Error!\n");
                System.out.println("Sadly author couldn't figure out how to use break as goto, therefore program will exit :( \n)");
                break go_to;
        }

    }
}

/* The series() method*********************
* I was trying to figure it out for myself as advised, what I came up with was:
*   a  b
*   0  1
*   1  1
*   1  2
*   2  3
*   3  5
*   5  8
*   ..and so forth. In this form You can easily see how it works, based on that I came up with
*   a=a+b; and a=b;. After that I went to steal on the interwebs and I have learned the obvious.
*   Introduce the 3rd variable , DUH! Effects are visible in the method. I am feel like such a pirate..
 */