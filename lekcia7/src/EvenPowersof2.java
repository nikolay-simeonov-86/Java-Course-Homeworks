import java.util.Scanner;

public class EvenPowersof2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;

        for (int i = 0; i < n/2+1; i++)
        {
            System.out.println(num);
            num *=4;
        }
    }
}
