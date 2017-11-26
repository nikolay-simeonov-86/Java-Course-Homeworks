import java.util.Scanner;

public class Sunglasses
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.printf("%s%s%s%n",
                print("*", 2*n),
                print(" ", n),
                print("*", 2*n));
        for (int row = 0; row < n-2 ; row++)
        {
            if (row==(n-1)/2-1)
            {
                System.out.printf("*%s*%s*%s*%n",
                        print("/", 2*n-2),
                        print("|", n),
                        print("/", 2*n-2));
            }
            else
            {
                System.out.printf("*%s*%s*%s*%n",
                        print("/", 2*n-2),
                        print(" ", n),
                        print("/", 2*n-2));
            }
        }
        System.out.printf("%s%s%s%n",
                print("*", 2*n),
                print(" ", n),
                print("*", 2*n));
    }

    private static String print(String element, int count)
    {
        return new String(new char[count]).replace("\0", element);
    }

}
