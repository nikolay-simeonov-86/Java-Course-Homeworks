import java.util.Scanner;

public class Rectangleof10x10Stars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < 10; i++)
        {
            System.out.println(print("*",10));
        }

    }

    private static String print(String element, int count)
    {
    return new String(new char[count]).replace("\0", element);
    }

}