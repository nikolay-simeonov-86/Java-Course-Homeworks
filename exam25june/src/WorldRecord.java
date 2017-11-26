import java.util.Scanner;

public class WorldRecord
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double WorldRecordSeconds = Double.parseDouble(scanner.nextLine());
        double DistanceMeters = Double.parseDouble(scanner.nextLine());
        double TimeSeconds = Double.parseDouble(scanner.nextLine());

        double TimeTemp = DistanceMeters*TimeSeconds;
        double TimeDelay = Math.floor(DistanceMeters/15)*12.5;
        double TimeAll = TimeTemp + TimeDelay;

        if (TimeAll<WorldRecordSeconds)
        {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", TimeAll);
        }
        else
        {
            double Time = Math.abs(WorldRecordSeconds-TimeAll);
            System.out.printf("No, he failed! He was %.2f seconds slower.", Time);
        }
    }
}
