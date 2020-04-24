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
            randomTree = (RandomTree) SerializationHelper.read(modelPath);
            return randomTree;
        } catch (Exception e) {
            return null;
        }
    }
}