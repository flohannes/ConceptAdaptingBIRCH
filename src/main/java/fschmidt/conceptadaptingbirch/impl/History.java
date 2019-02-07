package fschmidt.conceptadaptingbirch.impl;

import com.yahoo.labs.samoa.instances.*;
import moa.classifiers.functions.SGD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Used to approximate the future radius and threshold by using stochastic gradient descent.
 *
 * @author fhofmann, fschmidt (removed simple regression due to problems with large sums)
 */
public class History {

    private final SGD radius;
    private final SGD threshold;

    public History() {
        List<Attribute> attributesRadius = new ArrayList<>();
        attributesRadius.add(new Attribute("n"));
        Attribute classAttrRadius = new Attribute("class", new ArrayList<>(Collections.singletonList("")));
        attributesRadius.add(classAttrRadius);
        Instances instancesRadius = new Instances("radius data", attributesRadius, 0);
        InstancesHeader headerRadius = new InstancesHeader(instancesRadius);
        headerRadius.setClassIndex(0);
        radius = new SGD();
        radius.setModelContext(headerRadius);
        radius.prepareForUse();
        radius.setLossFunction(2);
        radius.setLearningRate(0.2);

        List<Attribute> attributesThreshold = new ArrayList<>();
        attributesThreshold.add(new Attribute("n"));
        Attribute classAttrThreshold = new Attribute("class", new ArrayList<>(Collections.singletonList("")));
        attributesThreshold.add(classAttrThreshold);
        Instances instancesThreshold = new Instances("threshold data", attributesThreshold, 0);
        InstancesHeader headerThreshold = new InstancesHeader(instancesThreshold);
        headerThreshold.setClassIndex(0);
        threshold = new SGD();
        threshold.setModelContext(headerThreshold);
        threshold.prepareForUse();
        threshold.setLossFunction(2);
        threshold.setLearningRate(0.2);
    }

    protected void insertData(double n, double radius, double threshold) {
        InstanceImpl instanceRadius = new InstanceImpl(1d, new double[]{n});
        instanceRadius.setDataset(this.radius.getModelContext());
        instanceRadius.setClassValue(radius);
        this.radius.trainOnInstance(instanceRadius);

        InstanceImpl instanceThreshold = new InstanceImpl(1d, new double[]{n});
        instanceThreshold.setDataset(this.threshold.getModelContext());
        instanceThreshold.setClassValue(threshold);
        this.threshold.trainOnInstance(instanceThreshold);
    }

    public double predictRadius(double n) {
        InstanceImpl instance = new InstanceImpl(1d, new double[]{n});
        instance.setDataset(this.radius.getModelContext());
        Prediction p = radius.getPredictionForInstance(instance);
        return p.getVote(0, 0);
    }

    public double predictThreshold(double n) {
        InstanceImpl instance = new InstanceImpl(1d, new double[]{n});
        instance.setDataset(this.threshold.getModelContext());
        Prediction p = threshold.getPredictionForInstance(instance);
        return p.getVote(0, 0);
    }
}
