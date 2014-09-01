package training.ideas.java.collections;

import java.util.*;

/**
 * ****************************
 * Created by Kirtesh Wani on 27-08-2014.
 * for JavaTraining
 * *****************************
 */
public class StudentCollection {
    public static List<String> getPassed(Map<String, Map<String, Integer>> students) {
        List<String> passsedStudent = new ArrayList<String>();
        Iterator it = students.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<String,Map<String,Integer>> student = (Map.Entry)it.next();
            if(student.getValue().get("Physics")>=40&&student.getValue().get("Chemistry")>=40&&(int)student.getValue().get("Math")>=40)
            {
                passsedStudent.add(student.getKey());
            }
        }
        return passsedStudent;
    }
}
