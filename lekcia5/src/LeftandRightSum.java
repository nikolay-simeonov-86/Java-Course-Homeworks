import java.util.Scanner;

public class LeftandRightSum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int leftsum = 0;
        int rightsum = 0;
        for (int i = 0; i < n; i++)
        {
            int num = Integer.parseInt(scanner.nextLine());
            leftsum += num;
        }
        for (int i = 0; i < n; i++)
        {
            int num1 = Integer.parseInt(scanner.nextLine());
            rightsum += num1;
        }

        int difference = Math.abs(leftsum-rightsum);
        if (rightsum == leftsum)
        {
            System.out.println("Yes, sum = " + leftsum);
        }
        else
        {
            System.out.println("No, diff = " + difference);
        }
    }
}
