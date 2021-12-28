public class Sofa extends Furniture{
    private double Sofav;

    Sofa() {
        super();
        Sofav = 0;
    }

    Sofa(String sofaname, double SofaValue) {
        super(sofaname);
        Sofav = SofaValue;
    }

    public void AreaSet(int SofaValue) {
        Sofav = SofaValue;
    }

    public double AreaValue() {
        return Sofav;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "Sofa_v=" + Sofav +
                "Type=" + getType() +
                '}';
    }
}