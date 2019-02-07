package fschmidt.conceptadaptingbirch.impl;

import fschmidt.conceptadaptingbirch.impl.decay.StaticDecay;
import org.apache.commons.math3.analysis.function.Logistic;

/**
 *
 * @author fschmidt
 */
public class TestJBIRCH {
    
    public static void main(String... args) {
        CFTree birch = new CFTree(3, 0, true);
//        birch.setPeriodicRebuild(3);
//        birch.setUseSGDThreshold(true);
        birch.useDecay(new StaticDecay(0.1));
        
        birch.insertEntry(new double[]{0, 0});
        birch.printCFTree();
        System.out.println("#######################");
        birch.insertEntry(new double[]{0, 0.1});
        birch.printCFTree();
        System.out.println("#######################");
        birch.insertEntry(new double[]{0, 0.11});
        birch.printCFTree();
        System.out.println("#######################");
        birch.insertEntry(new double[]{0, 0.12});
        birch.printCFTree();
        System.out.println("#######################");
        birch.insertEntry(new double[]{10, 0});
        birch.printCFTree();
        System.out.println("#######################");
        birch.insertEntry(new double[]{10.1, 0});
        birch.insertEntry(new double[]{10.2, 0});
        birch.insertEntry(new double[]{10.3, 0});
        birch.insertEntry(new double[]{10.4, 0});
        birch.insertEntry(new double[]{10.5, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        birch.insertEntry(new double[]{10.6, 0});
        
        birch.finishedInsertingData();
        int cluster = birch.mapToClosestSubcluster(new double[]{0.0, 0.0825});
        int cluster2 = birch.mapToClosestSubcluster(new double[]{10.4, 0.0});
        System.out.println("Cluster: " + cluster);
        System.out.println("Cluster2: " + cluster2);
        birch.printCFTree();
        
        Logistic logistics = new Logistic(1, 1, 0.1, 1, 0, 0.1);
        
        System.out.println(logistics.value(0));
        System.out.println(logistics.value(1));
        System.out.println(logistics.value(2));
        System.out.println(logistics.value(3));
        System.out.println(logistics.value(4));
        System.out.println(logistics.value(50));
    }
}
