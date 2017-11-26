import java.util.Scanner;

public class OddEvenSum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int oddsum = 0;
        int evensum = 0;
        for (int i = 0; i < n ; i++)
        {
            int num = Integer.parseInt(scanner.nextLine());
            if (i%2 == 0)
            {
                evensum += num;
            }
            else
            {
                oddsum += num;
            }
        }
        int difference = Math.abs(evensum-oddsum);
        if (difference==0)
        {
            System.out.println("Yes");
            System.out.println("Sum = " + evensum);
        }
        else
        {
            System.out.println("No");
            System.out.println("Diff = " + difference);
        }
    }
}
