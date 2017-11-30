package pl.waw.sgh.shapes;

public class PlayingWithShapes {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setParams(4,6);
        System.out.println(r1.calcSurface());
    }
}
