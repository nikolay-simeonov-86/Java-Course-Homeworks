import java.util.Scanner;

public class EqualWords
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string1 = scanner.nextLine().toLowerCase();
        String string2 = scanner.nextLine().toLowerCase();

        if (string1.equals(string2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
