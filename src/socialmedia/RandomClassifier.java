/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmedia;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Random;

/**
 *
 * @author marcorosas
 * @author winsonso
 * @author landonwoolley
 */
public class RandomClassifier extends Experimenter {
    public Map<SocialMediaEntry, Boolean> classifyEntries(Set<SocialMediaEntry> trainingSet,
            Set<SocialMediaEntry> testSet) {
        System.out.println("Running classifier...");
        
        // In a real use case, build a machine learning model from the training set,
        // then use it to classify the entries in the test set.

        
        Map<SocialMediaEntry, Boolean> results = new HashMap<>();
        
        // Right now this is putting a "true" for everything
        // TODO: This method will need to be changes / replaced.
        Random rand = new Random();
        
        for (SocialMediaEntry entry : testSet) {
            boolean veredict = (1 == rand.nextInt(2));
            results.put(entry, veredict);
        }
        
        return results;
    }
}
