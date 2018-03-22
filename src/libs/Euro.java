package libs;

public class Euro extends Currency implements FreeConver {

    public Euro(double kursNBU, double marga) {
        super(kursNBU, marga);
    }

    @Override
    public String getName() {
        return "Euro";
    }

    @Override
    public boolean isFreeConver() {
        return true;
    }
}
