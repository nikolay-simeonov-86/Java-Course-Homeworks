import java.util.Scanner;

public class RectangleofNxNStars
{

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < n; i++)
            {
                System.out.println(print("*",n));
            }

        }

        private static String print(String element, int count)
        {
            return new String(new char[count]).replace("\0", element);
        }


}
