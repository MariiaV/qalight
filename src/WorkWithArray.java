import org.apache.log4j.Logger;

public class WorkWithArray {
    Logger logger = Logger.getLogger(getClass());

    public int [][] fillingOFDiagonal(int[][] arrayArray, int value) {
        try {


            if (arrayArray.length == arrayArray[0].length) {
                if ((arrayArray.length > 0) && (arrayArray[0].length > 0)) {
                    //    int[][] arrayArray = new int[3][3];
                    for (int i = 0; i < arrayArray.length; i++) {
                        for (int j = 0; j < arrayArray[i].length; j++) {
                            if (i == j) {
                                arrayArray[i][j] = value;
                            }


                            //  System.out.print(arrayArray[i][j]);
                        }


                        // System.out.println("");
                        printArray(arrayArray);
                    }
                } else {
                    System.out.println("length <= 0");

                }
            } else {
                System.out.println(" Lenght should be the same ");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        return arrayArray;
    }

    public void fillingOFDiagonal(String[][] arrayArray, int value) {
        try {


            if (arrayArray.length == arrayArray[0].length) {
                if ((arrayArray.length > 0) && (arrayArray[0].length > 0)) {
                    //    int[][] arrayArray = new int[3][3];
                    for (int i = 0; i < arrayArray.length; i++) {
                        for (int j = 0; j < arrayArray[i].length; j++) {
                            if (i == j) {
                                arrayArray[i][j] = String.valueOf( value);
                            }


                            //  System.out.print(arrayArray[i][j]);
                        }


                        // System.out.println("");
                        printArray(arrayArray);
                    }
                } else {
                    System.out.println("length <= 0");

                }
            } else {
                System.out.println(" Lenght should be the same ");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    private void printArray (int [][] ourArray){
        for (int i = 0; i < ourArray.length ; i++) {
            for (int j = 0; j < ourArray[0].length ; j++) {
                System.out.print(ourArray[i][j]);
            }
            System.out.println("");
        }
    }

    private void printArray(String[][] ourArray) {
        for (int i = 0; i < ourArray.length; i++) {
            for (int j = 0; j < ourArray[0].length; j++) {
                System.out.print(ourArray[i][j]);
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

