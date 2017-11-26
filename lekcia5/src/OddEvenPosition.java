import java.util.Scanner;

public class OddEvenPosition
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double EvenSum = 0;
        double EvenMax = -555555555;
        double EvenMin = 555555555;
        double OddSum = 0;
        double OddMax = -555555555;
        double OddMin = 555555555;

        for (int i = 1; i <= n ; i++)
        {
            double num = Double.parseDouble(scanner.nextLine());
            if (i%2 == 0)
            {
                EvenSum += num;
                if (num>EvenMax)
                {
                    EvenMax = num;
                }
                if (num<EvenMin)
                {
                    EvenMin = num;
                }
            }
            else
            {
                OddSum += num;
                if (num>OddMax)
                {
                    OddMax = num;
                }
                if (num<OddMin)
                {
                    OddMin = num;
                }
            }
        }
        System.out.println("OddSum=" + OddSum);
        System.out.println("OddMin=" + OddMin);
        System.out.println("OddMax=" + OddMax);
        System.out.println("EvenSum=" + EvenSum);
        System.out.println("EvenMin=" + EvenMin);
        System.out.println("EvenMax=" + EvenMax);
    }
}
