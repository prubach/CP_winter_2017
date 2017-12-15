package Homework_32760.TicTacToe_Check;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TTTC {

    //static String FILE_LOC = "c:\\JAVA\\ttt2.csv";

    static String FILE_LOC = File.separator + "JAVA" + File.separator + "ttt2.csv";

    static int matrix [] [];
    static int rowz =0;
    static int [] sumHor = new int[3];
    static int [] sumVer = new int[3];
    static int sumDiag1;
    static int sumDiag2;


    public static void main(String[] args) throws FileNotFoundException {
        matrix = new int[3][3];   //TODO figure out how to automatically size the array to amount of rows and collumns csv has.. or ask?

        File entryFile = new File(FILE_LOC);
        Scanner scanny = new Scanner(entryFile);

        while (scanny.hasNextLine()) {

            String line = scanny.nextLine();

            String[] entryMatrix = line.split(",");

            for (int i = 0; i < entryMatrix.length; i++) {

                matrix[rowz][i] = Integer.parseInt(entryMatrix[i]);

            }
            rowz++;
        }

        //summing it up

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sumHor[i] += matrix[i][j];
                sumVer[j] += matrix[i][j];
                //sumDiag1 += matrix[i][i];  //todo what did I do here exactly?!
                //sumDiag2 += matrix[j][j];
            }
        }

        // summing diagonals

        for (int i=0; i<matrix.length;i++){
            sumDiag1 += matrix [i][i];
            sumDiag2 += matrix[matrix.length-i-1][i];  //todo why the -1?
    }





        // checkin' matrix

        System.out.println("Length: "+ matrix.length);
        System.out.println("Width: "+matrix[0].length);


        for (int i=0; i<matrix.length; i++){
            System.out.println();
            for (int j=0;j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+"\t");
            }
        }
        System.out.println("\n");

        //checkin sum vectors

        for (int i=0; i<sumHor.length;i++){
            System.out.println(sumHor[i]);
        }
        System.out.println();

        for (int i=0; i<sumVer.length;i++){
            System.out.println(sumVer[i]);
        }

        System.out.println("Diagonal #1: "+ sumDiag1+", diagonal #2: "+sumDiag2 );

        //test

        for (int i=0; i<sumHor.length;i++){
            if (sumHor[i]==3)
                System.out.println("win x"+" in row: "+(i+1));
            else if (sumHor[i] == -3)
                System.out.println("win o");
        }
        for (int i=0; i<sumVer.length;i++){
            if (sumVer[i] == 3)
                System.out.println("win x");
            else if (sumVer[i] == -3)
                System.out.println("win o");
        }
        if ((sumDiag1 ==3) || (sumDiag2 == 3))
            System.out.println("win x");
        else if ((sumDiag1==-3) || (sumDiag2 == -3))
            System.out.println("win o");

    }
}
