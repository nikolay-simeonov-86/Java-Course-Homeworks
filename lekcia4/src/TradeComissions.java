import java.util.Scanner;

public class TradeComissions
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double s = Double.parseDouble(scanner.nextLine());
        double result = -1;
        if (town.equals("Sofia"))
        {
            if (s>=0 && s<=500)
            {
                result = s*0.05;
            }
            else if (s>=500 && s<=1000)
            {
                result = s*0.07;
            }
            else if (s>=1000 && s<=10000)
            {
                result = s*0.08;
            }
            else if (s>10000)
            {
                result = s*0.12;
            }
        }
        if (town.equals("Varna"))
        {
            if (s>=0 && s<=500)
            {
                result = s*0.045;
            }
            else if (s>=500 && s<=1000)
            {
                result = s*0.075;
            }
            else if (s>=1000 && s<=10000)
            {
                result = s*0.1;
            }
            else if (s>10000)
            {
                result = s*0.13;
            }
        }
        if (town.equals("Plovdiv"))
        {
            if (s>=0 && s<=500)
            {
                result = s*0.055;
            }
            else if (s>=500 && s<=1000)
            {
                result = s*0.08;
            }
            else if (s>=1000 && s<=10000)
            {
                result = s*0.12;
            }
            else if (s>10000)
            {
                result = s*0.145;
            }
        }
        if (result >= 0)
        {
            System.out.printf("%.2f", result);
        }
        else
        {
            System.out.println("error");
        }
    }
}
