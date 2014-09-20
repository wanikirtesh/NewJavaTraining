package training.ideas.java.newcollection;

import java.util.Date;

/**
 * Created by Kirtesh on 20-09-2014.
 */
public class Season {
    Date StartDate,EndDate;
    double Value;
    public Season(Date StartDate, Date EndDate, double Value) {
        this.StartDate = StartDate;
        this.EndDate=EndDate;
        this.Value = Value;
    }

    public double value() {
        return this.Value;

    }

    public boolean dateInSeson(Date occupancyDate) {
       return StartDate.compareTo(occupancyDate)<=0&&EndDate.compareTo(occupancyDate)>=0;

    }
}
