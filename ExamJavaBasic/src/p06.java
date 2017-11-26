import java.util.Scanner;

public class p06
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());
        boolean isfound = false;
        int sum = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 1; i <= 9; i++)
        {
            for (int j = 1; j <= 9; j++)
            {
                for (int k = 1; k <= 9; k++)
                {
                    for (int l = 1; l <= 9; l++)
                    {

                        if (i*j+k*l==m && i<j && k>l)
                        {
                            sum++;
                            isfound = true;
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                            if (sum==4)
                            {
                                a = i;
                                b = j;
                                c = k;
                                d = l;
                            }
                        }
                    }
                }
            }
        }
        if (isfound==false)
        {
            System.out.println("No!");
        }
        else
        {
            if (sum>4)
            {
                System.out.println();
                System.out.println("Password: " + a + b + c + d);
            }
            else
            {
                System.out.println();
                System.out.println("No!");
            }
        }
    }
}
