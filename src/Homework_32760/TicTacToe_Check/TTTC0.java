package Homework_32760.TicTacToe_Check;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TTTC0 {

    static String FILE_LOC = "c:\\JAVA\\ttt2.csv";

    static int matrix [] [];
    static int rowz =0;


    public static void main(String[] args) throws FileNotFoundException {
        matrix = new int[3][3];

        File entryFile = new File(FILE_LOC);
        Scanner scanny = new Scanner(entryFile);

        while (scanny.hasNextLine()){

            String line = scanny.nextLine();

            String[] entryMatrix = line.split(",");

            for (int i=0; i<entryMatrix.length;i++) {

                matrix [rowz] [i] = Integer.parseInt(entryMatrix[i]);

            }
            rowz++;

        }
        for (int i=0; i<matrix.length; i++){
            System.out.println();
            for (int j=0;j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+"\t");
            }
        }
    }
}
