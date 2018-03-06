import libs.Calc;

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
        WorkWithArray.fillingOFDiagonal();
        WorkWithArray.fillingOFDiagonalright();


    }

}
