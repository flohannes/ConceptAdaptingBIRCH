package fschmidt.conceptadaptingbirch.impl.decay;

/**
 *
 * @author fschmidt
 */
public class StaticDecay extends DecayFunction {

    private final double value;

    public StaticDecay(double value) {
        this.value = value;
    }

    public double getValue(int t, double... parameters) {
        return value;
    }
}
