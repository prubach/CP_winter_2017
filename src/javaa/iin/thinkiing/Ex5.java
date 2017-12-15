package javaa.iin.thinkiing;

/*Initialization & Cleanup*/



public class Ex5 {

//ex. pg156

    /*
    Ex5 () {       //contructor
        System.out.println("Rock ");
    }

    public static void main(String[] args) {
        for (int i=0; i<=10; i++)
            new Ex5();
    }

}
*/

/* Example pg 157*/

/*

    Ex5 (int i){
        System.out.println("Rock "+ i + " ");
    }

    public static void main(String[] args) {
        for (int i=0; i<8;i++)
            new Ex5(i);
    }
}
*/

/*Ex5.1*************************************************************
*Create a class containing an uninitialized String
* reference. Demonstrate that this reference is initialized by Java to null;
 */

/*

String s;  ///created


    public static void main(String[] args) {
        Ex5 sri = new Ex5();  //initialized


        System.out.println(sri.s);
    }
}

*/

/*Ex 5.2*********************************************/

/*

    String s1 = " at def";
    String s2;

    public Ex5 (String s2i){
        s2=s2i;
    }


    public static void main(String[] args) {
        Ex5 sz = new Ex5("at const");


        System.out.println(sz.s1);
        System.out.println(sz.s2);
    }
}
*/

//eg pg.159 method overloading


    int height;

    Ex5() { //const
        System.out.println("Planting a seedling");
        //height=0;
    }

    Ex5(int initialHeight) {    //overload
        height = initialHeight;
        System.out.println("Creating new Tree that is " + height + " feet tall.\n");
    }

    void info() {          // w/o String
        System.out.println("Tree is " + height + " feet tall.");
    }

    void info(String s) {       //w/ String, overloaded
        System.out.println(s + ": Tree is " + (height+3) + " feet tall.");
    }


    // OVERLOADED method! Please notice t.info() twice

        public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                Ex5 t = new Ex5(i);   //creating a new object
                t.info();           //info w/o String
                t.info ("I have a String therefore I am OVERLOADED: ");   //info w/ a String

            }
            new Ex5();
        }
    }

//EG. pg160 identifying overloaded methods

/*

static void f(String s, int i){
    System.out.println("String: " + s+", int: "+i);
}
static void f(int i, String s){
    System.out.println("int: "+i+", String: "+s);
}

    public static void main(String[] args) {
        f("String first", 11);
        f(99, "Int first");
    }
}
*/

//overloading primitives, TODO sorry, nie daem rady pg.163

/*

void f1(char x){
    System.out.println("f1(char");
}
void f1(byte x){
    System.out.println("f1(byte)");
}
void f1(short x){
    System.out.println("f1(short)");
}
void f1(int x){
    System.out.println("f1(int)");
}
void f1(long x){
    System.out.println("f1(long");
}
void f1(float x){
    System.out.println("f1(float)");
}
void f1(double x){
    System.out.println("f1(double)");
}



    void f2(byte x){
        System.out.println("f2(byte)");
    }
    void f2(short x){
        System.out.println("f2(short)");
    }
    void f2(int x){
        System.out.println("f2(int)");
    }
    void f2(long x){
        System.out.println("f2(long");
    }
    void f2(float x){
        System.out.println("f2(float)");
    }
    void f2(double x) {
        System.out.println("f2(double)");
    }

    void f3(short x){
        System.out.println("f3(short)");
    }
    void f3(int x){
        System.out.println("f3(int)");
    }
    void f3(long x){
        System.out.println("f3(long");
    }
    void f3(float x){
        System.out.println("f3(float)");
    }
    void f3(double x){
        System.out.println("f3(double)");
    }


    void f4(int x){
        System.out.println("f4(int)");
    }
    void f4(long x){
        System.out.println("f4(long");
    }
    void f4(float x){
        System.out.println("f4(float)");
    }
    void f4(double x){
        System.out.println("f4(double)");
    }




            void f6(float x){
            System.out.println("f1(float)");
            }
            void f6(double x){
            System.out.println("f1(double)");
            }

            void f7(double x) {
                System.out.println("f7(double");}


void testConstVal(){}


}
*/

//EG pg.166 A default constructor

/*

    public static void main(String[] args) { //won't work, need class Bird {} above
        Bird b = new Bird(); //new Bird, this calls a default constructor
    }
}
*/

// EG pg.166


/*

    public static void main(String[] args) {
        Bird2 b2 = new Bird2 (1);  //same as above
        Bird2 b3 = new Bird2(1.0);
    }
}
*/
















