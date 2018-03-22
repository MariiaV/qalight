package libs;

import org.apache.log4j.Logger;

abstract public class Currency {
    Logger logger = Logger.getLogger(getClass());

    private double kursNBU;

    private double marga;


    public Currency(double kursNBU, double marga) {

        this.kursNBU = kursNBU;
        this.marga = marga;

    }

    public double getKursNBU() {
        return kursNBU;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getkursForSell() {
        return kursNBU / marga;
    }

    public double getKursForBuy() {
        return kursNBU * marga;
    }

    public double convertGrnToCurrency(int numberOfGrn) {
        double tempResult = numberOfGrn / getKursForBuy();
        logger.info("For" + numberOfGrn + "grn you get" + tempResult + " " + getName());
        return tempResult;
    }

    public double convertCurrencyToGrn(int numberOfCurrency) {
        double tempResult = numberOfCurrency * getkursForSell();
        logger.info("You get" + tempResult + "grn for" + numberOfCurrency + " " + getName());
        return tempResult;
    }

    abstract public String  getName();
}
