package libs;

public class UZdollar extends Currency implements FreeConver{

    public UZdollar(double kursNBU, double marga) {
        super(kursNBU, marga);
    }

    @Override
    public String getName() {
        return "UZ";
    }

    @Override
    public boolean isFreeConver() {
        return false;
    }
}