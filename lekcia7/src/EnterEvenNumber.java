import java.util.Scanner;

public class EnterEvenNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            try
            {
                int n = Integer.parseInt(scanner.nextLine());
                if (n%2==0)
                {
                    System.out.printf("Enter even number: %d", n);
                    break;
                }
            }
            catch (Exception e)
            {
                System.out.println("Invalid Number!");
            }
        }
    }
}
