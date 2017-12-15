package javaa.iin.thinkiing;

import java.util.Random;

public class Ex4 {


    /* Example pg.136*/

/*
    static int result = 0;

    static void test (int testval, int target){
        if(testval>target)
            result=+1;
        else if (testval<target)
            result=-1;
        else
            result=0;
    }

    public static void main(String[] args) {
        test(10, 5);
        System.out.println(result);

        test(5, 10);
        System.out.println(result);

        test(5, 5);
        System.out.println(result);
    }
}
*/

/*e.g. pg 137*/

//while condition remains true
/*

static boolean condition (){
    boolean result = Math.random() <0.99;
    System.out.println(result+". ");
    return result;
}

    public static void main(String[] args) {
    int i=1;
    while (condition()) {
            System.out.println("inside \"while\"");
        System.out.println(i++);}
        System.out.println("Exited \"while\"");
    }

}
*/

/*writing previous example in do while form*/

/*

static boolean cond (){
    boolean result = Math.random() <0.99;
    System.out.println(result+". \n");
    return result;
}

    public static void main(String[] args) {
        int i=1;
        do {
            System.out.println("inside 'while'");
            System.out.println(i++);
        }
        while (cond());
        System.out.println("exited 'while'");

    }

}
*/

/* for example pg 138*/
/*

    public static void main(String[] args) {
        for (char c=0; c<128; c++)
            if (Character.isLowerCase(c))
                System.out.println("value: "+(int)c+" character: "+c);

    }
}
*/

/* example from above in for loop, go!*/

/*

    static boolean condi (){
        boolean result = Math.random() <0.99;
        System.out.println(result+". \n");
        return result;
    }

    public static void main(String[] args) {
        for (int i=0; condi(); i++){
            System.out.println("inside " + i);
        }
        System.out.println("outside");
    }


}
*/

/*Ex 4.1 Write a program that prints values from 1 to 100*/


/*
    public static void main(String[] args) {
        for (int i =1; i <=100; i++)
            System.out.println(i);
    }

}*/
/*

    static int i=1;

    public static void main(String[] args) {
        while (i<=100){
            System.out.println(i);
            i++;

        }
    }

}
*/

/*Ex4.2***************************************
*Write a program that generates 25 random int values.
* For each value use an if-else statement to classify
* it as greater than, less than, or equal to a second
* randomly generated value.
 */

/*static Random rand = new Random(47);

static void vroom (){
    int a = rand.nextInt(10);
    int b = rand.nextInt(10);

    System.out.println(a+"------------"+b);

    if (a<b)
        System.out.println("a<b");
    else if (a>b)
        System.out.println("a>b");
    else
        System.out.println("zhey equal!");
}

    public static void main(String[] args) {
        for (int i=0; i<25;i++)
            vroom();
    }

}*/


/*Ex.4.3*****************************
 * Modify previous exercise so that your code is surrounded by an @infinite: while lopp.
 * It will then run until you interrupt it.
 */

/*


    static Random rand = new Random(47);

    static void vroom (){
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);

        System.out.println(a+"------------"+b);

        if (a<b)
            System.out.println("a<b");
        else if (a>b)
            System.out.println("a>b");
        else
            System.out.println("zhey equal!");
    }

    public static void main(String[] args) {
        for (int i=0; i<25;i++)
            vroom();
        // while (true)Ex4.vroom();     //true obviously fulfills the condition, don't even have to put another loop there
    }

}
*/


/* Ex4.4***********************************
*Write a program that uses two nested for loops and the modulus operator
* to detect and print prime numbers
 */


//bookway
/*

static int max = 100;

    public static void main(String[] args) {
        if (args.length !=0)
            max=Integer.parseInt(args[0]);   //TODO What is this?!

        for (int i=1;i<max;i++){
            boolean prime=true;

            for (int j=2; j<i;j++)
                if (i%j==0)
                    prime = false;

            if (prime)
                System.out.print(i+" ");
        }
    }

}

*/

//reverse engineering the crap out of it

//static int max = 100;
//
//
//    public static void main(String[] args) {
//
//        for (int i=1; i<max; i++) { //all numbers
//            boolean prime = true; //setting flag true on all
//            //System.out.println("all "+i+prime); //for testing
//
//            for (int j=2;j<i;j++){  //has to start from 2 or it ends prematurely, fulfilling limit early????
//                if (i%j==0)  //if it passes modulo, dividing without rest, it ain't a prime
//                    prime=false; //so it's flag gets set to false
//                //System.out.println(j+"  "+prime);
//            }
//            if (prime)
//                System.out.println("PRIME  " + i+" "+prime);
//        }
//
//    }
//
//}



/*TODO this is to be repeated along with sieve, also exercise 5 but for that we need BITWISE operators*/


/*Example page 140, for loop for two iterators*/
//definitions only of ONE type, obviously

 /*   public static void main(String[] args) {
        for (int i=1, j=i+10; i<=5 ; i++, j=i*2 ){
            System.out.println("i = " + i + " j = "+ j);
        }
    }

}*/


 /*FOR EACH syntax p 141*/

/*
    public static void main(String[] args) {
        Random rand = new Random(47);
        float f[] = new float[10];

        for (int i = 0; i < 10; i++){  //creating indexes
            f[i] = rand.nextFloat();
            System.out.println(i); }
        for (float x : f) //populating them with random numbers
            System.out.println(x);

    }
}
*/

/*char array p.142*/

/*
    public static void main(String[] args) {
        for (char c : "An African Swallow".toCharArray())
            System.out.println(c + " ");



    }


}
*/

// TODO pg.142, recreate range() method that is kept secret, it is a generator


// method using return, pg143

/*

    static int test (int testval, int target){

        if (testval>target)
            return +1;
        else if (testval<target)
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println(test(10,5));
        System.out.println(test(5, 10));
        System.out.println(test(5,5));
    }

}
*/


/*Ex4.6********************************************************
*Modify the two test() methods in the previous two
* programs so that they take two extra arguments, begin and end, and so that
* testval is tested to see if it is within range between (and including) begin
* and end.
 */
//they want us to switch target for itnerval (interval, ang. przedzial)

/*

static boolean test (int testval, int begin, int end){
    if (testval >=begin && testval<=end)
        return true;
    else if (testval<begin  && testval>end)
        return false;
    else
        return false;
}

    public static void main(String[] args) {
        System.out.println(test(10, 5, 15));
        System.out.println(test(5, 10, 15));
        System.out.println(test(5, 5, 5));
    }
}
*/

//optimized the book way

    /*

    static boolean test (int testval, int begin, int end){
        boolean wynik = false;
        if (testval >=begin && testval <=end)
            wynik=true;
        return wynik;
    }

    public static void main(String[] args) {
        System.out.println(test(10, 5, 15));
        System.out.println(test(5, 10, 15));
        System.out.println(test(5,5,5));
    }
}
*/

//break and continue in practice

/*

    public static void main(String[] args) {
        for (int i=0; i<100;i++){
            if (i==74) break; //out of loop
            if (i % 3 ==0) continue;
            System.out.print(i + " ");
        }
        System.out.println("\n\n");

       int i=0;
       while (true){
           i++;
           int j = i*27;
           if (j == 1269) break; //46*27=2162; 47*27=1269; this is where we break
           if (i % 10 !=0) continue;
           System.out.println(i+" ");
       }
    }
}
*/

//ex. pg147 TODO both, pursue goto!


/*

    public static void main(String[] args) {
        int i=0;

        outer:

        for (; ;){ //infinite loop

            inner:

            for (; i<10; i++){
                System.out.println("i= " +i);
                if (i==2){
                    System.out.println("continue");
                    continue ;
                }
                if (i==3){
                    System.out.println("break");
                    i++; //otherwise i never gets incremented
                    break;
                }
                if (i==7){
                    System.out.println("continue outer");
                    i++; //same
                    continue outer;
                }
                if (i==8){
                    System.out.println("break outer");
                    break outer;
                }
                for (int k=0; k<5; k++){
                    if (k==3){
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
        }
        //cant break or continue to labels here
    }
}
*/

//and #2 / while
/*

    public static void main(String[] args) {
        int i=0;
        outer:
        while (true) {
            System.out.println("Outer while loop");
            while (true){
                i++;
                System.out.println("i = "+i);
                if (i==1){
                    System.out.println("continue");
                    continue;
                }
                if (i==3){
                    System.out.println("continue outer");
                    continue outer;
                }
                if (i==5){
                    System.out.println("break");
                    break ;
                }
                if (i==7){
                    System.out.println("break outer");
                    break outer;
                }
            }
        }
    }
}
*/

//ex. of switch pg152


/*

    public static void main(String[] args) {
        Random rand = new Random(47);
        for (int i=0; i<100; i++){
            int c = rand.nextInt(26) + 'a'; //'a' for lwoercase letters
            System.out.print((char)c + ", "+c+": ");
            switch (c){
                case 'a':
                case 'e':
                case  'i':
                case 'o':
                case 'u':
                    System.out.println("vowel");
                    break;
                    default:
                        System.out.println("consonant");
            }
        }
    }

}
*/


/*Ex4.8*******************************************************
*Create a switch statement that print a message for each
*case, and put the switch inside a for loop that tries each case. Put a break
*after each case and tes it, then remove the breaks and see what happens.
 */
//without break they will be done one after another.
/*

    public static void main(String[] args) {



        for (int s=0; s<=5;s++)
        switch (s) {
            case 1:
                System.out.println(s+"aaa");
                //break;
            case 2:
                System.out.println(s+"bbb");
                //break;
            case 3:
                System.out.println(s+"ccc");
                break;
            case 4:
                System.out.println(s+"ddd");
                break;
            case 5:
                System.out.println(s+"eee");
                break;
        }
        }


}

*/


/*Ex4.9***********************************************************
* A Fibonacci sequence is the sequence of numbers 1,1,2,3,
* 5,8,13,21,34,and so on, where each number (from the third on) is the sum
* of the previous two. Create a method that takes an integer as an argument
* and displays that many Fibonacci numbers starting form the beginning.
 */
/*

static int a=0, b=1, c;
static int i;



public static void fibo (int k){
    for (i=1;i<=k;i++){
    c=a+b;
    a=b;
    b=c;
    System.out.println(i + " "+ a);}
}

    public static void main(String[] args) {
        fibo(15);
    }

}

*/




/*Ex4.10*******************************
vampiric numbers TODO way over my skills right now. Need way, way mroe array skills!

e.g. 1260, 12 and 60 are fangs as 12*60=1260;
 */

    public static void main(String[] args) {
        int [] startDigit = new int[4];
        int [] productDigit = new int[4];

        for (int num1 = 10; num1 <=99; num1++)
            for (int num2 = num1; num2 <=99; num2++){

            if ((num1*num2) % 9 != (num1+num2) %9)
                continue;
            int product = num1 * num2;

            startDigit[0] = num1/10;
            startDigit[1] = num1%10;
            startDigit[2] = num2/10;
            startDigit[3] = num2%10;

            productDigit[0] = product /1000;
            productDigit[1] = (product % 1000) /100;
            productDigit[2] = product % 1000 % 100/10;
            productDigit[3] = product % 1000 % 100 %10;

            int count = 0;
            for (int x=0; x<4;x++)
                for (int y=0; y<4; y++){
                if (productDigit[x] == startDigit[y]){
                    count++;
                    productDigit[x] =-1;
                    startDigit[y]=-2;
                    if (count == 4)
                        System.out.println(num1 + " * "+ num2 + " : " + product);
                }
                }
            }
    }


}













