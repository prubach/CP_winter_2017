package pl.waw.sgh;

public class StringOper {
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "def";


        String s3= s1+s2;
        String s4=s1.concat(s2);

        System.out.println(s3);
        System.out.println(s4);



        String s5 = s3.substring(3); //counting form 4th character on, so after 3rd
        System.out.println(s5);

        String s6 = s3.substring(2 , 4 );  // (nix before 2nd and 2nd itself   ,    nix after 4th and 4th itself)
        System.out.println(s6);


        int bPos = s3.indexOf("b");
        //
        System.out.println("bPos " + bPos);  //obviously b is 1st character because a is 0th

        s6 = s3.replace('b', 'B');

        System.out.println(s6);

        System.out.println(s6.charAt(5));  //again a is 0th so f is 5th
        if (s6.startsWith("aB"))
            System.out.println("s6 starts with aB");


    }
    }

