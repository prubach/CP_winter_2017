package javaa.iin.thinkiing;



import java.util.Random;
import java.util.Scanner;

public class Ex3 {



  /*  *//* e.g. pg.96 Aliasing*//*

    int level;


        public static void main (String []args) {

            Ex3 t1 = new Ex3(); //instance t1
            Ex3 t2 = new Ex3(); //instance t2

            t1.level = 9;
            t2.level = 47;

            System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);

            t1 = t2; //here order matters!!!! a.)objects merged
            //t1.level = t2.level; //b.)two objects retained

            System.out.println("2: t1.level: " + t1.level + ", t2.level" + t2.level);

            t2.level=27; // doesn't matter if t1 or t2, in previous line references merged for good

            System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);

        }
    }
*/
/*

*/
/*Ex3.2 Create a class containing float
*and use it to demonstrate aliasing.
 *//*


float fraction;

public static void main (String []args) {

    Ex3 f1 = new Ex3();
    Ex3 f2 = new Ex3();
    Ex3 f3 = new Ex3();

    f1.fraction = 5.3f;
    f2.fraction = 7.4f;
    f3.fraction = 0.4f;

    System.out.println("f1: " + f1.fraction + ", f2: "+ f2.fraction + ", f3: " +f3.fraction);

    f1=f2;
    f3=f1;

    System.out.println("f1: " + f1.fraction + ", f2: "+ f2.fraction + ", f3: " +f3.fraction);

    f2.fraction = 0.05f;

    System.out.println("f1: " + f1.fraction + ", f2: "+ f2.fraction + ", f3: " +f3.fraction);

}

}
*/
/*

*/
/* eg from page97*//*



    char c;

    static void f (Ex3 y){
        y.c = 'z';
    }

    public static void main (String[] args){

        Ex3 x = new Ex3();
        x.c = 'a';
        System.out.println("1: x.c: "+ x.c);
        f(x);
        System.out.println("2. x.c: "+ x.c);
    }

}
*/

 /*   *//*Ex3.3*//*

    float f;

    static void s (Ex3 y ){
        y.f = 0.05f;
    }

    public static void main (String[] args){

        Ex3 x = new Ex3();
        x.f = 0.21f;
        System.out.println("1: x.c - " + x.f);
        s(x);
        System.out.println("2: x.c - " + x.f);

    }

}
*/

/*

*/
/* eg pg.99, math operations, SO MUCH FUN!*//*


public static void main(String[]args) {

    Random rand = new Random(47);

    int i, j, k;

    j = rand.nextInt(100) + 1;
    System.out.println("j: " + j);

    k = rand.nextInt(100)+1;
    System.out.println("k: " + k);

    i = j + k;
    System.out.println(i);

    i= j - k;
    System.out.println(i);

    double z;
    z= k / j;
    double f= 56/59;
    System.out.println("k/j= " + z);
    System.out.println("56/59= "+f);  //whatever

    double x;
    x=j/k;
    System.out.println("j/k: " + x);

    i=j*k;
    System.out.println(i);

    i=k%j;
    System.out.println("modulo: " + i);  //right... suppose this is is intent?

    i=j%k;
    System.out.println("modulo: " + i);

    j %= k;
    System.out.println("modulo: " +j);  //this i understand j/k = 1 and 3 remains

    //floating point numbers
    System.out.println("Floats: ");

    float u, v, w;

    v=rand.nextFloat();
    System.out.println("v: " + v);

    w =rand.nextFloat();
    System.out.println("w: " + w);

    u= v+w;
    System.out.println(u);

    u= v-w;
    System.out.println(u);

    u= w-v;
    System.out.println(u);

    u=w*v;
    System.out.println(u);

    u=w/v;
    System.out.println(u);

    u=v/w;
    System.out.println(u);

    char a, b, c;
    a='a';
    b='b';

    b*=a;
    System.out.println(b);

    u +=v;
    System.out.println(u);


}

}
*/


/* Ex.3.4 Write a program that calculates
*velocity using a constant distance and constant time
*  velocity = distance / time
 */
// MY WAY!!

/*

Double velo;

public Ex3 () {

    System.out.print("Please enter distance: ");

    Scanner dis = new Scanner(System.in);

    Double dist = dis.nextDouble();

    System.out.println("The distance you have entered is: " + dist + " km");


    System.out.println("Please enter time (in decimal fractions): ");

    Scanner tim = new Scanner(System.in);

    Float time=tim.nextFloat();

    System.out.println("The amount of time you have entered is: " + time + " hours");


    velo = dist / time;

    System.out.println("velocity is: " + velo);

    System.out.println("YAY");


}



public static void main(String[]args) {

   new Ex3();
}

}
*/

//BOOK WAY
/*
    public static void main (String [] args) {

        if (args.length <2) {
            System.err.println(
                    "Usage: java E04_Velocity distance time");
            System.exit(1);
        }



        float distance = Float.parseFloat(args[0]);
        float time = Float.parseFloat(args[1]);

        System.out.print("Velocity= ");
        System.out.print(distance/time);

        System.out.println(" m/s");
    }


}*/

// parsing tutorial
/*

public static void main ( String []  args) {

    Float f = new Float(20.75f);

    String s = "30";
    float retrival = f.parseFloat(s);
    System.out.println("Value = " + retrival);
}
}
*/

/*Ex.3.5 pg.105
* Create a class called Dog containing two Strings: name and says.
* In main(), create two dog objects with names "spot" (who says, Ruff!"
* and scruffy (who says wurf!) Then display their names and what they say*/

/*

String name;
String says;

    public static void main(String[] args) {
        Ex3 spot = new Ex3();
        Ex3 scruffy = new Ex3();

        spot.name = "Spot";
        spot.says = "Ruff!";

        scruffy.name = "Scruffy";
        scruffy.says = "Wurf!";

        System.out.println(spot.name + " says: " + spot.says);
        System.out.println(scruffy.name+" says: "+ scruffy.says);
    }
}
*/


/*Ex3.6
*Following Ex 3.5, create a new dog reference and assign it to spot's object.
* Test for comparison using == and .equals() for all references.
 */

// So, 3.5 again for shits and giggles

/*

    String name;
    String says;

    public static void main(String[] args) {

        Ex3 spot = new Ex3();
        Ex3 scruffy = new Ex3();

        spot.name = "Spot";
        spot.says = "Ruff!";

        scruffy.name = "Scruffy";
        scruffy.says = "Wurf!";

        System.out.println(spot.name+" says: "+spot.says);
        System.out.println(scruffy.name+" says: "+scruffy.says);

        Ex3 reksio =new Ex3();
        reksio=spot;

        System.out.println(reksio.name+" says: "+reksio.says);

        System.out.println("Testy:");

        System.out.println(reksio == spot);
        System.out.println(reksio.name == spot.name);
        System.out.println(reksio.says==spot.says);

        System.out.println(reksio.equals(spot));

    }
}
*/

// Yet again, book way with a method created, my first proper method, yay!

/*    String name;
    String says;

    static void compare (Ex3 dog1, Ex3 dog2){

        System.out.println("== : "+ (dog1==dog2));
        System.out.println("equals(): "+dog1.equals(dog2));
        System.out.println("== name: "+(dog1.name==dog2.name));
        System.out.println("equals() name:"+ dog1.name.equals(dog2.name));
        System.out.println("== says:"+(dog1.says==dog2.says));
        System.out.println("equals() says:"+dog1.says.equals(dog2.says));
    }

    public static void main(String[] args) {
        Ex3 dog1 = new Ex3();
        Ex3 dog2 = new Ex3();
        Ex3 dog3 = dog1;
        Ex3 cat = new Ex3();

        dog1.name="Spot";
        dog1.says="Ruff!";
        dog2.name="Scruffy";
        dog2.says="Wurf!";

        System.out.println(dog1.name+" says "+dog1.says);
        System.out.println(dog2.name+" says "+dog2.says);

        System.out.println();

        System.out.println("Comparing dog1 and dog2 objects");
        compare(dog1, dog2);
        System.out.println();
        System.out.println("Comparing dog1 and dog3 objects");
        compare(dog1, dog3);
        System.out.println();
        System.out.println("Comparing dog 2 and dog 3 objects");
        compare(dog2, dog3);

        System.out.println("gthrhtr "+dog1.name==dog3.name); //example where lack of brackets adds string to value affecting logical test

        System.out.println("hjgtui:");
        compare(dog1, cat);  //oh look! it even works for a cat with no name!

    }
}*/

/*Examples for operators from pg.105*/

/*    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);

        System.out.println("i="+i+", j="+j);

        System.out.println("i>j "+(i>j));
        System.out.println("i<j "+(i<j));

        System.out.println("i>=j "+(i>=j));
        System.out.println("i<=j "+(i<=j));

        System.out.println("i==j "+ (i==j));
        System.out.println("i!=j "+(i!=j));

        // System.out.println("i && j is "+ (i&&j));  <--ILLEGAL

        System.out.println("(i < 10) && (j<10) is " + ((i<10)&&(j<10)));
        System.out.println(((i<10)||(j<10)));
    }

}*/

/* Ex 3.7 pg106
* Write a program that simulates coin-flipping
 */

  /*  public static void main(String[] args) {
        Random rand = new Random();
        boolean c = rand.nextBoolean();

        System.out.println(c? "heads" : "tails");
    }
}*/

// Short Circuiting pg.107

/*
    static boolean test1 (int val){
        System.out.println("test1(" + val +") ");
        System.out.println("result:  "+ (val<1));
        return val<1;
        }

    static boolean test2(int val) {
        System.out.println("test2("+val+")");
        System.out.println("result: "+(val<2));
        return val<2;

        }

    static boolean test3(int val){
        System.out.println("test3("+val+")");
        System.out.println("result: "+(val<3));
        return val<3;
    }

    public static void main(String[] args) {
        boolean b = test1(0) && test2(2)&& test3(2);
        System.out.println("expression is " +b);
    }
}

*/

/* Example pg.108*/


/*


    public static void main(String[] args) {
        int i1 = 0x2f; //HEX lowercase
        System.out.println("i1: " + Integer.toBinaryString(i1));
        System.out.println(Integer.toString(i1));

        int i2=0X2F; //HEX uppercase
        System.out.println("i2: "+Integer.toBinaryString(i2));
        System.out.println(Integer.toString(i2));

        int i3=0177; //octal (leading zero)
        System.out.println("i3: "+ Integer.toBinaryString(i3));
        System.out.println(Integer.toString(i3));

        char c = 0xffff; //max char hex value
        System.out.println("c: "+ Integer.toBinaryString(c));
        System.out.println(Integer.toString(c));
        System.out.println(c);

        byte b = 0x7f; //max byte hex value
        System.out.println(b); //oh! doesn't work!
        System.out.println("b: "+Integer.toBinaryString(b));
        System.out.println(Integer.toString(b));
        System.out.println(b);

        short s = 0x7fff; // max short hex value
        System.out.println("s: "+ Integer.toBinaryString(s));
        System.out.println(Integer.toString(s));

        long n1 = 200L;
        long n2 = 200l; //the confusing lowercase L
        long n3=200;

        System.out.println(n1+" "+n2+" "+n3);

        float f1 = 1;
        float f2=1F;
        float f3=1f;

        System.out.println(f1+" "+f2+" "+f3);

           }

}

*/

/* Ex 3.8
*Show that hex and octal notations work with long values
* Use Long.toBinaryString() to display the results.
 */


/*

    public static void main(String[] args) {
        long l1 = 0x8f9a;
        System.out.println(Long.toBinaryString(l1));
        System.out.println(Long.toString(l1));
        System.out.println(Long.toOctalString(l1));

        System.out.println();
        System.out.println("\n\n\n");

        long l2 = 056;
        System.out.println(Long.toBinaryString(l2));
        System.out.println(Long.toString(l2));
        System.out.println(Long.toOctalString(l2));
        System.out.println(Long.toHexString(l2));
    }

}
*/

/*

    public static void main(String[] args) {
        float f1 = 2e3f;   //2*(10*10*10) eng notation!
        System.out.println(f1);
        float f2 = 1.1e9f;
        System.out.println(f2);

        System.out.println("\n\n" + Float.MIN_VALUE+"\n"+Float.MAX_VALUE );
        System.out.println("\n and for double \n");
        System.out.println(Double.MIN_VALUE+"\n"+Double.MAX_VALUE);
    }

}
*/

//TODO BITWISE along with Ex. 11, 12, 13

/*

    public static void main(String[] args) {
        int i = -1;
        System.out.println(i);

        i >>>= 10;
        System.out.println(i);

        long l=-1;
        System.out.println("\n"+l);

        l>>>=10;
        System.out.println(l);

        short s = -1;
        System.out.println("\n"+Integer.toBinaryString(s));
        System.out.println(s);
        s>>>=10;
        System.out.println(s);

        System.out.println("\n");

        byte b = -1;
        System.out.println(b);
        b>>>=10;
        System.out.println(b);

    }

}

*/


/* Ex. Ternary if-else, pg.117*/


/*

static int ternary (int i){
return i<10? i*100 : i*10;
}

static int stdIfElse (int i){
    if (i<10) return i *100;
    else return i*10;
}

    public static void main(String[] args) {
        System.out.println(ternary(9));
        System.out.println("\n");
        System.out.println(ternary(10));
        System.out.println("\n");
        System.out.println(stdIfElse(9));
        System.out.println("\n");
        System.out.println(stdIfElse(10));
    }

}
*/

/* Example of string operators pg.118*/

/*

    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z";

        System.out.println(s + x + y + z);
        System.out.println("\n");
        System.out.println(x+" "+ s);
        s += "(summed) = ";
        System.out.println(s+(x+y+z));
        System.out.println(""+x);
    }
}
*/

//---------------------


/*Ex.3.14*****************************
*Write a method that takes two String arguments and uses all the boolean comparisons to compare the two
* Strings and print the results. For the == and !=, also perform equals() test.
* In main(), call your method with some different string objects.
 */

/* Program will describe weather in given cities*/

String name;
String weather;

    static void weather (Ex3 city1, Ex3 city2){
        if(city1.weather == city2.weather)
            System.out.println("Pogoda jest taka sama!");
        else
            System.out.println("Pogoda jest inna");

    }


    public static void main(String[] args) {
        Ex3 city1 = new Ex3();
        Ex3 city2 = new Ex3();
        Ex3 city3 = new Ex3();

        city1.name="Warsaw";
        city1.weather="Snow";

        city2.name="Berlin";
        city2.weather="Rain";

        city3.name="London";
        city3.weather="Rain";

        weather(city1, city2);
        System.out.println("\n");
        weather(city1, city3);
        System.out.println("\n");
        weather(city2, city3);
    }



}




















