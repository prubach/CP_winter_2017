package Homework_32760.Stock_Calc;


/*

static entry array
static output array

1.) file entry (with directory search) into a string array with creation of proper size array

2.) create a string array vector(+1 space) and an int array (+1 space) for rest of data
	parse rest of data to int and do the computation[computation should be an outside function to allow easily adding diff computations]

3.) populate output array converting values to string

4.) write the output as a csv file

 */

import javax.swing.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class StockCalc2 {

    static int collumnCount, rowCount;

    static Double [][] entryArray;
    static Double [] calcArray;
    static String [] namesArray;
    static String [] dateArray;
    static String [][] outputArray;

/*Aim of this function is to set size of entryArray depending on what kind of data our user has entered*/

    static public void fileLoad () throws FileNotFoundException{
        String path = File.separator + "JAVA" + File.separator + "IBM.csv";

        File file = new File(path);
        Scanner scanny = new Scanner(file);

        //Scanner scanny = new Scanner(new BufferedReader(new FileReader(path)));


        String testLine = scanny.nextLine();
        namesArray = testLine.split(",");  //todo declare this (namesArray as 8   !!!!!!!!!!!!!


        System.out.println("Let's check names of the variables that we have: ");
        for (collumnCount=0; collumnCount<namesArray.length;collumnCount++){
            System.out.print(collumnCount+1+ ". "+namesArray[collumnCount]+" ");
        }



        //we start here!!!!!!!!!!!!!!!!!!
        String [] tempEntryDate = new String[50];

        String[][]tempEntry2 = new String[50][collumnCount]; //of course this can be resized

        rowCount=0;


        while (scanny.hasNextLine()){

            String line = scanny.nextLine();

            String [] entryArray = line.split(",");

            for (int i=0;i<entryArray.length;i++){
                if (i==0){
                    tempEntryDate [rowCount] = entryArray [i];
                }
                else
                    tempEntry2 [rowCount][i] = entryArray[i];
            }
            rowCount++;
        }

        dateArray = new String[rowCount];

        try {  //Using Exceptions to drop all the nulls from dummy array! I could have limited reading area in loops BUT then I wouldn't be able to use Exception handling! Iron Logic!


            for (int i = 0; i < tempEntryDate.length; i++)
                dateArray[i] = tempEntryDate[i];
        }
        catch (ArrayIndexOutOfBoundsException e){

        }

        entryArray = new Double[rowCount][collumnCount-1];


        System.out.println("\n"+entryArray.length + " LENGTH (rows) |||||| WIDTH (cols)  "+entryArray[0].length);  //todo remove





            for (int i=0; i<tempEntry2.length;i++){
                try {
                    for (int j=1;i<tempEntry2.length;j++){
                    entryArray[i][j-1] = Double.valueOf(tempEntry2 [i][j]);
                    }
                }
                catch (ArrayIndexOutOfBoundsException e){

                }
            }




        for (int i=0; i<entryArray.length;i++){
            System.out.println();
            for (int j=0; j<entryArray[i].length;j++){
                System.out.print(i+"."+j+" - "+entryArray[i][j]+"\t");
            }
        }


        // both of those will be turned into a FUNCTION
        System.out.println("\n\n"); //toy

        for (int i=0; i<dateArray.length; i++){  //another checker
            System.out.print(dateArray[i]+"\t");
        }

        //this shows my temp date
        System.out.println("\n\n");

        for (int i=0; i<tempEntryDate.length; i++){
            System.out.print(tempEntryDate[i] + "\t ");
        }
        // yup, those two


// TODO clean up this function


        // test area
        System.out.println("\n\n");

        System.out.println(tempEntry2.length+" lenght // cols   "+tempEntry2[0].length);  //todo remove when not needed

     /*   for (int i=0; i<tempEntry2.length;i++){
            System.out.println();
            for (int j=0; j<tempEntry2[i].length;j++){
                System.out.print(i +"."+j+"-"+tempEntry2[i][j]+"\t");
            }
        }*/
        System.out.println("\n"+rowCount+"<-----------------------"+"collumn: "+collumnCount); //todo remove; we see how large rowcount is
    }
//todo really, clean this up



    static void calculateChangeRatio (){
        calcArray = new Double[rowCount];

        for (int i=0; i<calcArray.length;i++){
            calcArray [i] = ((entryArray [i] [findIndex(namesArray, "Close")-1])-
                    (entryArray [i] [findIndex(namesArray, "Open")-1]))/
                            (entryArray [i] [findIndex(namesArray, "Close")-1]);
        }

        for (int i=0;i<calcArray.length;i++){
            System.out.println(i+"  "+calcArray[i]+"\t");
        }

    }

    static int findIndex (String [] array, String value){
        return Arrays.asList(array).indexOf(value);
    }

    static void fileOutput (){

        outputArray = new String[rowCount+1][collumnCount+1];

        try {
        outputArray [0][collumnCount] = "Output";}
        catch (ArrayIndexOutOfBoundsException e){
        }

        for (int i=0; i<outputArray.length;i++){  //Exception, first add name to the names array
            for (int j=0; j<outputArray[i].length;j++){
                if (i==0)
                    try {
                        outputArray[i][j] = namesArray[j];
                    }
                    catch (ArrayIndexOutOfBoundsException e){
                    }
                if (j==0)
                    try {
                        outputArray[i+1][j] = dateArray[i];
                    }
                    catch (ArrayIndexOutOfBoundsException e){
                    }
                if (j==7)
                    try {
                        outputArray[i+1][j] = calcArray[i].toString();
                    }
                    catch (ArrayIndexOutOfBoundsException e){
                    }

                try {
                    outputArray[i + 1][j + 1] = entryArray[i][j].toString();
                }
                catch (ArrayIndexOutOfBoundsException e){
                }



            }
        }
        for (int i=0; i<outputArray.length;i++){
            System.out.println();
            for (int j=0; j<outputArray[0].length;j++){
                System.out.print(outputArray[i][j]+"\t\t");
            }
        }

    }

    static void fileToCSV (){
        String pathOut = File.separator + "JAVA" + File.separator + "IBM_proc.txt";
        File outFile = new File(pathOut);


        try {
            FileWriter shakespeare = new FileWriter(outFile, false);
            BufferedWriter conrad = new BufferedWriter(shakespeare);
            PrintWriter gutenberg = new PrintWriter(conrad);



            for (int i=0; i<outputArray.length; i++){
                gutenberg.println();
                for (int j=0; j<outputArray[0].length;j++){
                    gutenberg.print(outputArray[i][j]+",");
                }
            }
            conrad.flush();
            gutenberg.close();

            JOptionPane.showMessageDialog(null, "A tremendous SUCCESS!");

        }
        catch ( IOException e){
            JOptionPane.showMessageDialog(null, "A horribad DEFEAT!");
        }

    }



    public static void main(String[] args)throws FileNotFoundException {

        fileLoad();

        calculateChangeRatio();

        fileOutput();

        fileToCSV();


        System.out.println("\n\n\n"+outputArray.length+" length    width "+outputArray[0].length);


    }

}
