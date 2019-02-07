package fschmidt.conceptadaptingbirch.jbirch;

/**
 *
 * @author fschmidt
 */
public class TestJBIRCH {

    public static void main(String... args) {
        CFTree birch = new CFTree(3, 0, true);
//        birch.setPeriodicRebuild(3);
//        birch.setUseSGDThreshold(true);
        birch.useDecay(CFEntry.DecayType.STATIC);

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
    }
}
