import java.util.Scanner;

public class FruitShop
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double prize = -1.0;
        if (day.equals("Saturday") || day.equals("Sunday"))
        {
            if (fruit.equals("banana"))
            {
                prize = quantity * 2.7;
            }
            if (fruit.equals("apple"))
            {
                prize = quantity * 1.25;
            }
            if (fruit.equals("orange"))
            {
                prize = quantity * 0.9;
            }
            if (fruit.equals("grapefruit"))
            {
                prize = quantity * 1.6;
            }
            if (fruit.equals("kiwi"))
            {
                prize = quantity * 3.0;
            }
            if (fruit.equals("pineapple"))
            {
                prize = quantity * 5.6;
            }
            if (fruit.equals("grapes"))
            {
                prize = quantity * 4.2;
            }
        }
        else if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday"))
        {
            if ( fruit.equals("banana"))
            {
                prize = quantity*2.5;
            }
            if ( fruit.equals("apple"))
            {
                prize = quantity*1.2;
            }
            if ( fruit.equals("orange"))
            {
                prize = quantity*0.85;
            }
            if ( fruit.equals("grapefruit"))
            {
                prize = quantity*1.45;
            }
            if ( fruit.equals("kiwi"))
            {
                prize = quantity*2.7;
            }
            if ( fruit.equals("pineapple"))
            {
                prize = quantity*5.5;
            }
            if ( fruit.equals("grapes"))
            {
                prize = quantity*3.85;
            }
        }
        if (prize >= 0)
        {
            System.out.println(prize);
        }
        else
        {
            System.out.println("error");
        }
    }
}
