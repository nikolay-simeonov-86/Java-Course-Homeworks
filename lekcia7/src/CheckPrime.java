import java.util.Scanner;

public class CheckPrime
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isPrime = true;

        if (n<2)
        {
            System.out.println("Not Prime");
        }
        else
        {
            for (int i = 2; i < n; i++)
            {
                if (n%i==0)
                {
                    isPrime = false;
                }
            }
            if (isPrime)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not Prime");
            }
        }
    }
}
