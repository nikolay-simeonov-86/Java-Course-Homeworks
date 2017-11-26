import java.util.Scanner;

public class p01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double lenght = Double.parseDouble(scanner.nextLine());
        double hight = Double.parseDouble(scanner.nextLine());
        double procentige = Double.parseDouble(scanner.nextLine());

        double volume = width*lenght*hight;
        double volumeliters = volume*0.001;
        double procentigereal = procentige*0.01;
        double realvolume = volumeliters*(1-procentigereal);

        System.out.printf("%.3f", realvolume);
    }
}
