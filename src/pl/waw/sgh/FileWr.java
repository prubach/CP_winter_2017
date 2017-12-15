package pl.waw.sgh;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;


/*THIS IS CALLED STREAM PROCESSING*/

public class FileWr {

    static final String FILE_LOC = "..\\myfile.txt";    // can be \\ or / (linux like)

    public static void main(String[] args) throws IOException {
        File file = new File(FILE_LOC);
        FileWriter fw = new FileWriter(file, true);     //exception; append: whether overwrite or append

        /*APPEND JUST ADDS MORE LINES TO THE FILE!!!! (true) OVERWRITE, well, it overwrites..*/

        BufferedWriter bw = new BufferedWriter(fw, 100);   //writes to file once buffer is full ; 100 charactera it performs the write operation


        bw.write("Hello!");
        bw.newLine();
        bw.write("2nd line... \n 3rd line \n 4th \t after tab");
        bw.close();    //must close or it won't be written to drive
        fw.close();    //both must be closed


        System.out.println(System.getProperty("user.dir"));   //finding out working dir
        System.out.println(System.getProperties());


     //   for (Properties prop : System.getProperties().elements());

    }
}
