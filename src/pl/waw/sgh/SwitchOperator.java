package pl.waw.sgh;

public class SwitchOperator {

    public static void main(String[] args) {
        final String PL = "Poland";
        final String US = "United States";
        final String GB = "Great Britain";

        //String country = "Poland";
        //String country = "Great Britain";
        String country = "United ...";

        switch (country) {
            case PL:
                System.out.println("Witaj!!");
                break;
            case GB:
            case US:
                System.out.println("Hello");
                break;
            default:
                System.out.println("Don't know how to greet you!!!");
        }

    }
}
