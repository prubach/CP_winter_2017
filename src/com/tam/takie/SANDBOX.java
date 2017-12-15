package com.tam.takie;

import java.util.Date;


public class SANDBOX {

 /* public static void main (String [] args){
int c=0;
int e=0;
    int d;
    int f;

    d= c++;  //0+1
    f=++c;


      System.out.println(d);
      System.out.println(f);
  }


}
*/
/*
static int a = 2;
static int b = 7;
static int c, d, e, f;

    public static void main(String[] args) {
      c=-a;
        System.out.println(c);

        d=a*-b;
        System.out.println(d);

        e=a*(-b);
        System.out.println(e);

        System.out.println(a);
        a-=b;
        System.out.println(a);

        f=b--;
        System.out.println(f);
    }
}*/

/*    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);

        //System.out.println(n1 == n2);  //those operators compare references!
        //System.out.println(n1 != n2);

        System.out.println(n1.equals(n2));

    }
}*/

/*
static int i;


    public static void main(String[] args) {
        SANDBOX v1 = new SANDBOX();
        SANDBOX v2 = new SANDBOX();
        v1.i = v2.i = 100;
        System.out.println(v1.i);
        System.out.println(v2.i);

        System.out.println(v1.equals(v2));

    }
}
*/

/*
    public static void main(String[] args) {
        int t1 = 0x2f;
        System.out.println(t1);
        *//* 2=2*16=32; f=16*16^0=16; 32+16=48  It is the 0! Must be!*//*
    }


}*/

/* 0 1, 1, 2 , 3 , 5 , 8 , 13,
*
* fibonacci sequence mechanic without loop*/

/*

    static int a=0, b=1, c;

    public static void main(String[] args) {
        System.out.println("0. "+a+"--"+b);
        c=a+b; a=b; b=c;
        System.out.println("1. "+a+"--"+b);
        c=a+b; a=b; b=c;
        System.out.println("2. "+a+"--"+b);
        c=a+b; a=b; b=c;
        System.out.println("3. "+a+"--"+b);
        c=a+b; a=b; b=c;
        System.out.println("4. "+a+"--"+b);
        c=a+b; a=b; b=c;
        System.out.println("5. "+a+"--"+b);
        c=a+b; a=b; b=c;
        System.out.println("6. "+a+"--"+b);
        c=a+b; a=b; b=c;
        System.out.println("7. "+a+"--"+b);
        c=a+b; a=b; b=c;
        System.out.println("8. "+a+"--"+b);

    }

}

*/

/*
//fibo recuriosn example


public static void fibo (int n1, int n2, int index, int count){

    if (count<index){   //ending condition
        int newnumber = n1+n2;  //fibo sequence rule, n3=n1+n2
        System.out.print(newnumber + " ");
        fibo(n2, newnumber, index, ++count);  //here the method is calling upon itself, this is where recursion takes place
    }
}

    public static void main(String[] args) {

        System.out.print("0 1 ");
        fibo(0, 1, 20, 2);
    }
}
//todo figure out what ++count does

*/

//Playing with arrays


    /*

    static int [] array = new int[7];

    public static void main(String[] args) {
        for (int i=0; i<array.length; i++){
            array [i]=100+i*3;
            System.out.println(array[i]);
        }
    }

}
*/

    public static void main(String[] args) {
        String s = "Vroom";

        for (char c: s.toCharArray()) {
            System.out.println(c);

        }

    }




}













