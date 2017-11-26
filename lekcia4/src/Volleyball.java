import java.util.Scanner;

public class Volleyball
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yeartype = scanner.nextLine();
        double hollydays = Double.parseDouble(scanner.nextLine());
        double weekendsout = Double.parseDouble(scanner.nextLine());

        double weekendstotalsofia = (48-weekendsout)*3/4+hollydays*2/3;
        double weekendstotal = weekendstotalsofia+weekendsout;
        if (yeartype.equals("leap"))
        {
            double bonus = weekendstotal*0.15;
            double weekendstotal1 = Math.floor(weekendstotal+bonus);
            System.out.println(weekendstotal1);
        }
        else if (yeartype.equals("normal"))
        {
            System.out.println(Math.floor(weekendstotal));
        }
    }
}
