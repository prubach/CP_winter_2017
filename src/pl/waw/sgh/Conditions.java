package pl.waw.sgh;

public class Conditions {

    public static void main(String[] args) {

        int b = 6;
        {
            int a = 5;
            System.out.println("Run from a sub block");
            System.out.println("a=" + a);
            System.out.println("b=" + b);
            {
                int c = 8;
                System.out.println("a=" + a);
                System.out.println("b=" + b);
            }
        }
        // a not visible in this outer block
        //System.out.println("a=" + a);
        System.out.println("b=" + b);

        //TODO sth to do

        boolean myCond = false;

        if (myCond) {
            System.out.println("myCond is true");
            System.out.println("I'm in the first if block");
        }
        /*else {
            System.out.println("myCond is false");
        }*/
        // > >= < <= ==

        // compare with a value - primitive data type
        if (b==6) {
            System.out.println("b equal 6");
        }


        String s1 = "abc";
        String s2 = "abc";

        String s3 = new String("abc");

        if (s1==s2) {
            System.out.println("String s1 and s2 are equal");
        }

        // Compare if pointers point to the same object
        // Don't use it to compare values...
        if (s1==s3) {
            System.out.println("String s1 and s3 are equal");
        }

        if (s1.equals(s3)) {
            System.out.println("String s1 and s3 equal using equals method");
        }


        if (b>4 && s1.equals(s3)) {
            System.out.println("b >4 and s1 and s3 store the same text");
        }

        int c;

        if (b>4)
            c = b;
        else
            c = 2;
        // equivalent of the above
        c = b>4 ? b : 2;


    }

}
