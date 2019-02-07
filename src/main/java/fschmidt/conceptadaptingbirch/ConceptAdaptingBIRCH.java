package fschmidt.conceptadaptingbirch;

import fschmidt.conceptadaptingbirch.impl.CFEntry;
import fschmidt.conceptadaptingbirch.impl.CFTree;

/**
 *
 * @author fschmidt
 */
public class ConceptAdaptingBIRCH {

    private final CFTree cfTree;
    
    public ConceptAdaptingBIRCH(CFEntry.DecayType decayType, int maxNodeEntries, double initialThreshold) {
        cfTree = new CFTree(maxNodeEntries, initialThreshold, true);
        cfTree.useDecay(decayType);
    }

    public void train(double[] values) {
        cfTree.insertEntry(values);
    }

    public int cluster(double[] point) {
        cfTree.finishedInsertingData();
        return cfTree.cluster(point);
    }

    public double[] getClosestBorderPoint(double[] point) {
        return cfTree.getBorderPoint(point);
    }

    public double[] getClosestBorderDistance(double[] point) {
        return cfTree.getDistance(point);
    }

    public CFTree getCfTree() {
        return cfTree;
    }
}
