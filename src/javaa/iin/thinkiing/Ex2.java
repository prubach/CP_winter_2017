package javaa.iin.thinkiing;

import java.math.BigInteger;
import java.util.Date;
import java.util.Scanner;

public class Ex2 {


    //Ex2.1 - Exercise supposed to show that uninitialized variables have value in class
/*
   int ii;
    char cc;

    public Ex2 () {
        System.out.println("ii = " + ii);
        System.out.println("cc = " + cc);
    }

    public static void main ( String [] args) {

        new Ex2();


    } }
*/

    // Ex2.2 *********************************************
/*

    String s = new String ("Hello World!");

    public Ex2() {
        System.out.println(s);
    }

    public static void main ( String [] args) {
        new Ex2();
    }
    }
*/


    // Ex2.3 **********************************************
/*
    public static void main ( String [] args) {
        Ex2 e = new Ex2();
    }
}
*/


    // Ex2.4 ************************************************
/*
    int i;
    double d;
    boolean b;

    public Ex2(){
        System.out.println(i);
        System.out.println(d);
        System.out.println(b);


    }

    public static void main (String [] args) {

        Ex2 data = new Ex2();

        data.i=47;
        data.d=1.1;
        data.b=true;
    }

}
*/



/*

*/
/* Ex.2.5 *****************************************
* Modify Ex2.4 in such manner that values of DataOnly
* are assigned and printed in main method.
*//*


int iii;
double ddd;
boolean bbb;

public static void main (String [] args) {

    Ex2 data = new Ex2();

    data.iii=47;
    data.ddd=1.1;
    data.bbb=true;

    System.out.println(data.iii);
    System.out.println(data.ddd);
    System.out.println(data.bbb);
}


}*/

/*

*/
/* Ex.2.5 **************************
* done with own method
 *//*


int i;
double d;
boolean b;

public Ex2 (){

    System.out.println(i);
    System.out.println(d);
    System.out.println(b);

    i=47;
    d=1.1;
    b=true;

    System.out.println(i);
    System.out.println(d);
    System.out.println(b);
}

public static void main (String [] args) {
    new Ex2();
}
}
*/


/* Ex.2.6 ********************************
* Write a program that includes and calls the storage()
* method defined in this chapter.
 */

/*
    String s = "hutihgudfiphjugi";
    int stor (String s) {return s.length()*2;}

     void drukuj(){        //TODO Why is the void here?
        System.out.println("Storage (s) = " + stor(s));
    }


    public static void main ( String [] args) {
      Ex2 st = new Ex2();
      st.drukuj();
    }
}   //z odpowiedzi :(((
*/

/*




// TODO 2.6 ze skanerem!

public Ex2 (){
    Scanner sc = new Scanner(System.in);
    System.out.println("Type in a Ssstring!");
    System.out.print("Rrright here ===>> ");
    String s = sc.nextLine();



    System.out.println(s);
    System.out.println(len);
}

public static void main (String [] args) {
    Ex2 ex2 = new Ex2();
    Ex2 ex222 = new Ex2();

}

}
*/


/* 2.7*****************************************
* Turn the Incrementable code fragments into a working program
 */

/*
static int i = 47;

static void incr () {    //TODO According to answers this should be inside od public class Ex2 {
    Ex2.i++;
}


public static void main (String [] args) {

   Ex2 st1 = new Ex2();
   st1.incr();
   incr();
   incr();   //Dziala domyslnie?!

    System.out.println(i);
    System.out.println(st1);   // What on earth is that?!
}

}

*/

/*
*//* Ex2.8**********************************
* Write a program that demonstrates that, no matter how many objetcs
* you create of a particular class, there is only one instance of a
* particular static field in class.
 *//*

static int i = 23;



public static void main (String [] args) {


    Ex2 a = new Ex2();
    Ex2 b = new Ex2();

    System.out.println(a.i+ " =" + "= "+ b.i );

    Ex2.i ++;

    System.out.print(a.i+ " =" + "= "+ b.i );
}

}*/

/*
*//*Ex2.9**************************************
* Write a program that demonstrates that autoboxing works for
* all the primitive types and their wrappers
 *//*

public static void main (String [] args){

    Byte bb = 3;
    byte b = bb;
    System.out.println(b);
    Byte bbb = bb;
    System.out.println(bbb);

    short s = 32589;
    Short s1 = s;
    System.out.println(s1);
    short s2= s1;
    System.out.println(s2);

    char c = 'a';
    Character cc = c;
    System.out.println(cc);
    char ccc = cc;
    System.out.println(ccc);

    //and so forth


}

}*/

// Autoboxing primitive -> wrapper; Autounboxing wrapper -> primitve !!

/*

*/
/*2.10*************************************************
* Write a program that prints three arguments taken from command line.
* To do this you will need to index into command line array of strings.
 *//*


public static void main (String [] args){

    System.out.println(args[0]);
    System.out.println(args[1]);
    System.out.println(args[2]);
}

}
//TODO Wonder why it doesn't work?
*/

/*

*/
/*2.11******************************
* Turn AllTheColorsOfTheRainbow exammple into a program
 *//*


int anIntegerRepresentingColors;

void changeTheHueOfTheColor (int newHue){
anIntegerRepresentingColors = newHue;
}

public static void main (String[] args){

    Ex2 all = new Ex2();
    all.changeTheHueOfTheColor(27);

}

}
*/





/*Ex2.13&2.14**************************************
*Find the code for the second version of HelloDate.java, which is simnple comment documentation example
* Execute Javadoc on the file and view the results with your Web browser.
 */

/*
public static void main (String []args){

    //<pre>
    System.out.println("\" Examplum gratia \" ");


    System.out.println(new Date());
    //</pre>

    *//* list <em> testing it </em>
    * <ol>
    *     <li> one
    *     <li> two
    *     <li> three
    * </ol>
     *//*
}
}*/
//nope, don't see anything in the javadoc generated




/*

    // Ex2.15 *********************************************

    String s = new String ("Hello World!");

    public Ex2() {
        System.out.println(s);
    }

    public static void main ( String [] args) {
        new Ex2();
    }
    }

*/


}

































