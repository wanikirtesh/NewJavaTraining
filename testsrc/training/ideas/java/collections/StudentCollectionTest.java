package training.ideas.java.collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ****************************
 * Created by Kirtesh Wani on 27-08-2014.
 * for JavaTraining
 * *****************************
 */
public class StudentCollectionTest {
    @Test
    public void test_to_get_list_student_pass()
    {
        Map<String,Map<String,Integer>> Students = new HashMap<String, Map<String,Integer>>();
        Map<String,Integer> subjectMap = new HashMap<String,Integer>();
        subjectMap.put("Chemistry",44);
        subjectMap.put("Math",45);
        subjectMap.put("Physics",45);
        Students.put("Kirtesh", subjectMap);
        Map<String,Integer> subjectMap2 = new HashMap<String,Integer>();
        subjectMap2.put("Chemistry",40);
        subjectMap2.put("Math",35);
        subjectMap2.put("Physics",45);
        Students.put("Wani", subjectMap2);
        List<String> passedStudents = new ArrayList<String>();
        passedStudents.add("Kirtesh");
        Assert.assertEquals(passedStudents,StudentCollection.getPassed(Students));
    }
}
