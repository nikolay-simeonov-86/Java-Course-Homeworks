import java.util.Scanner;

public class SmallShop
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String products = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double result = 0;
        if (town.equals("Sofia"))
        {
            if (products.equals("coffee"))
            {
            result = quantity*0.5;
            }
            if (products.equals("water"))
            {
                result = quantity*0.8;
            }
            if (products.equals("beer"))
            {
                result = quantity*1.2;
            }
            if (products.equals("sweets"))
            {
                result = quantity*1.45;
            }
            if (products.equals("peanuts"))
            {
                result = quantity*1.6;
            }
        }
        if (town.equals("Plovdiv"))
        {
            if (products.equals("coffee"))
            {
                result = quantity*0.4;
            }
            if (products.equals("water"))
            {
                result = quantity*0.7;
            }
            if (products.equals("beer"))
            {
                result = quantity*1.15;
            }
            if (products.equals("sweets"))
            {
                result = quantity*1.3;
            }
            if (products.equals("peanuts"))
            {
                result = quantity*1.5;
            }
        }
        if (town.equals("Varna"))
        {
            if (products.equals("coffee"))
            {
                result = quantity*0.45;
            }
            if (products.equals("water"))
            {
                result = quantity*0.7;
            }
            if (products.equals("beer"))
            {
                result = quantity*1.1;
            }
            if (products.equals("sweets"))
            {
                result = quantity*1.35;
            }
            if (products.equals("peanuts"))
            {
                result = quantity*1.55;
            }
        }
        System.out.println(result);
    }
}
