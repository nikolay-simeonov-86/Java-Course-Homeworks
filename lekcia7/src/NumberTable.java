import java.util.Scanner;

public class NumberTable
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int numleft = 0;
        int numright = n+1;

        for (int row = 1; row <= n; row++)
        {
            for (int col = 1; col <= n; col++)
            {
                numleft++;
                if (numleft<n)
                {
                    System.out.print(numleft + " ");
                }
                if (numleft>=n)
                {
                    numright--;
                    System.out.print(numright + " ");
                }
            }
            System.out.println();
            numleft = row;
            numright = n+1;
        }
    }
}
