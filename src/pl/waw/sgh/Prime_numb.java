package pl.waw.sgh;

public class Prime_numb {


    public static void main(String[] args) {

        int a, b, d=0;
        b = 9;


        for (a = 2; a <= b / 2; ++a) {

            if (a % b == 0) {
                d=1;
                break;
            } else {
                System.out.println("prime");
            }
        }

    }
}