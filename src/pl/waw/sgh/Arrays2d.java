package pl.waw.sgh;

public class Arrays2d {

    public static void main(String[] args) {

        int [] SumArr = new int[4];

        int [] [] arr2D = new int [3][4];

        //int [] [] vertSum = new int[3][1];  //todo this

        int [] vSum = new int[3];

        int sum2 =0
                ;
        arr2D[0][3] = 56;
        arr2D [0] [0] = 676;
        arr2D [1][1]=569;
        arr2D[2] [2] = 245;
        arr2D [2] [3] = 867;

        //two dimensions, two loops, nested

        System.out.println( "Length "+ arr2D.length);

        System.out.println("cols " + arr2D[0].length);

        //processing rows
        for (int i=0; i<arr2D.length;i++){  //rows
            //process every cell
            for (int j=0; j<arr2D[i].length;j++){  //cols
                System.out.print(arr2D[i][j]+"\t");

                SumArr [j] += arr2D [i][j];

                // vertSum[i][j] += arr2D[i][j];  NOPE TODO how to sum this up?

                vSum[i] += arr2D[i][j];

                sum2  += arr2D[i][j];

            }
            System.out.print("- ");

            System.out.println(arr2D [i][0]+arr2D[i][1]+arr2D[i][2]+arr2D[i][3]);

        }

//TODO: fix this!
//        for (int i=0;i<vertSum.length;i++){
//            for (int j=0; j<vertSum.length;j++){
//                vertSum [i][j] += arr2D [i][j];
//                System.out.print(" "+ vertSum[i]);
//            }
//        }


        System.out.println("-------------------------------");


        for (int k=0; k<SumArr.length;k++){   //loop for printing out arrays
            System.out.print(SumArr[k]+ " ");
        }

        System.out.println("  "+sum2);

        System.out.println("\n");

        for (int i =0; i<vSum.length; i++){
            System.out.println(vSum[i]);}

        System.out.println("\n");

//        for (int i=0; i<vertSum.length;i++){  //TODO as above
//            for (int j=0; j<vertSum[i].length;j++){
//                System.out.println(vertSum[i][j]);
//            }
        }



//        for (int z = 0; z<arr2D.length; z++){
//
//            for (int s=0; s<arr2D.length;s++)
//
//            System.out.println(arr2D[s][z]);
 //       }






    }



//        System.out.print(arr2D [0][0] + arr2D [1][0] + arr2D [2][0]+" ");
//        System.out.print(arr2D [0][1] + arr2D [1][1] + arr2D [2][1]+" ");
//        System.out.print(arr2D [0][2] + arr2D [1][2] + arr2D [2][2]+" ");
//        System.out.print(arr2D [0][3] + arr2D [1][3] + arr2D [2][3]+" ");
