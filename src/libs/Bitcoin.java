package libs;

import org.apache.log4j.Logger;

public class Bitcoin extends Currency{
    Logger logger = Logger.getLogger(getClass());
    public Bitcoin(double kursNBU, double marga) {
        super(kursNBU, marga);
    }
    @Override
    public double convertGrnToCurrency(int numberOfGrn) {
        logger.info("\"Операция запрещена нацбанком\"");
        return numberOfGrn;
    }

    @Override
    public double convertCurrencyToGrn(int numberOfCurrency) {

        logger.info("\"Операция запрещена нацбанком\"");
        return numberOfCurrency;
    }

    @Override
    public String getName() {
        return "Bitcoin";
    }

    }

