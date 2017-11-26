import java.util.Scanner;

public class RhombusofStars
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n-1; i++)
        {
            System.out.printf("%s%s%n",print(" ", n-i),print("* ",i));
        }
        System.out.printf("%s%n", print("* ",n));
        for (int i = 1; i <= n-1 ; i++)
        {
            System.out.printf("%s%s%n",print(" ", i),print("* ",n-i));
        }

    }

    private static String print(String element, int count)
    {
        return new String(new char[count]).replace("\0", element);
    }
}
