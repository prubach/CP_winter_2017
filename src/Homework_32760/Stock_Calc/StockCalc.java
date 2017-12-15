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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Date;
import java.util.Scanner;


public class StockCalc {

    static int collumnCount, rowCount;

    static Integer [][] entryArray;
    static String [] namesArray;
    static Date [] dateArray;

/*Aim of this function is to set size of entryArray depending on what kind of data our user has entered*/

    static public void fileLoad () throws FileNotFoundException{
        String path = File.separator + "JAVA" + File.separator + "IBM.csv";

        File file = new File(path);
        Scanner scanny = new Scanner(file);

        //Scanner scanny = new Scanner(new BufferedReader(new FileReader(path)));
        
        String testLine = scanny.nextLine();
        namesArray = testLine.split(",");
        

        System.out.println("Let's check names of the variables that we have: ");
        for (collumnCount=0; collumnCount<namesArray.length;collumnCount++){
            System.out.print(collumnCount+1+ ". "+namesArray[collumnCount]+" ");
        }

        //datearray  HERE HERE HERE


        // counting https://stackoverflow.com/questions/8352040/scanner-on-text-file-hasnext-is-infinite
        // google question: java 2d array reading first column
        //google answer: https://stackoverflow.com/questions/1111998/how-to-get-a-column-from-a-2d-java-array



        // THIS IS a working date puller, sadly in this instance of scanner it discards other data. MUST use if/else
       /* rowCount=0;
        String [] tempEntryD = new String[rowCount+50];  //this 50 is temp

        while (scanny.hasNextLine()){

            String lineD = scanny.nextLine();
            String [] endtryArrayD = lineD.split(",");
            tempEntryD [rowCount]=endtryArrayD [0];
            rowCount++;
        }


        // this bit reads date array start
        System.out.println("\n\n");

        for (int i=0; i<tempEntryD.length; i++){
            System.out.print(tempEntryD[i] + "\t ");
        }
        System.out.println("\n\n");
        */
        // THIS IS end of the aforementioned date array

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
                tempEntry2 [rowCount][i] = entryArray[i]; //if
            }
            rowCount++;
        }


        //this shows my temp date
        System.out.println("\n\n");

        for (int i=0; i<tempEntryDate.length; i++){
            System.out.print(tempEntryDate[i] + "\t ");
        }





//        entryArray = new Integer[collumnCount][rowCount];
//
//      for (int i=0; i<tempEntry2.length;i++)
//          for (int j=0; j<tempEntry2[i].length;j++)
//              entryArray [i][j] = Integer.parseInt(tempEntry2 [i][j]);


/*
* It is worth to notice that row read once is not read again. i.e. names*/
        // test area
        System.out.println("\n\n");

        System.out.println(tempEntry2.length+" lenght // cols   "+tempEntry2[0].length);  //todo remove when not needed

        for (int i=0; i<tempEntry2.length;i++){
            System.out.println();
            for (int j=0; j<tempEntry2[i].length;j++){
                System.out.print(i +"."+j+"-"+tempEntry2[i][j]+"\t");
            }
        }
        System.out.println("\n"+rowCount+"<-----------------------"); //todo remove; we see how large rowcount is
    }



    public static void main(String[] args)throws FileNotFoundException {

        fileLoad();







//        System.out.println("\n\n\n"+entryArray.length+"  "+entryArray[0].length+"  "+collumnCount);


    }

}
