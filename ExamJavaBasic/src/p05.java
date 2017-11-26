import java.util.Scanner;

public class p05
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.printf("%sx%s%n",
                print(".", ((3*n)-1)/2),
                print(".", ((3*n)-1)/2));
        System.out.printf("%s/x\\%s%n",
                print(".", ((3*n)-3)/2),
                print(".", ((3*n)-3)/2));
        System.out.printf("%sx|x%s%n",
                print(".", ((3*n)-3)/2),
                print(".", ((3*n)-3)/2));

        int dot = (n-1)/2;
        int hiks = n;
        for (int i = 1; i <= n/2; i++)
        {

                System.out.printf("%s%s|%s%s%n",
                        print(".", dot),
                        print("x", hiks),
                        print("x", hiks),
                        print(".", dot));
                dot--;
                hiks++;
        }

        System.out.printf("%s|%s%n",
                print("x", ((3*n)-1)/2),
                print("x", ((3*n)-1)/2));

        int dot2 = 1;
        int hiks2 = (3*n-3)/2;
        for (int i = 0; i < n/2; i++)
        {
            System.out.printf("%s%s|%s%s%n",
                    print(".", dot2),
                    print("x", hiks2),
                    print("x", hiks2),
                    print(".", dot2));
            dot2++;
            hiks2--;
        }
        System.out.printf("%s/x\\%s%n",
                print(".", ((3*n)-3)/2),
                print(".", ((3*n)-3)/2));
        System.out.printf("%s\\x/%s%n",
                print(".", ((3*n)-3)/2),
                print(".", ((3*n)-3)/2));

        int dot3 = (n-1)/2;
        int hiks3 = n;
        for (int i = 1; i <= n/2; i++)
        {

            System.out.printf("%s%s|%s%s%n",
                    print(".", dot3),
                    print("x", hiks3),
                    print("x", hiks3),
                    print(".", dot3));
            dot3--;
            hiks3++;
        }

        System.out.printf("%s|%s%n",
                print("x", ((3*n)-1)/2),
                print("x", ((3*n)-1)/2));

        int dot4 = 1;
        int hiks4 = (3*n-3)/2;
        for (int i = 0; i < n/2; i++)
        {
            System.out.printf("%s%s|%s%s%n",
                    print(".", dot4),
                    print("x", hiks4),
                    print("x", hiks4),
                    print(".", dot4));
            dot4++;
            hiks4--;
        }
        System.out.printf("%sx|x%s%n",
                print(".", ((3*n)-3)/2),
                print(".", ((3*n)-3)/2));
        System.out.printf("%s\\x/%s%n",
                print(".", ((3*n)-3)/2),
                print(".", ((3*n)-3)/2));
        System.out.printf("%sx%s%n",
                print(".", ((3*n)-1)/2),
                print(".", ((3*n)-1)/2));
    }
    private static String print(String element, int count) {
        return new String(new char[count]).replace("\0", element);
    }
}
