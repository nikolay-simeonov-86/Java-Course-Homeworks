import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int dotrow = n+1;
        int hashtagrow = (n*2)-1;
        int dotleft = 1;
        int hashtagleft = n*2-1;
        int space = 1;



        System.out.printf("%s%n", print("#", (4*n)+1));

        for (int i = 0; i < n; i++)
        {
            int spacesides = (space-3)/2;
            if (i==(n/2))
            {
                System.out.printf("%s%s%s(@)%s%s%s%n",
                        print(".", dotleft),
                        print("#", hashtagleft),
                        print(" ", spacesides),
                        print(" ", spacesides),
                        print("#", hashtagleft),
                        print(".", dotleft));
            }
            else 
            {
                System.out.printf("%s%s%s%s%s%n",
                        print(".", dotleft),
                        print("#", hashtagleft),
                        print(" ", space),
                        print("#", hashtagleft),
                        print(".", dotleft));

            }
            space+=2;
            dotleft++;
            hashtagleft-=2;
        }
        for (int i = 0; i < n; i++)
        {
            System.out.printf("%s%s%s%n",
                    print(".", dotrow),
                    print("#", hashtagrow),
                    print(".", dotrow));
            dotrow++;
            hashtagrow-=2;
        }
    }
    private static String print(String element, int count) {
        return new String(new char[count]).replace("\0", element);
    }
}
