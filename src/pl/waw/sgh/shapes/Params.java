package pl.waw.sgh.shapes;

public class Params {

    private double parA;

    private double parB;

    public Params() {
    }

    public Params(double parA, double parB) {
        this.parA = parA;
        this.parB = parB;
    }

    public Params(double parA) {
        this.parA = parA;
    }

    public double getParA() {
        return parA;
    }

    public void setParA(double parA) {
        this.parA = parA;
    }

    public double getParB() {
        return parB;
    }

    public void setParB(double parB) {
        this.parB = parB;
    }

    @Override
    public String toString() {
        return "Params{" +
                "parA=" + parA +
                ", parB=" + parB +
                '}';
    }
}
