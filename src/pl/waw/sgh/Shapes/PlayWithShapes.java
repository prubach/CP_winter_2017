/*
package pl.waw.sgh.shapes;

public class PlayingWithShapes {

    public static void main(String[] args) {
        Params params = new Params(4,6);
        Rectangle r1 = new Rectangle(params);
        //r1.setParams(4,6);

        Params params1 = new Params();

        ParamsSimple parSim = new ParamsSimple();
        parSim.parA = 4;
        parSim.parB = 6;
        r1.setParams(parSim);


        //params.parA = 54;
        //params.setParA(54);

        r1.setParams(params);
        Rectangle r2 = new Rectangle(new Params(3,4));
        //r2.setParams(new Params(4, 6));
        r2.setParams(params);

        if (r1.equals(r2))
            System.out.println("r1 equal to r2");
*/
/*        if (r1.isEqual(r2))
            System.out.println("r1 isEqual to r2");
*//*

        Circle c1 = new Circle(new Params(3));
        //System.out.println(r1.calcSurface());
        System.out.println(r1);
        System.out.println(c1);

        c1.setParams(5,0);
        System.out.println(c1.calcSurface());

        Shape[] shapes = new Shape[4];
        shapes[0] = r1;
        shapes[1] = c1;
        shapes[2] = new Circle(new Params(6));
        shapes[2].setParams(2);
        shapes[3] = new NewRectangle(new Params(3,5));

        for (Shape s : shapes) {
            System.out.println("Shape: " + s);
            System.out.println("Surface: " + s.calcSurface());
            if (s instanceof Rectangle) {
                // System.out.println(((Circle)s).calcSurface());
                System.out.println("Perimeter: " + ((Rectangle)s).calcPerimeter()  );
            }
        }


*/
/*
        Shape s1 = new Shape();
        System.out.println(s1);
*//*


    }
}*/
