package pl.waw.sgh.OBJ;

public class Rectangle {

    double sideA;  //class level
    double sideB;

    public Rectangle(){
        this.sideA=10;
        this.sideB=15;
    }


    public void setParams(double sideA, double sideB){   //in method

        this.sideA = sideA;     //refering one to other
        this.sideB = sideB;
    }

    public double calcSurface(){
        return sideA*sideB;
    }
}
