package pl.waw.sgh;

public class Array {




    public static Double sumDoubles (Double [] arr) {
        Double sum = 0d;
        //Take each element form arr and reference it as el
        for (Double el: arr
             ) {
            sum +=el;  //sum=el+sum;
           // return sum;
        }
        return sum;
    }





    public static void main(String[] args) {

     //   int [] myIntArray = new int[5];  //uninitialized gives a 0
     Integer [] myIntArray = new Integer[5];  // uninitialized gives a null, an empty pointer

        //null cannot be part of equation, message by itself

          //specify either size or elements
        Double [] myDbArr = new Double[] {3223.5, 535.45, 56546.65};

        //arrays cannot be resized after created

        myIntArray[0]=4343; //giving values using indexes
        myIntArray[1]=523453;
        myIntArray[2]=34134;

        Integer sum = 0;

        for (int i=0; i<myIntArray.length; i++){
            System.out.println("myIntArr, elemnt "+i+ " = " + myIntArray[i]);

           if (myIntArray[i]!=null)   //Omitting nulls during solving the equation



            sum=sum+myIntArray [i];   //sum +=equiv

            System.out.println("incremental sum is: " +sum);

        }

        Double sumD = sumDoubles(myDbArr);
        System.out.println(sumD);

        System.out.println();

        for (int i=0; i<myDbArr.length;i++){
            System.out.println(i+" - "+myDbArr[i]);
        }

        System.out.println();

        for (int i=0; i<myIntArray.length; i++){
            System.out.print(myIntArray[i]+" ");
        }
        System.out.println();

//        for (:
//             ) {
//
//        }

        //Double sumI = sumDoubles(myIntArray);
        //System.out.println(sumI);
        //TODO make an overloaded function which will also sum up integers
    }

}
