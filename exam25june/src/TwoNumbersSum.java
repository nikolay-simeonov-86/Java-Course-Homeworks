import java.util.Scanner;

public class TwoNumbersSum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        int begining = Integer.parseInt(scanner.nextLine());
        int ending = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());

        boolean isfound = false;
        int sum = 0;
        for (int i = begining; i >= ending; i--)
        {
            for (int j = begining; j >= ending; j--)
            {
                sum++;
                if (i+j==magic)
                {
                    isfound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", sum,i,j,magic);
                    return;
                }
            }
        }
        if (isfound==false)
        {
            System.out.printf("%d combinations - neither equals %d", sum, magic);
        }
    }
}
