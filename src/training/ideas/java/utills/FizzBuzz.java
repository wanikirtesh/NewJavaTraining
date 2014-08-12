package training.ideas.java.utills;

/**
 * ****************************
 * Created by idnkiw on 11-08-2014.
 * *****************************
 */
public class FizzBuzz {

    public static String[] getnerateSeries(int numberOfCounts) {
        String[] actual = new String[numberOfCounts];
        for(int i=1; i<=numberOfCounts;i++)
        {
            actual[i-1]="";
            if(i%3==0||i%5==0)
            {
                if(i%3==0)
                {
                    actual[i-1]+="Fizz";
                }
                if(i%5==0)
                {
                    actual[i-1]+="Buzz";
                }
            }
            else
            {
                actual[i-1]= ""+i;
            }

        }

        return actual;
    }
}
