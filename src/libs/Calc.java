package libs;


import org.apache.log4j.Logger;

public class Calc {
    Logger loger =Logger.getLogger(getClass());
   static Logger loggerStatic = Logger.getLogger("Calc");

    public static void sum(int tempVar1, int tempVar2) {
        loggerStatic.info("Rez = " + (tempVar1 + tempVar2));

    }

    public static void negate(int tempVar1, int tempVar2) {
        loggerStatic.info("Rez = " + (tempVar1 - tempVar2));
    }

    public static void multiply(int tempVar1, int tempVar2) {
        loggerStatic.info("Rez = " + (tempVar1 * tempVar2));
    }


    public static void division(int tempVar1, int tempVar2) {
        loggerStatic.info("Rez division int = " + (tempVar1 / tempVar2));
    }

    public static void division(double tempVar1, double tempVar2) {
        loggerStatic.info("Rez division double = " + (tempVar1 / tempVar2));
    }
    public static void sum(String stringVar, int intVar) {
        try {


            int rez = Integer.parseInt(stringVar) + intVar;
            loggerStatic.info("Rez sum String and int = " + rez);

        } catch (NumberFormatException e) {
           loggerStatic.error(" ERROR : numberFormat " + e.getStackTrace());
        } catch (Exception e) {
            loggerStatic.error( e.getMessage());

        }

    }
}
