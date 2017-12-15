package pl.waw.sgh;

public class Switch {


    public static void main(String[] args) {   //psvm <-shortcut!
        final String PL = "Poland";//constant
        final String US = "United States";
        final String GB = "Great Britain";


        String country = "Poland";

        switch (country) {
            case PL:
                System.out.println("Witaj!!");
                break;
            case GB:

            case US:
                System.out.println("High Five!");
                break;

            default:
                System.out.println("Not sure how to greet you.");
        }
    }
}
