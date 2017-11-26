import java.util.Scanner;

public class SquareofStars
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        if (n<=1 || n>=101)
            System.out.print("Invalid number");
        else
            for (int j=1; j<=n; j++)
            {
                for (int i=1; i<=n; i++)
                {
                    if (j==1 || j==n || i==1 || i==n)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }

    }
}
