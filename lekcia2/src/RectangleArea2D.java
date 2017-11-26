import java.util.Scanner;

public class RectangleArea2D
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double lenght = Math.abs(x1-x2);
        double weight = Math.abs(y1-y2);
        double area = lenght*weight;
        double perimeter = 2*lenght+2*weight;
        System.out.println(area);
        System.out.println(perimeter);
    }
}
