import java.util.Scanner;

public class MetricConverter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double amount = Double.parseDouble(scanner.nextLine());
        String fromtype = scanner.nextLine();
        String totype = scanner.nextLine();
        double amountm = 0;

        if (fromtype.equals("mm"))
        {
            amountm = amount / 1000;
        }
         else if (fromtype.equals("cm"))
        {
            amountm = amount/100;
        }
        else if (fromtype.equals("mi"))
        {
            amountm = amount/0.000621371192;
        }
        else if (fromtype.equals("in"))
        {
            amountm = amount/39.3700787;
        }
        else if (fromtype.equals("km"))
        {
            amountm = amount/0.001;
        }
        else if (fromtype.equals("ft"))
        {
            amountm = amount/3.2808399;
        }
        else if (fromtype.equals("yd"))
        {
            amountm = amount/1.0936133;
        }
        else if (fromtype.equals("m"))
        {
            amountm = amount;
        }
                    if (totype.equals("mm"))
                    {
                        System.out.println(amountm * 1000 + " mm");
                    }
                    else if (totype.equals("cm"))
                    {
                        System.out.println(amountm * 100 + " cm");
                    }
                    else if (totype.equals("mi"))
                    {
                        System.out.println(amountm * 0.000621371192 + " mi");
                    }
                    else if (totype.equals("in"))
                    {
                        System.out.println(amountm * 39.3700787 + " in");
                    }
                    else if (totype.equals("km"))
                    {
                        System.out.println(amountm * 0.001 + " km");
                    }
                    else if (totype.equals("ft"))
                    {
                        System.out.println(amountm * 3.2808399 + " ft");
                    }
                    else if (totype.equals("yd"))
                    {
                        System.out.println(amountm * 1.0936133 + " yd");
                    }
                    else if (totype.equals("m"))
                    {
                        System.out.println(amountm + " m");
                    }
    }
}
