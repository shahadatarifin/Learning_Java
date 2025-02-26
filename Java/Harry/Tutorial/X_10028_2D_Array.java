public class X_10028_2D_Array {
    public static void main(String[] args) {

        int[][] floor = new int[3][3];

        floor[0][0] = 001;
        floor[0][1] = 002;
        floor[0][2] = 003;

        floor[1][0] = 101;
        floor[1][1] = 102;
        floor[1][2] = 103;

        floor[2][0] = 201;
        floor[2][1] = 202;
        floor[2][2] = 303;


        for (int i = 0; i < floor.length; i++) { //
            for (int j = 0; j < floor[0].length; j++) {
                System.out.printf("Floor[%d][%d] -> ", i, j);
                System.out.print(floor[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
