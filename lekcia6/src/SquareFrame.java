import java.util.Scanner;

public class SquareFrame
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int length = 2*n-1;
        int dash = n-2;

        System.out.printf("+ %s+%n", print("- ", dash));
        for (int i = 0; i < n-2; i++)
        {
            System.out.printf("| %s|%n", print("- ", dash));
        }
        System.out.printf("+ %s+%n", print("- ", dash));

    }

    private static String print(String element, int count)
    {
        return new String(new char[count]).replace("\0", element);
    }
}
