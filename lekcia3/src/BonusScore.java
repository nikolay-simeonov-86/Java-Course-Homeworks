import java.util.Scanner;

public class BonusScore
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double bonus = 0;
        if (a<=100)
        {
            bonus = 5;
        }
        else if (a>100 && a<=1000)
        {
            bonus = a/5;
        }
        else if (a>1000)
        {
            bonus = a/10;
        }
        if (a%2 == 0)
        {
            bonus = bonus+1;
        }
        if (a%10 == 5)
        {
            bonus = bonus+2;
        }
        System.out.println(bonus);
        System.out.println(bonus+a);
    }
}