import java.util.Scanner;

public class House
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int dash = (n-1)/2;
        int oddStar = 1;
        int evenStar = 2;
        for (int i = 0; i < (n-1)/2; i++)
        {
            if (n%2==0)
            {
                System.out.printf("%s%s%s%n",
                        print("-", dash),
                        print("*", evenStar),
                        print("-", dash));
                evenStar +=2;
                dash -=1;
            }
            else
            {
                System.out.printf("%s%s%s%n",
                        print("-", dash),
                        print("*", oddStar),
                        print("-", dash));
                oddStar +=2;
                dash -=1;
            }
        }
        System.out.printf("%s%n", print("*", n));
        for (int i = 0; i < n/2; i++)
        {
            System.out.printf("|%s|%n", print("*", n-2));
        }

    }

    private static String print(String element, int count)
    {
        return new String(new char[count]).replace("\0", element);
    }

}
