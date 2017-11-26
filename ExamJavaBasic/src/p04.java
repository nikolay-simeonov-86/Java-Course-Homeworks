import java.util.Scanner;

public class p04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double allliters = 0;
        double allgradus = 0;
        double alllitersandgradus = 0;

        for (int i = 0; i < n; i++)
        {
            double liters = Double.parseDouble(scanner.nextLine());
            double gradus = Double.parseDouble(scanner.nextLine());

            allliters = allliters+liters;
            allgradus = allgradus+gradus;
            alllitersandgradus = alllitersandgradus+liters*gradus;
        }
        double degrees = alllitersandgradus/allliters;
        System.out.printf("Liter: %.2f%n", allliters);
        System.out.printf("Degrees: %.2f%n", degrees);

        if (degrees<38)
        {
            System.out.println("Not good, you should baking!");
        }
        else if (degrees>=38 && degrees<=42)
        {
            System.out.println("Super!");
        }
        else if (degrees>42)
        {
            System.out.println("Dilution with distilled water!");
        }
    }
}
