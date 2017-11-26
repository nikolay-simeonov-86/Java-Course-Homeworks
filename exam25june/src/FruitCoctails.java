import java.util.Scanner;

public class FruitCoctails
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        double amount = Integer.parseInt(scanner.nextLine());
        double prize = 0;
        if (size.equals("small"))
        {
            if (fruit.equals("Watermelon"))
            {
                prize = 56*amount*2;
            }
            if (fruit.equals("Mango"))
            {
                prize = 36.66*amount*2;
            }
            if (fruit.equals("Pineapple"))
            {
                prize = 42.1*amount*2;
            }
            if (fruit.equals("Raspberry"))
            {
                prize = 20*amount*2;
            }
        }
        else if (size.equals("big"))
        {
            if (fruit.equals("Watermelon"))
            {
                prize = 28.7*amount*5;
            }
            if (fruit.equals("Mango"))
            {
                prize = 19.6*amount*5;
            }
            if (fruit.equals("Pineapple"))
            {
                prize = 24.8*amount*5;
            }
            if (fruit.equals("Raspberry"))
            {
                prize = 15.2*amount*5;
            }
        }
        if (prize>1000)
        {
            double finalprize = prize*0.5;
            System.out.printf("%.2f lv.", finalprize);
        }
        else if (prize>=400 && prize<=1000)
        {
            double finalprize = prize*0.85;
            System.out.printf("%.2f lv.", finalprize);
        }
        else
        {
            System.out.printf("%.2f lv.", prize);
        }
    }
}
