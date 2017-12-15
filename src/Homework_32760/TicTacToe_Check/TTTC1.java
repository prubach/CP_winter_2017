package Homework_32760.TicTacToe_Check;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TTTC1 {

    public static void main(String[] args) throws FileNotFoundException, NumberFormatException{

        String fileloc = "C:\\JAVA\\ttt2.csv";

        File myFile = new File(fileloc);

        Scanner scanny = new Scanner(myFile);

        String newLine = scanny.nextLine();

        String [] eMatrix = newLine.split(",");

        String aa = eMatrix[0];
        int iaa = Integer.parseInt(aa);

        System.out.println(iaa);
    }
}
