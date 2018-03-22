import org.apache.log4j.Logger;

public class WorkWithArray {
    Logger logger = Logger.getLogger(getClass());
    static Logger loggerStatic = Logger.getLogger("WorkWithArray");

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
                    logger.info("length <= 0");

                }
            } else {
                logger.info(" Lenght should be the same ");
            }
        } catch (Exception e) {
            logger.error("Error");
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
                    logger.info("length <= 0");

                }
            } else {
                logger.info(" Lenght should be the same ");
            }
        } catch (Exception e) {
            logger.error("Error");
        }
    }

    private void printArray (int [][] ourArray){
        for (int i = 0; i < ourArray.length ; i++) {
            for (int j = 0; j < ourArray[0].length ; j++) {
                logger.info(ourArray[i][j]);
            }
            logger.info("");
        }
    }

    private void printArray(String[][] ourArray) {
        for (int i = 0; i < ourArray.length; i++) {
            for (int j = 0; j < ourArray[0].length; j++) {
                logger.info("[i][j]");
            }
            logger.info("");
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


                loggerStatic.info(" " + arrayArray[i][j]);
            }
            loggerStatic.info("");
        }


        // WorkWithArray.filld (arrayArray, 1);
        int[][] arrayArray1 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

    }

}

