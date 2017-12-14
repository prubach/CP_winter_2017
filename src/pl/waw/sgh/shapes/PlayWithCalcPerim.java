package pl.waw.sgh.shapes;

import java.util.ArrayList;
import java.util.List;

public class PlayWithCalcPerim {

    public static void main(String[] args) {
        Params params = new Params(4,6);
        Rectangle r1 = new Rectangle(params);
        Circle c1 = new Circle(new Params(2));
        Square s1 = new Square(new Params(2));
        List<Shape> shapes = new ArrayList<>();
        shapes.add(r1);
        shapes.add(c1);
        shapes.add(s1);
        for (int i=0;i<shapes.size();i++) {
            if (shapes.get(i) instanceof PerimeterCalculation) {
                PerimeterCalculation pm = (PerimeterCalculation)shapes.get(i);
                System.out.println(pm + " perimiter: " + pm.calcPerimeter());
            }
        }
    }
}
