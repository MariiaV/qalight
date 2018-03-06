package libs;

public class Calc {

    public static void sum(int tempVar1, int tempVar2) {
        System.out.println("Rez = " + (tempVar1 + tempVar2));
    }

    public static void negate(int tempVar1, int tempVar2) {
        System.out.println("Rez = " + (tempVar1 - tempVar2));
    }

    public static void multiply(int tempVar1, int tempVar2) {
        System.out.println("Rez = " + (tempVar1 * tempVar2));
    }


    public static void division(int tempVar1, int tempVar2) {
        System.out.println("Rez division int = " + (tempVar1 / tempVar2));
    }

    public static void division(double tempVar1, double tempVar2) {
        System.out.println("Rez division double = " + (tempVar1 / tempVar2));
    }

}
