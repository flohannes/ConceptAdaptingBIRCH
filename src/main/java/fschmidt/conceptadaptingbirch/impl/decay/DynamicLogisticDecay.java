package fschmidt.conceptadaptingbirch.impl.decay;

import org.apache.commons.math3.analysis.function.Logistic;

/**
 *
 * @author fschmidt
 */
public class DynamicLogisticDecay extends DecayFunction {

    private Logistic logistics;
    private final double growthRate;

    public DynamicLogisticDecay(double growthRate) {
        this.growthRate = growthRate;
    }

    public double getValue(int t, double... parameters) {
        logistics = new Logistic(parameters[0], 1, growthRate, 1, 0, 0.1);
        return logistics.value(t);
    }
}
