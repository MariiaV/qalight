import libs.*;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MainClass");

        logger.info("Test");
        logger.debug("TestDebug");
        logger.error("TestError");

        logger.info("Hello!");
        logger.info("Hello!");
        int var_1;
        var_1 = 5;
        int var_2 = 10;
        logger.info(var_1 + var_2);
//        int rez = var_1 + var_2;
//        System.out.println("Rez =" + rez);
        Calc.sum(var_1, var_2);


        int var_3 = 15;
        //System.out.println("Rez = " + (var_1 + var_3));

        Calc.sum(var_1, var_3);
        Calc.negate(var_1, var_3);
        Calc.multiply(var_1, var_3);
        Calc.division(var_2, var_1);
        Calc.division((double) var_2, (double) var_1);
        int[][] arrayArray = new int[3][3];
        WorkWithArray workWithArray = new WorkWithArray();






        // WorkWithArray.filld (arrayArray, 1);
        int[][] arrayArray1 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        workWithArray.fillingOFDiagonal(arrayArray, 8);
        workWithArray.fillingOFDiagonal(arrayArray, 4);
        int[][] emptyArray = new int[0][0];
        int[][] rezMatrix2 = workWithArray.fillingOFDiagonal(emptyArray, 6);

        WorkWithList workWithList = new WorkWithList();
        List<List<String>> ourList = new ArrayList<>();
        List<String> ourList2 = new ArrayList<>();

        workWithList.addListToList(ourList, ourList2);
        workWithList.addValueToListList(0, "test01", ourList);

        workWithList.addListToList(ourList, ourList2);
        workWithList.addValueToListList(1, "test11", ourList);
        workWithList.addValueToListList(1, "test12", ourList);
        workWithList.addValueToListList(0, "test02", ourList);

        workWithList.addListToList(ourList, ourList2);
        workWithList.addValueToListList(2, "test21", ourList);
        workWithList.addValueToListList(1, "test13", ourList);

        workWithList.printListList(ourList);

        Dollar dollar = new Dollar(25, 1.15);
        logger.info(dollar.getKursNBU());
        dollar.setKursNBU(30);
        logger.info(dollar.getKursNBU());
        dollar.setKursNBU(15);
        dollar.setKursNBU(10);
        logger.info(dollar.getKursNBU());

        Bitcoin bitcoin = new Bitcoin(1000,200);
        System.out.println(bitcoin.getKursNBU());
        bitcoin.convertCurrencyToGrn(20);

        UZdollar uZdollar = new UZdollar(40,1.8);
        System.out.println(uZdollar.getKursNBU());
        uZdollar.convertGrnToCurrency(10000);

        dollar.convertGrnToCurrency(1000);
        dollar.convertCurrencyToGrn(100);

        System.out.println("-- end --");


    }

}
