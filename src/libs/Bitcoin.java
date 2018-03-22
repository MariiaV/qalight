package libs;

public class Bitcoin extends Currency{
    public Bitcoin(double kursNBU, double marga) {
        super(kursNBU, marga);
    }
    @Override
    public double convertGrnToCurrency(int numberOfGrn) {
        System.out.println("\"Операция запрещена нацбанком\"");
        return numberOfGrn;
    }

    @Override
    public double convertCurrencyToGrn(int numberOfCurrency) {

        System.out.println("\"Операция запрещена нацбанком\"");
        return numberOfCurrency;
    }

    @Override
    public String getName() {
        return "Bitcoin";
    }

    }

