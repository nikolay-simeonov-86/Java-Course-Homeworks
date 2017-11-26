import java.util.Scanner;

public class Diamond
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // evenmiddlerow - *n-2*
        // oddmiddlerow - *n-2*
        // 9 - 6,4,2
        // 7 - 4,2
        // evenrows n-1
        // oddrows n
        // rowlenght n
        // odddashperrow n-1
        // evendashperrow n-2
        // middlerowstar n
        // middlerowdash n-2
        // nad 3red n-2 stars
        // nad 3red

        int n = Integer.parseInt(scanner.nextLine());

        int EvenDashTopSides = (n-2)/2;
        int EvenDashTopMiddle = 0;
        int EvenDashBottomSides = 1;
        int EvenDashBottomMiddle = n-4;

        int OddDashTopSides = (n-3)/2;
        int OddDashTopMiddle = 1;
        int OddDashBottomSides = 0;
        int OddDashBottomMiddle = n-2;

        if (n==1)
        {
            System.out.println("*");
        }
        else if (n==2)
        {
            System.out.println("**");
        }
        else if (n>2)
        {
            for (int i = 0; i < (n/2); i++)
            {
                if (n%2==0)
                {
                    System.out.printf("%s%s%s%s%s%n",
                            print("-", EvenDashTopSides),
                            print("*", 1),
                            print("-", EvenDashTopMiddle),
                            print("*", 1),
                            print("-", EvenDashTopSides));
                    EvenDashTopMiddle +=2;
                    EvenDashTopSides -=1;

                }
                else
                {
                    if (i==0)
                    {
                        System.out.printf("%s*%s%n",
                                print("-", (n-1)/2),
                                print("-", (n-1)/2));
                    }
                    else
                    {
                        System.out.printf("%s%s%s%s%s%n",
                                print("-", OddDashTopSides),
                                print("*", 1),
                                print("-", OddDashTopMiddle),
                                print("*", 1),
                                print("-", OddDashTopSides));
                        OddDashTopMiddle +=2;
                        OddDashTopSides -= 1;

                    }
                }
            }


            for (int i = 0; i <= (n/2); i++)
            {
                if (n%2==0)
                {

                    System.out.printf("%s%s%s%s%s%n",
                            print("-", EvenDashBottomSides),
                            print("*", 1),
                            print("-", EvenDashBottomMiddle),
                            print("*", 1),
                            print("-", EvenDashBottomSides));
                    if (EvenDashBottomMiddle>=2)
                    {
                        EvenDashBottomSides += 1;
                        EvenDashBottomMiddle -= 2;
                    }
                    else
                    {
                        break;
                    }
                }
                else
                {
                    if (i==(n/2))
                    {
                        System.out.printf("%s*%s%n",
                                print("-", (n-1)/2),
                                print("-", (n-1)/2));
                    }
                    else
                    {
                        System.out.printf("%s%s%s%s%s%n",
                                print("-", OddDashBottomSides),
                                print("*", 1),
                                print("-", OddDashBottomMiddle),
                                print("*", 1),
                                print("-", OddDashBottomSides));
                        OddDashBottomMiddle -=2;
                        OddDashBottomSides +=1;
                    }
                }
            }
        }
    }
    private static String print(String element, int count)
    {
        return new String(new char[count]).replace("\0", element);
    }

}
