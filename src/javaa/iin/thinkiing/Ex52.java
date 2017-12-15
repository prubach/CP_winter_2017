package javaa.iin.thinkiing;

/*This class had to be created due to changes in how exercises are solved.
* From now on public class will be written again and classes before it
* are going to be created as it should be. Cheers!*/

//Ex 5.3**********************************
 /*
 * Create a class with a default constructor (one that takes no
 * arguments) that prints a message. Create an object of this class.*/

/*

public class Ex52 {

    Ex52(){
        System.out.println("message");
    }

    public static void main(String[] args) {
        new Ex52();
    }
}
*/


//Ex 5.4*********************************************
/*Add an overloaded constructor to the previous exercise
*that takes a String argument and prints it along with your message.
 */
/*

public class Ex52 {

    static String a = "OI OI";

    Ex52(){
        System.out.println("message");
    }
    Ex52(String s){
        System.out.println(s);
    }
    //Ex52(a){
    //    System.out.println(a);
    //}

    public static void main(String[] args) {
        new Ex52();
        new Ex52("nanana");
        //new Ex52(String a); //TODO in questions
    }
}
*/


//Ex 5.5****************************************
/*Create a class called Dog with an overloaded bark
*method. This method should be overloaded based on various primitive data
* types, and print different types of barking, howling etc., depending on which
* overloaded version is called. Write a main() that calls all different
* versions.
 */
//TODO obviously due to being a lazy bum I'll have to look into answers. Saying in advance it'll have to be repeated
/*

public class Ex52{   //Ex52 is a dog, barks like a dog so it has to be

    public void bark (){
        System.out.println("bark!");
    }

    public void bark (int i){
        System.out.println("int howl");
    }

    public void bark (double d){
        System.out.println("double yip");
    }

    public void bark (float g){
        System.out.println("Floating BARK!");
    }

    public static void main(String[] args) {
        Ex52 dog = new Ex52();
        dog.bark();
        dog.bark(1);
        dog.bark(1.1);
        dog.bark(1.1f);
    }

}

*/

//Ex 5.6*************************************************************
/* Modify the previous exercise so that two of the overloaded
 *methods have two arguments (of two different types), but in reversed order
 * relative to each other. Verify that this works.
  */
/*

public class Ex52 {

    public void bark (int i, double d) {
        System.out.println("bark int double");
    }

    public void bark (double d, int i) {
        System.out.println("bark double int");
    }

    public void bark (float f, byte b){
        System.out.println("bark float byte");
    }
    public void bark (int i, byte b){
        System.out.println("!! bark int byte");
    }

    public static void main(String[] args) {
        Ex52 dog = new Ex52();

        dog.bark(1, 1.1d);
        dog.bark(1.2d, 2);
        dog.bark(9.8f, 3);  //todo was supposed to be byte but isn't, adding b doesn't solve
        //dog.bark(8,9);  //todo compiler no like this method
    }

}
*/


// Ex 5.7********************************************************
/*Create a class without a constructor, and then create an
 * object of that class in main() to verify that the default constructor is
 * automatically synthesized.
 */

/*

public class Ex52{



    public static void main(String[] args) {
        new Ex52();
    }
}
*/


//********************************************************************* this


// a broken example to fix

/*

class Banana {void peel(int i) {*/
/*
....*//*


 } }

public class Ex52{
    public static void main(String[] args) {
        Banana a=new Banana(),
                b=new Banana();
        a.peel(1);
        b.peel(2);
    }
}
*/


//Eg.page 169

/*

public class Ex52{

    int i=0;
    Ex52 increment(){  //TODO why this function has a class name? Is this a named constructor?
        i++;
        return this;
    }

    void print (){
        System.out.println("i= "+i);
    }

    public static void main(String[] args) {
        Ex52 x = new Ex52();

        x.increment().increment().increment().increment().print(); //TODO why can't i increment again?
    }
}
*/

// eg. pg. 169 Using this for passing object to another method
//TODO this structure is way beyond me right now
/*

class Person{

    public void eat (Apple apple){
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
        }
    }

class Peeler {
    static Apple peel (Apple apple){   //peeler method
        //remove peel
        return apple; //Peeled
    }
}

class Apple{
    Apple getPeeled()
    {return Peeler.peel(this);}  //calling foreign utility method
}


public class Ex52{
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }

}

*/


//Ex5.8*******************************************************
/* Create a class with two methods. Within the first method,
 * call the second method twice: the first time without using this, and the
 * second time using this - just to see it working; you should not use this form
 * in practice.
 */



/*

public class Ex52{

    public void method1(){
        this.b();
        b();
    }

    public void b(){
        System.out.println("b() called");
    }

    public static void main(String[] args) {
        new Ex52().method1();
    }

}
*/

//oh look, both got called

//EG pg171 calling constructors form constructors
/*

public class Ex52{

    int petalCount = 0;
    String s = "initial value";

    Ex52 (int petals){
        petalCount=petals;
        System.out.println("Constructor w/ int arg only, petalCount= "+ petalCount);
    }

    Ex52 (String ss) {
        System.out.println("Constructor w/ String arg only, s= " + ss);
        s=ss;
    }

    Ex52 (String s, int petals){
        //this(petals);
        this (s);
        this.s=s;
        System.out.println("String & int args");
    }

    Ex52 (){
        this ("hi", 47);
        System.out.println("default constructor (no args)");
    }

    void printPetalCount (){
      //  this (11);
        System.out.println("petalCount= "+petalCount+ " s = "+s);
    }


    public static void main(String[] args) {
        Ex52 x = new Ex52();
    }
}
*/


public class Ex52 {


}















