import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        if (n<2)
        {
            System.out.println("1");
        }
        else
        {
            int f0 = 0;
            int f1 = 1;
            for (int i = 0; i < n; i++)
            {
                int result = f0+f1;
                f0 = f1;
                f1 = result;
            }
            System.out.println(f1);
        }
    }
}
