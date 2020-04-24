package mx.sdn.processableclassifier.classifiers.trees.randomtree.codec;

import weka.classifiers.trees.RandomTree;
import weka.core.SerializationHelper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;

public class RandomTreeCodec {
    public RandomTree decode(String modelPath) {
        RandomTree randomTree = new RandomTree();
        try {
//            File file = new File(RandomTreeCodec.class.getResource(modelPath).getFile());
//            String path = file.getAbsolutePath();

            String path = modelPath;
            System.out.println("Model path: " + path);

            randomTree = (RandomTree) SerializationHelper.read(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return randomTree;
    }
}