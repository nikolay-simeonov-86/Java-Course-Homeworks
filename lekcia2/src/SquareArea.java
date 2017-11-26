import java.util.Scanner;

public class SquareArea
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("a = ");
        int a = Integer.parseInt(scanner.nextLine());
        int area = a*a;
        System.out.println("Sqare = " + area);
    }
}
