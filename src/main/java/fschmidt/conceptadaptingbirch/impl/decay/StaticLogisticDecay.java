package fschmidt.conceptadaptingbirch.impl.decay;

import org.apache.commons.math3.analysis.function.Logistic;

/**
 *
 * @author fschmidt
 */
public class StaticLogisticDecay extends DecayFunction {

    private final Logistic logistics;

    public StaticLogisticDecay(double maximumValue, double growthrate) {
        logistics = new Logistic(maximumValue, 1, growthrate, 1, 0, 0.1);
    }

    public double getValue(int t, double... parameters) {
        return logistics.value(t);
    }
}
