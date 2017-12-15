package Homework_32760.Stock_Calc;


import javax.swing.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class StockCalc3 extends JFrame {

    static int collumnCount, rowCount;

    static Double [][] entryArray;
    static Double [] calcArray;
    static String [] namesArray;
    static String [] dateArray;
    static String [][] outputArray;



//table fail

/*

    JTable table;

    public StockCalc3(){
        //setIconImage(Toolkit.getDefaultToolkit().getImage(StockCalc3.class.getResource("sonichead.png")));

        setLayout(new FlowLayout());

        table = new JTable(outputArray);
        table.setPreferredScrollableViewportSize(new Dimension(500,500));
        table.setFillsViewportHeight(true);

        JScrollPane scrollMe = new JScrollPane(table);
        add(scrollMe);

    }
*/




    static public void fileLoad () throws FileNotFoundException{


        JButton open = new JButton();
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File(File.separator + "JAVA" + File.separator));
        fc.setDialogTitle("Choose your destiny!");

        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (fc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION){
        }

        //JFileChooser checkpoint
        //System.out.println("\nPath chosen: " + fc.getSelectedFile().getAbsolutePath()+"\n");


        String path = fc.getSelectedFile().getAbsolutePath();

         //File file = new File(path);
        //Scanner scanny = new Scanner(file);

        Scanner scanny = new Scanner(new BufferedReader(new FileReader(path)));


        String testLine = scanny.nextLine();
        namesArray = testLine.split(",");  //todo declare this (namesArray as 8   !!!!!!!!!!!!!


        System.out.println("Let's check names of the variables that we have: ");
        for (collumnCount=0; collumnCount<namesArray.length;collumnCount++){
            System.out.print(collumnCount+1+ ". "+namesArray[collumnCount]+" ");
        }


        String [] tempEntryDate = new String[200];

        String[][]tempEntry2 = new String[200][collumnCount]; //of course this can be resized

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

        try {  //Using Exceptions to drop all the nulls from dummy array! How cool is that!


            for (int i = 0; i < tempEntryDate.length; i++)
                dateArray[i] = tempEntryDate[i];
        }
        catch (ArrayIndexOutOfBoundsException e){

        }

        entryArray = new Double[rowCount][collumnCount-1];



        for (int i=0; i<tempEntry2.length;i++){
            try {
                for (int j=1;i<tempEntry2.length;j++){
                    entryArray[i][j-1] = Double.valueOf(tempEntry2 [i][j]);
                }
            }
            catch (ArrayIndexOutOfBoundsException e){

            }
        }
    }




    static void calculateChangeRatio (){
        calcArray = new Double[rowCount];

        for (int i=0; i<calcArray.length;i++){
            calcArray [i] = ((entryArray [i] [findIndex(namesArray, "Close")-1])-
                    (entryArray [i] [findIndex(namesArray, "Open")-1]))/
                    (entryArray [i] [findIndex(namesArray, "Close")-1]);
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

    }

    static void fileToCSV (){

        JFileChooser saver = new JFileChooser();
        saver.setCurrentDirectory(new File(File.separator + "JAVA"+File.separator));
        int r = saver.showSaveDialog(null);


        if (r == JFileChooser.APPROVE_OPTION) {

            try {
                FileWriter shakespeare = new FileWriter(saver.getSelectedFile()+".csv", false);
                BufferedWriter conrad = new BufferedWriter(shakespeare);
                PrintWriter gutenberg = new PrintWriter(conrad);


                for (int i = 0; i < outputArray.length; i++) {
                    gutenberg.println();
                    for (int j = 0; j < outputArray[0].length; j++) {
                        gutenberg.print(outputArray[i][j] + ",");
                    }
                }
                conrad.flush();
                gutenberg.close();

                JOptionPane.showMessageDialog(null, "A tremendous SUCCESS!");

            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Holy mother of God! What have you done?! Naughty user!");
            }
        }
    }



    public static void main(String[] args)throws FileNotFoundException {

        fileLoad();

        calculateChangeRatio();

        fileOutput();

        fileToCSV();

        //more failed table

       /* StockCalc3 gui = new StockCalc3();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(600, 300);
        gui.setVisible(true);
        gui.setTitle("Something");*/


    }

}
