package training.ideas.java.newcollection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Kirtesh on 20-09-2014.
 */
public class Rate {
    private final String rateName;
    private List<Season> seasonList = new ArrayList<Season>();
    public Rate(String rateName) {
        this.rateName = rateName;
    }

    public void addSeason(Season season) {
        seasonList.add(season);
    }

    public String rateName() {
        return rateName;
    }


    public double value(Date occupancyDate) {
        for(Season s :seasonList){
            if(s.dateInSeson(occupancyDate)){
                return s.value();
            }
        }
        return 0;
    }
}
