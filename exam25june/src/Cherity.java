import java.util.Scanner;

public class Cherity
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int cooks = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int wafers = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        double pricecakes = cakes*cooks*45;
        double pricewafers = wafers*cooks*5.8;
        double pricepancakes = pancakes*cooks*3.2;
        double sumday = pricecakes+pricewafers+pricepancakes;
        double sumall = (pricecakes+pricewafers+pricepancakes)*days;
        double cheritymoney = sumall*7/8;

        System.out.printf("%.2f", cheritymoney);

    }
}
