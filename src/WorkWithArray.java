public class WorkWithArray {

    public static void fillingOFDiagonal(int [][] arrayArray) {



        for (int i = 0; i < arrayArray.length; i++) {
            for (int j = 0; j < arrayArray[i].length; j++) {
                if (i == 0 && j == 0) {
                    arrayArray[i][j] = 1;
                } else if (i == 1 && j == 1) {
                    arrayArray[i][j] = 1;
                } else if (i == 2 && j == 2) {
                    arrayArray[i][j] = 1;
                } else {
                    arrayArray[i][j] = 0;
                }


                System.out.print(" " + arrayArray[i][j]);
            }
            System.out.println("");
        }
    }

    public static void fillingOFDiagonalright(int [][] arrayArray) {



        for (int i = 0; i < arrayArray.length; i++) {
            for (int j = 0; j < arrayArray[i].length; j++) {
                if (i == 0 && j == 2) {
                    arrayArray[i][j] = 1;
                } else if (i == 1 && j == 1) {
                    arrayArray[i][j] = 1;
                } else if (i == 2 && j == 0) {
                    arrayArray[i][j] = 1;
                } else {
                    arrayArray[i][j] = 0;
                }


                System.out.print(" " + arrayArray[i][j]);
            }
            System.out.println("");
        }


        // WorkWithArray.filld (arrayArray, 1);
        int[][] arrayArray1 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

    }

}

