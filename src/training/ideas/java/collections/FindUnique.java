package training.ideas.java.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * ****************************
 * Created by Kirtesh Wani on 27-08-2014.
 * for JavaTraining
 * *****************************
 */
public class FindUnique {
    public static Set<String> get(String[] arrWindowsHandler) {
        Set<String> resultSet = new HashSet<String>();
        for(String str : arrWindowsHandler)
            resultSet.add(str);
        return resultSet;
    }
}
