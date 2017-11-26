import java.util.Scanner;

public class CollectandMultiply
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isfound = false;
        for (int i = 1; i <= 30; i++)
        {
            for (int j = 1; j <= 30; j++)
            {
                for (int k = 1; k <= 30; k++)
                {
                    if (i+j+k==n && i<j && j<k)
                    {
                        isfound = true;
                        System.out.printf("%d + %d + %d = %d%n", i, j, k, n);
                    }
                    else if (i*j*k==n && i>j && j>k)
                    {
                        isfound = true;
                        System.out.printf("%d * %d * %d = %d%n", i, j, k, n);
                    }
                }
            }
        }
        if (isfound==false)
        {
            System.out.println("No!");
        }
    }
}
