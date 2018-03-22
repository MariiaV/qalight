package libs;

public class Dollar extends Currency implements FreeConver{


    public Dollar(double kursNBU, double marga) {
        super(kursNBU, marga);
    }

    @Override
    public String getName() {
        return "USD";
    }

    @Override
    public boolean isFreeConver() {
        return true;
    }
}