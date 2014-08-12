package training.ideas.java.utills;

import static java.lang.Character.isDigit;

/**
 * ****************************
 * Created by idnkiw on 11-08-2014.
 * *****************************
 */
public class StringUtil {
    public static String compress(String str) {
       String strCompressed = "";
        int cnt = 1;
        for (int index = 0; index <str.length() ; index++) {
            if(index +1 < str.length() && str.charAt(index) == str.charAt(index +1)){
                cnt++;
                continue;
            }
            if(cnt >  1){
                strCompressed=strCompressed+str.charAt(index -1)+cnt;
                cnt = 1;
            }
            else{
                strCompressed=strCompressed+str.charAt(index);
            }
        }
        return strCompressed;
    }

    public static String deCompress(String str) {
        int cnt = 0,cnt1=0;
        String strDecompressed="";
        for (int i = 0; i <= str.length()-1 ; i++) {
            if(i <= str.length()-1 && isDigit(str.charAt(i))){
                cnt = Character.getNumericValue(str.charAt(i));
                if(isDigit(str.charAt(i+1)))
                {
                    cnt1=(cnt1*10)+cnt;
                    continue;
                }else
                {
                    cnt1=cnt;
                }
            }
            if(cnt1 > 0){
                for (int j =0; j < cnt-1 ; j++) {
                    strDecompressed +=str.charAt(i-1);
                }
                cnt1=0;
            }
            else{
                strDecompressed+=str.charAt(i);
            }
        }
        return strDecompressed;
    }
}
