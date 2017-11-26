import java.util.Scanner;

public class NumbersN1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int num = n;
        for (int i = 0; i < n; i++)
        {
            System.out.println(num);
            num = num-1;
            if (num<1)
            {
                break;
            }
        }
    }
}
