import java.util.Scanner;

public class MoneyPrize
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int parts = Integer.parseInt(scanner.nextLine());
        double PrizeMoney = Double.parseDouble(scanner.nextLine());
        double sum = 0;
        for (int i = 1; i <= parts; i++)
        {
            double n = Double.parseDouble(scanner.nextLine());
            if (i%2==0)
            {
                sum = sum + n*2;
            }
            else
            {
                sum = sum + n;
            }
        }
        double finalprize = PrizeMoney*sum;
        System.out.printf("The project prize was %.2f lv.", finalprize);
    }
}
