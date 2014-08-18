package training.ideas.java.utills;

/**
 * ****************************
 * Created by idnkiw on 14-08-2014.
 * *****************************
 */
public enum TriangleTypes {
    SCALENE{
        @Override
        public boolean is(int a1, int a2, int a3) {
            if((a1!=a2&&a1!=a3&&a3!=a2)&&isTriangle(a1,a2,a3))
                return true;
            else
                return false;
        }
    },EQUILETERAL {
        @Override
        public boolean is(int a1, int a2, int a3) {
            if(a1==a2&&a1==a3&&isTriangle(a1,a2,a3))
                return true;
            else
                return false;
        }
    },RIGHTANGLE{
        @Override
        public boolean is(int a1,int a2,int a3){
            if((a1==90||a2==90||a3==90)&&isTriangle(a1,a2,a3))
                return true;
            else
                return false;
        }
    }

    ,ISOSCELES{
        @Override
        public boolean is(int a1,int a2,int a3){
            if((a1==a2||a2==a3||a3==a1)&&isTriangle(a1,a2,a3))
                return true;
            else
                return false;
        }

    };

    public static boolean isTriangle(int a1, int a2, int a3) {
        if(a1+a2+a3==180&&a1>0&&a2>0&&a3>0)
            return true;
        else
            return  false;
    }

    public abstract boolean is(int a1, int a2, int a3);
  //  public abstract boolean was(int a1, int a2, int a3);

    public static TriangleTypes getTriangle(int a1, int a2, int a3) throws Exception{
        if(isTriangle(a1,a2,a3)) {
           // return NORMAL;
            if(TriangleTypes.EQUILETERAL.is(a1,a2,a3))
            {
                return EQUILETERAL;
            }
            else if(TriangleTypes.ISOSCELES.is(a1,a2,a3))
            {
                return ISOSCELES;
            }
            else if(TriangleTypes.RIGHTANGLE.is(a1,a2,a3))
            {
                return RIGHTANGLE;
            }
            else
            {
                return SCALENE;
            }

        }
        else
        {
            throw new NotATriangleException();
        }
    }
}

class NotATriangleException extends Exception
{

}