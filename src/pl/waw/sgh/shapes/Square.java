package pl.waw.sgh.shapes;

public class Square extends Shape implements PerimeterCalculation {

    public Square(Params params) {
        super(params);
    }

    @Override
    public double calcPerimeter() {
        return 4* parA;
    }

    @Override
    public double calcSurface() {
        return Math.pow(parA,2);
    }
}
