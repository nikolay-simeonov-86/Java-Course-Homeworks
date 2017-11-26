import java.util.Scanner;

public class ChristmasTree
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.printf("%s | %n", print(" ",n));

        for (int row = 1; row <= n; row++)
        {
            System.out.printf("%s%s | %s%n",
                    print(" ", n-row),
                    print("*",row),
                    print("*",row));
        }

    }

    private static String print(String element, int count)
    {
        return new String(new char[count]).replace("\0", element);
    }

}
