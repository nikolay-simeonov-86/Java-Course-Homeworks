import java.util.Scanner;

public class GreatestCommonDivisorCGD
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

            while (b!=0)
            {
                double oldB = b;
                b = a % b;
                a = oldB;
            }
            System.out.println(a);
    }
}
