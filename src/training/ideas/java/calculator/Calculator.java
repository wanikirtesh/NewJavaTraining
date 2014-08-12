package training.ideas.java.calculator;
/**
 * Created by idnkiw on 22-07-2014.
 */
public class Calculator {

    public static double performAdd(double... numbers)
    {
        double result=0;
        for(double i:numbers)
            result+=i;
        return result;
    }

//    public static int performAdd(int... numbers)
//    {
//        int result=0;
//        for(int i:numbers)
//            result+=i;
//        return result;
//    }

}
