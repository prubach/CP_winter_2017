package pl.waw.sgh;

public class for_loop {

    /*    public static void main(String[] args) {


            for (int i = 0; i < 5; i++) {

                System.out.println(i+1 + "st "+"Loop");
            }
        }
    }*/
    public static void main(String[] args) {


        for (int j = 5; j > 0; j--) {
            if (j==4) continue;
            System.out.println("j=".concat(new Integer(j).toString()));
            if (j==2) break;
        }
    }
}

/*

    public static void main(String[] args) {

        String s1 = "abd";

        Integer i1 = 35445;

        s1 = s1+i1;

        String s2 = i1.toString();
        s1 = s1.concat(s2);
        System.out.println(s1);
    }
}*/
