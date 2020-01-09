import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.HashMap;
import java.util.Locale;

public class DateTest {

    public static void main(String[] args) {

        String date1 = "02-MAR-2980";
        //DateTimeFormatter df = DateTimeFormatter .ofPattern("DD-MMM-YYYY", en);

        DateTimeFormatter df = new DateTimeFormatterBuilder()
                // case insensitive to parse JAN and FEB
                .parseCaseInsensitive()
                // add pattern
                .appendPattern("dd-MMM-yyyy")
                // create formatter (use English Locale to parse month names)
                .toFormatter(Locale.ENGLISH);



        LocalDate resLocalDate = LocalDate.parse(date1, df);
        System.out.println("resLocalDate:"+resLocalDate);

        HashMap<Month, Integer> hm = new HashMap<>();
        LocalDate today = LocalDate.now();
        Month todayMonth = today.getMonth();
        if(hm.containsKey(todayMonth)){
            hm.put(todayMonth, hm.get(todayMonth)+1);
        }else {
            hm.put(todayMonth, 1);
        }
System.out.println("hm"+hm);

    }
}
