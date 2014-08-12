package training.ideas.java.utills;

/**
 * ****************************
 * Created by idnkiw on 12-08-2014.
 * *****************************
 */
public class AmountRounder {
    public static double round(double amount) {
        double factor = 100.0/5.0;
        amount = amount * factor;
        amount = Math.ceil(amount);
        return amount/factor;
    }

}
