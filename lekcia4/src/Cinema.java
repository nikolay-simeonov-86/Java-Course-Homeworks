import java.util.Scanner;

public class Cinema
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String screening = scanner.nextLine();
        double rows = Double.parseDouble(scanner.nextLine());
        double columns = Double.parseDouble(scanner.nextLine());
        double prize = 1;

        if (screening.equals("Premiere"))
        {
            prize = (rows*columns)*12;
        }
        else if (screening.equals("Normal"))
        {
            prize=(rows*columns)*7.5;
        }
        else if (screening.equals("Discount"))
        {
            prize=(rows*columns)*5;
        }
        System.out.printf("%.2f leva", prize);
    }
}
