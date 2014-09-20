package training.ideas.java.collections;

/**
 * ****************************
 * Created by Kirtesh Wani on 03-09-2014.
 * for JavaTraining
 * *****************************
 */
public class Decision {

    public Decision(String FPLOS,int MinLOS){
        this.fPLOS = FPLOS;
        this.minLOS = MinLOS;
    }

    public int getMinLOS() {
        return minLOS;
    }
    public String getfPLOS() {
        return fPLOS;
    }

@Override
public boolean equals(Object aThat)
{
    if(aThat instanceof Decision)
    return ((Decision)aThat).getfPLOS().equals(this.fPLOS)&&((Decision)aThat).getMinLOS()==this.minLOS;
    return false;

}
    private int minLOS;
    private String fPLOS;
}
