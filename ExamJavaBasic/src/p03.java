import java.util.Scanner;

public class p03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String period = scanner.nextLine();
        String type = scanner.nextLine();
        String internet = scanner.nextLine();
        double months = Double.parseDouble(scanner.nextLine());

        double sum = 1;

        if (period.equals("one"))
        {
            if (type.equals("Small"))
            {
                sum =9.98;
            }
            else if (type.equals("Middle"))
            {
                sum = 18.99;
            }
            else if (type.equals("Large"))
            {
                sum =25.98;
            }
            else if (type.equals("ExtraLarge"))
            {
                sum = 35.99;
            }
            if (internet.equals("yes"))
                if (sum<=10)
                {
                    sum = sum+5.5;
                }
                else if (sum>10 && sum<30)
                {
                    sum = sum+4.35;
                }
                else if (sum>30)
                {
                    sum = sum+3.85;
                }
        }
        if (period.equals("two"))
        {
            if (type.equals("Small"))
            {
                sum = 8.58;
            }
            else if (type.equals("Middle"))
            {
                sum =17.09;
            }
            else if (type.equals("Large"))
            {
                sum = 23.59;
            }
            else if (type.equals("ExtraLarge"))
            {
                sum = 31.79;
            }
            if (internet.equals("yes"))
                if (sum<=10)
                {
                    sum = sum+5.5;
                }
                else if (sum>10 && sum<30)
                {
                    sum = sum+4.35;
                }
                else if (sum>30)
                {
                    sum = sum+3.85;
                }
            sum = sum-sum*0.0375;
        }

        sum = sum*months;
        System.out.printf("%.2f lv.", sum);
    }
}
