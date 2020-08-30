package deneme6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Deneme6 {

    public static void main(String[] args) {

        DateFormat dFAy = new SimpleDateFormat("MM");
        DateFormat dFYil = new SimpleDateFormat("yyyy");
        Calendar cal = Calendar.getInstance();
        String ay = dFAy.format(cal.getTime());
        String yil = dFYil.format(cal.getTime());
        
        int ayD = Integer.parseInt(ay);
        
        String tarih = ay+"."+yil;
        System.out.println(tarih);

    }
}
