package pl.waw.sgh;

        import java.util.Scanner;

public class Check_Profit {

    public static void main(String[] args) {
        double cost = 343;
        double sell = 767;
        int unitsSold = 0;

        System.out.println("Please provide unit cost: ");
        cost = new Scanner(System.in) .nextDouble();
        System.out.print("Please provide selling price: ");
        sell = new Scanner(System.in) .nextDouble();
        System.out.print ("Please provide units sold: ");
        unitsSold = new Scanner(System.in) .nextInt();


      if(cost<sell){
          System.out.println("YAY");

        }
        else {
          System.out.println("OWWW");
      }
    }
}
