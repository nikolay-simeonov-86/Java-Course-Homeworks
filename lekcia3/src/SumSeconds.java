import java.util.Scanner;

public class SumSeconds
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int firstcont = Integer.parseInt(scanner.nextLine());
        int secondcont = Integer.parseInt(scanner.nextLine());
        int thirdcont = Integer.parseInt(scanner.nextLine());
        int combtimesec = firstcont+secondcont+thirdcont;
        int combtime = (firstcont+secondcont+thirdcont)/60;
        if (combtime==0)
        {
            if (Math.abs(combtimesec)>=10)
            {
                System.out.println(combtime + ":" + Math.abs(combtimesec));
            }
            else if (Math.abs(combtimesec)<10)
            {
                System.out.println(combtime + ":0" + Math.abs(combtimesec));
            }
        }
        if (combtime==1)
        {
            if (Math.abs(60-combtimesec)>=10)
            {
                System.out.println(combtime + ":" + Math.abs(60 - combtimesec));
            }
            else if (Math.abs(60-combtimesec)<10)
            {
                System.out.println(combtime + ":0" + Math.abs(60 - combtimesec));
            }
        }
        if (combtime==2)
        {
            if (Math.abs(120-combtimesec)>=10)
            {
                System.out.println(combtime + ":" + Math.abs(120 - combtimesec));
            }
            else if (Math.abs(120-combtimesec)<10)
            {
                System.out.println(combtime + ":0" + Math.abs(120 - combtimesec));
            }
        }
        if (combtime==3)
        {
            if (Math.abs(180-combtimesec)>=10)
            {
                System.out.println(combtime + ":" + Math.abs(180 - combtimesec));
            }
            else if (Math.abs(180-combtimesec)<10)
            {
                System.out.println(combtime + ":0" + Math.abs(180 - combtimesec));
            }
        }
    }
}
