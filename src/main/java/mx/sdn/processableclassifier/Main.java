package mx.sdn.processableclassifier;

import mx.sdn.processableclassifier.classifiers.Classifier;
import mx.sdn.processableclassifier.classifiers.trees.randomtree.RandomTreeBinClassifier;
import mx.sdn.processableclassifier.models.Flow;

public class Main {
    public static void main(String[] args) {
        int classifiedAs = -1;

        if (args.length != 41) {
            System.out.println(-400);
            return;
        }

        Classifier classifier;

        switch (args[0]) {
            case "randomtree":
                String path = args[1];
                classifier = new RandomTreeBinClassifier();
                classifier.Load(path);
                break;
            default:
                System.out.println(-404);
                return;
        }

        Flow flow;
        try {
            flow = new Flow(
                    Integer.parseInt(args[2]),
                    Integer.parseInt(args[3]),
                    Integer.parseInt(args[4]),
                    Integer.parseInt(args[5]),
                    Integer.parseInt(args[6]),
                    Integer.parseInt(args[7]),
                    Integer.parseInt(args[8]),
                    Integer.parseInt(args[9]),
                    Integer.parseInt(args[10]),
                    Integer.parseInt(args[11]),
                    Integer.parseInt(args[12]),
                    Integer.parseInt(args[13]),
                    Integer.parseInt(args[14]),
                    Integer.parseInt(args[15]),
                    Integer.parseInt(args[16]),
                    Integer.parseInt(args[17]),
                    Integer.parseInt(args[18]),
                    Integer.parseInt(args[19]),
                    Integer.parseInt(args[20]),
                    Integer.parseInt(args[21]),
                    Integer.parseInt(args[22]),
                    Integer.parseInt(args[23]),
                    Integer.parseInt(args[24]),
                    Integer.parseInt(args[25]),
                    Integer.parseInt(args[26]),
                    Integer.parseInt(args[27]),
                    Integer.parseInt(args[28]),
                    Integer.parseInt(args[29]),
                    Integer.parseInt(args[30]),
                    Integer.parseInt(args[31]),
                    Integer.parseInt(args[32]),
                    Integer.parseInt(args[33]),
                    Integer.parseInt(args[34]),
                    Integer.parseInt(args[35]),
                    Integer.parseInt(args[36]),
                    Integer.parseInt(args[37]),
                    Integer.parseInt(args[38]),
                    Integer.parseInt(args[39]),
                    Integer.parseInt(args[40])
            );
        } catch (Exception exception) {
            // Handle parseInt exception. Break if non-integers were received.
            System.out.println(-500);
            return;
        }

        classifiedAs = classifier.Classify(flow);
        System.out.println(classifiedAs);
    }
}
