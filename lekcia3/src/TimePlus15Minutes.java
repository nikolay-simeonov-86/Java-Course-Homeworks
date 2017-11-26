import java.util.Scanner;

public class TimePlus15Minutes
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int hour2 = 1;
        int hour1 = 1;
        int min1 = min+15;
        int min2 = 1;

       if (min1>=0 && min1<=59)
       {
           if (hour>=0 && hour<=23)
           {
               if (min1<10)
               {
                   System.out.println(hour + ":0" + min1);
               }
               else
               {
                   System.out.println(hour + ":" + min1);
               }
           }
       }
       if (min1>59)
       {
           hour1 = hour+1;
           min2 = min1-60;
            if (hour1>23)
            {
                hour2 = hour1-24;
                if (min2<10)
                {
                    System.out.println(hour2 + ":0" + min2);
                }
                else
                {
                    System.out.println(hour2 + ":" + min2);
                }
            }
           else if (hour1>=0 && hour1<=23)
           {
               if (min2<10)
               {
                   System.out.println(hour1 + ":0" + min2);
               }
               else
               {
                   System.out.println(hour1 + ":" + min2);
               }
           }
       }
       if (hour>23)
       {
           hour1 = hour-24;

           if (min1>=0 && min1<=59)
           {
               if (min1<10)
               {
                   System.out.println(hour + ":0" + min1);
               }
               else
               {
                   System.out.println(hour1 + ":" + min1);
               }
           }
       }
    }
}
