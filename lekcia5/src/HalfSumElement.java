import java.util.Scanner;

public class HalfSumElement
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
        {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > max)
            {
                max = num;
            }
            sum += num;
        }
        int difference = Math.abs(2*max-sum);
        if (2*max==sum)
        {
            System.out.println("Yes");
            System.out.println("Sum = " + (sum-max));
        }
        else
        {
            System.out.println("No");
            System.out.println("Diff = " + difference);
        }
    }
}
