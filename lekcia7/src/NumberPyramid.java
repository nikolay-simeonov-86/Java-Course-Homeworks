import java.util.Scanner;

public class NumberPyramid
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int num = 0;
        int row = 0;

        while (num<=n)
        {
            row++;
            for (int i = 0; i < row; i++)
            {
                num++;
                if (num>n)
                {
                    break;
                }
                System.out.printf("%d ", num);
            }
            System.out.println();
        }
    }
}
