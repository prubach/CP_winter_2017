package pl.waw.sgh;

public class InputArgs {

    public static void main(String[] args) {

        double sum = 0;

        for (String a : args) {
            sum += Double.parseDouble(a);
        }
        System.out.println("Sum of args is " + sum);
    }
}


/*java -jar GuiInput.jar 5435 5445 544355
* add those in debug arguments
 */