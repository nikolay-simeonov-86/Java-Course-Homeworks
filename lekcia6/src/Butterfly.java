import java.util.Scanner;

public class Butterfly
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < (n - 2) ; i++)
        {
            if (n%2==0)
            {
                if (i%2==0)
                {
                    System.out.printf("%s\\ /%s%n", print("-", n-2), print("-", n-2));
                }
                else
                {
                    System.out.printf("%s\\ /%s%n", print("*", n-2), print("*", n-2));
                }
            }
            else
            {
                if (i%2==0)
                {
                    System.out.printf("%s\\ /%s%n", print("*", n-2), print("*", n-2));
                }
                else
                {
                    System.out.printf("%s\\ /%s%n", print("-", n-2), print("-", n-2));
                }
            }
        }

        System.out.printf("%s@%s%n", print(" ", n-1), print(" ", n-1));

        for (int i = 1; i <= (n - 2) ; i++)
        {
            if (i%2==0)
            {
                System.out.printf("%s/ \\%s%n", print("-", n-2), print("-", n-2));
            }
            else
            {
                System.out.printf("%s/ \\%s%n", print("*", n-2), print("*", n-2));
            }
        }
    }
    private static String print(String element, int count) {
        return new String(new char[count]).replace("\0", element);
    }
}
