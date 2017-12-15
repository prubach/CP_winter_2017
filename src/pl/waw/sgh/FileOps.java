package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileOps {

    static final String FILE_LOC = "c:\\JAVA\\myfile.txt";    // can be \\ or / (linux like)

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(FILE_LOC);
        Scanner scanny = new Scanner(file);

        while (scanny.hasNext()){  //as long as there are new lines in the file
            String myLine = scanny.nextLine();
            System.out.println(myLine);

//            String [] elem = myLine.split( ":");
//
//            for (String el : elem)
//                System.out.println("= " + el);
        }

    }
}



/* Binary format vs text format in text files*/