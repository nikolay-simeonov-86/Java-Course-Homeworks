import java.util.Scanner;

public class Cup
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // 6-16 8-20 6-4 8-5 6-10 8-14 n*2-2
        // number of rows 16 step +4
        double n = Double.parseDouble(scanner.nextLine());
        // int allrows = (n*2)+4;
        int dotsize = (int) n;
        int hashtagsize = 3*(int) n;
        for (int i = 0; i < n/2; i++)
        {
            System.out.printf("%s%s%s%n",
                    print(".", dotsize),
                    print("#", hashtagsize),
                    print(".", dotsize));
            hashtagsize -=2;
            dotsize++;
        }
        int dotstep = 3;
        int middledotstep = ((int) n*2)-2;
        for (int i = 0; i < (n/2)+1; i++)
        {
            System.out.printf("%s#%s#%s%n",
                    print(".", (int) n+1+dotstep),
                    print(".", (int) middledotstep),
                    print(".", (int) n+1+dotstep));
            dotstep++;
            middledotstep-=2;
        }
        System.out.printf("%s%s%s%n",
                print(".", 2*(int) n),
                print("#", (int) n),
                print(".", 2*(int) n));
        for (int i = 0; i < n/2; i++)
        {
            System.out.printf("%s%s%s%n",
                    print(".", (int) Math.ceil(5*n/3)),
                    print("#", (int) Math.floor(5*n/3)-1),
                    print(".", (int) Math.ceil(5*n/3)));
        }
        System.out.printf("%sD^A^N^C^E^%s%n",
                print(".",(int) ((5*n)-10)/2),
                print(".",(int) ((5*n)-10)/2));
        for (int i = 0; i < n/2+1; i++)
        {
            System.out.printf("%s%s%s%n",
                    print(".", (int) Math.ceil(5*n/3)),
                    print("#", (int) Math.floor(5*n/3)-1),
                    print(".", (int) Math.ceil(5*n/3)));
        }
    }
    private static String print(String element, int count) {
        return new String(new char[count]).replace("\0", element);
    }
}
