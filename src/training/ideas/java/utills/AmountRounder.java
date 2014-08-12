package training.ideas.java.utills;

/**
 * ****************************
 * Created by idnkiw on 12-08-2014.
 * *****************************
 */
public class AmountRounder {
    public static double round(double amount) {
        amount = amount * 20;
        amount = Math.ceil(amount);
        return amount/20.0;
    }
}
