package pl.waw.sgh;

import pl.waw.sgh.shapes.Params;
import pl.waw.sgh.shapes.Rectangle;

import java.util.Collection;

public class Lists {

    public static void main(String[] args) {
        Object[] myObjs = new Object[3];
        myObjs[0] = 565;
        myObjs[1] = "some text";
        myObjs[2] = new Rectangle(new Params(3, 5));

        for (Object myObj : myObjs) {
            //System.out.println("Object: " + myObj.toString());
            System.out.println("Object: " + myObj);
        }

        //Collection



    }
}
