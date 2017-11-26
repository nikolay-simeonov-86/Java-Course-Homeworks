import java.util.Scanner;

public class p02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double firstbrothertime = Double.parseDouble(scanner.nextLine());
        double secondbrothertime = Double.parseDouble(scanner.nextLine());
        double thirdbrothertime = Double.parseDouble(scanner.nextLine());
        double fathertime = Double.parseDouble(scanner.nextLine());

        double alltime = 1/(1/firstbrothertime+1/secondbrothertime+1/thirdbrothertime);
        // double resttime = alltime*0.15
        double allplusresttime = alltime+alltime*0.15;

        if (fathertime>allplusresttime)
        {
            double time = Math.floor(fathertime-allplusresttime);
            System.out.printf("Cleaning time: %.2f%n", allplusresttime);
            System.out.printf("Yes, there is a surprise - time left -> %d hours.", (int)time);
        }
        else
        {
            double time = Math.ceil(allplusresttime-fathertime);
            System.out.printf("Cleaning time: %.2f%n", allplusresttime);
            System.out.printf("No, there isn't a surprise - shortage of time -> %d hours.", (int) time);
        }
    }
}
