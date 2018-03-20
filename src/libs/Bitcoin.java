package libs;

public class Bitcoin extends Currency implements FreeConver {
    public Bitcoin(double kursNBU, double marga) {
        super(kursNBU, marga);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean isFreeConver() {
        return false;
    }
}
