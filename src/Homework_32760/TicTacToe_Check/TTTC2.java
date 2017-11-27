package Homework_32760.TicTacToe_Check;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TTTC2 {

    static int [][] matrix = new int[3][3];
    static int [] sumHori = new int[3], sumVert = new int[3];
    static int sumDiag1, sumDiag2;


    static void fileLoad ()throws FileNotFoundException{
        String fileLoc = File.separator + "JAVA" + File.separator + "ttt2.csv";  //multi platform friendly <^_^>

        File fileFetched = new File(fileLoc);

        Scanner scanny = new Scanner(fileFetched);

        int rowz = 0;

        while (scanny.hasNextLine()){

            String line = scanny.nextLine();

            String [] entryMatrix = line.split(",");

            for (int i=0; i<entryMatrix.length;i++){
                matrix [rowz] [i] = Integer.parseInt(entryMatrix[i]);
            }
            rowz++;
        }
    }



    static void summing (){
        for (int i=0; i<matrix.length;i++){
            for (int j=0; j<matrix[i].length;j++){
                sumHori[i]+=matrix[i][j];
                sumVert[j]+=matrix[i][j];
            }
        }
        for (int i=0; i<matrix.length;i++){
            sumDiag1+=matrix[i][i];
            sumDiag2+=matrix[matrix.length-i-1][i];
        }
    }

    static void test(){
        for (int i=0; i<sumHori.length; i++){
            victory(sumHori[i]);
        }
        for (int i=0;i<sumVert.length;i++){
            victory(sumVert[i]);
        }
        Double diag1 = Double.parseDouble(String.valueOf(sumDiag1));
        victory(diag1);

        Double diag2 = Double.parseDouble(String.valueOf(sumDiag2));
        victory(diag2);
    }




    static void victory(int i){
        if (i==3)
            System.out.println("This GLORIOUS Tic Tac Toe duel was won by X's! Victory by placing three X's in row or collumn number: " + (i-1)+".");
        else if (i==-3)
            System.out.println("This GLORIOUS Tic Tac Toe duel was won by O's! Victory by placing three O's in row or collumn number: " + (i-1)+".");
    }
    //sorry for the "row or collumn" bit, i got lazy.


    static void victory(Double i){  //Yay! overloaded method! It even is working! Gobsmacked here..
        if (i==3)
            System.out.println("This GLORIOUS Tic Tac Toe duel was won by X's! Victory by placing three X's in one of the diagonals");
        else if (i==-3)
            System.out.println("This GLORIOUS Tic Tac Toe duel was won by O's! Victory by placing three O's in one of the diagonals");
    }


    static void printGameField (){
        for (int i=0; i<matrix.length; i++){
            System.out.println();
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+"\t");
            }
        }
        System.out.println("\n\n"+"Sums, horizontal: ");

        for (int i=0; i<sumHori.length;i++){
            System.out.print(sumHori[i]+"\t");
        }
        System.out.println("\n, vertical");
        for (int i =0; i<sumVert.length;i++){
            System.out.print(sumVert[i]+"\t");
        }

        System.out.println("\nand the diagonal, first: "+sumDiag1+", and second: " + sumDiag2);
    }




    public static void main(String[] args)throws FileNotFoundException {
        fileLoad();
        summing();
        System.out.println("Hello there! Please choose what you would like to see. For superficial information please choose 1, choose 2 for an in-depth report " +
                "or you can choose 3 if you prefer the raw data.\n=> ");
        Scanner menu = new Scanner(System.in);
        String finlandia = menu.nextLine();

        switch (finlandia){
            case "1":
                test();
                break;
            case "2":
                test();
                printGameField();
                break;
            case "3":
                printGameField();
                break;

        }
    }
}
