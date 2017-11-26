import java.time.Duration;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DaysAfterBirth
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);

        DateTime dt = new DateTime(2005, 3, 26, 12, 0, 0, 0);
        DateTime plusPeriod = dt.plus(Period.days(1));
        DateTime plusDuration = dt.plus(new Duration(24L*60L*60L*1000L));


        //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //Date date = new Date();
        //date = date.AddDays(999);
        //System.out.println(date.toString("dd-MM-yyyy"));

        //String date = DateTime.ParseExact(scanner.nextLine() , "dd-MM-yyyy", CultureInfo.InvariantCulture );
    }
}
