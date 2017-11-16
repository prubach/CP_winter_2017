package pl.waw.sgh;

public class Arrays2D {

    public static void main(String[] args) {

        int[][] arr2D = new int[3][4];

        arr2D[0][3] = 56;
        arr2D[0][0] = 676;
        arr2D[1][1] = 569;
        arr2D[2][2] = 245;
        arr2D[2][3] = 867;

        System.out.println("Length of arr2D: " + arr2D.length);
        System.out.println("# cols of arr2D: " + arr2D[0].length);
        // processing rows
        for (int i=0;i<arr2D.length;i++) {
            // process every cell
            for (int j=0;j<arr2D[i].length;j++) {
                System.out.print(arr2D[i][j] + "\t");
            }
            System.out.println("|");
        }
        System.out.println("-----------------");

    }
}
