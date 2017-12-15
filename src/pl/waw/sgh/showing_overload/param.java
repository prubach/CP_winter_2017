package pl.waw.sgh.showing_overload;

public class param {

    double parA;

    double parB;

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

    public param(double parA) {
        this.parA = parA;
    }

    public param() {
        super();
    }
}
