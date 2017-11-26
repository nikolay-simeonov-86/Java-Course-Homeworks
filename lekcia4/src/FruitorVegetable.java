import java.util.Scanner;

public class FruitorVegetable
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String variable = scanner.nextLine();

        if (variable.equals("banana") || variable.equals("apple") || variable.equals("kiwi") || variable.equals("cherry") || variable.equals("lemon") || variable.equals("grapes"))
        {
            System.out.println("fruit");
        }
        else if (variable.equals("tomato") || variable.equals("cucumber") || variable.equals("pepper") || variable.equals("carrot"))
        {
            System.out.println("vegetable");
        }
        else
        {
            System.out.println("unknown");
        }
    }
}
