package fschmidt.conceptadaptingbirch.impl.decay;

/**
 *
 * @author fschmidt
 */
public class DynamicValueDecay extends DecayFunction {

    public double getValue(int t, double... parameters) {
        return parameters[0];
    }
}
