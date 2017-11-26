import java.util.Scanner;

public class AreaofFigures
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        double side = Double.parseDouble(scanner.nextLine());

        if (figure.equals("square"))
        {
            System.out.println(side*side);
        }
        else if (figure.equals("circle"))
        {
            System.out.println(Math.PI*side*side);
        }
        else if (figure.equals("rectangle"))
        {
            double side1 = Double.parseDouble(scanner.nextLine());
            System.out.println(side*side1);
        }
        else if (figure.equals("triangle"))
        {
            double side1 = Double.parseDouble(scanner.nextLine());
            System.out.println(side*side1/2);
        }
    }
}
