package pl.waw.sgh.shapes;

public class PlayingWithShapes {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setParams(4,6);
        Rectangle r2 = new Rectangle();
        r2.setParams(4,6);

        if (r1.equals(r2))
            System.out.println("r1 equal to r2");
/*        if (r1.isEqual(r2))
            System.out.println("r1 isEqual to r2");
*/
        Circle c1 = new Circle();
        //System.out.println(r1.calcSurface());
        System.out.println(r1);
        System.out.println(c1);

    }
}
