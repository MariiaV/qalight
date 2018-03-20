import libs.Calc;
import libs.WorkWithList;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        System.out.println("Hello!");
        System.out.println("Hello!");
        int var_1;
        var_1 = 5;
        int var_2 = 10;
        System.out.println(var_1 + var_2);
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

        System.out.println("-- end --");


    }

}
