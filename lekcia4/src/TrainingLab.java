import java.util.Scanner;

public class TrainingLab
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourexam = Integer.parseInt(scanner.nextLine());
        int minuteexam = Integer.parseInt(scanner.nextLine());
        int hourstudent = Integer.parseInt(scanner.nextLine());
        int minutestudent = Integer.parseInt(scanner.nextLine());

        int minuteexamtotal = hourexam*60+minuteexam;
        int minutestudenttotal = hourstudent*60+minutestudent;

        if ((minutestudenttotal-30)<minuteexamtotal)
        {
            int resulthour = hourexam-hourstudent;
            int resultminute = minuteexamtotal-minutestudenttotal;
            if (resultminute<60)
            {
                System.out.println("Early");
                System.out.println(resultminute + "minutes before the start");
            }
            else if (resultminute>=60 && resultminute<120)
            {
                int resultminute1 = resultminute%60;
                int resulthour1 = resulthour+1;
                if (resultminute1<10)
                {
                    System.out.println("Early");
                    System.out.println(resulthour1 + ":0" + resultminute1 + "hours before the start");
                }
                else if (resultminute1>=10)
                {
                    System.out.println("Early");
                    System.out.println(resulthour1 + resultminute1 + "hours before the start");
                }
            }
            else if (resultminute>=120 && resultminute<180)
            {
                int resultminute1 = resultminute%120;
                int resulthour1 = resulthour+2;
                if (resultminute1<10)
                {
                    System.out.println("Early");
                    System.out.println(resulthour1 + ":0" + resultminute1 + "hours before the start");
                }
                else if (resultminute1>=10)
                {
                    System.out.println("Early");
                    System.out.println(resulthour1 + resultminute1 + "hours before the start");
                }
            }
            else if (resultminute>=180 && resultminute<240)
            {
                int resultminute1 = resultminute%180;
                int resulthour1 = resulthour+3;
                if (resultminute1<10)
                {
                    System.out.println("Early");
                    System.out.println(resulthour1 + ":0" + resultminute1 + "hours before the start");
                }
                else if (resultminute1>=10)
                {
                    System.out.println("Early");
                    System.out.println(resulthour1 + resultminute1 + "hours before the start");
                }
            }
            else if (resultminute>=240 && resultminute<300)
            {
                int resultminute1 = resultminute%240;
                int resulthour1 = resulthour+4;
                if (resultminute1<10)
                {
                    System.out.println("Early");
                    System.out.println(resulthour1 + ":0" + resultminute1 + "hours before the start");
                }
                else if (resultminute1>=10)
                {
                    System.out.println("Early");
                    System.out.println(resulthour1 + resultminute1 + "hours before the start");
                }
            }
        }
        else if (minutestudenttotal>minuteexamtotal)
        {
            int resulthour = hourstudent-hourexam;
            int resultminute = minutestudenttotal-minuteexamtotal;
            if (resultminute<60)
            {
                System.out.println("Late");
                System.out.println(resultminute + "minutes after the start");
            }
            else if (resultminute>=60 && resultminute<120)
            {
                int resultminute1 = resultminute%60;
                int resulthour1 = resulthour+1;
                if (resultminute1<10)
                {
                    System.out.println("Late");
                    System.out.println(resulthour1 + ":0" + resultminute1 + "hours after the start");
                }
                else if (resultminute1>=10)
                {
                    System.out.println("Late");
                    System.out.println(resulthour1 + resultminute1 + "hours after the start");
                }
            }
            else if (resultminute>=120 && resultminute<180)
            {
                int resultminute1 = resultminute%120;
                int resulthour1 = resulthour+2;
                if (resultminute1<10)
                {
                    System.out.println("Late");
                    System.out.println(resulthour1 + ":0" + resultminute1 + "hours after the start");
                }
                else if (resultminute1>=10)
                {
                    System.out.println("Late");
                    System.out.println(resulthour1 + resultminute1 + "hours after the start");
                }
            }
            else if (resultminute>=180 && resultminute<240)
            {
                int resultminute1 = resultminute%180;
                int resulthour1 = resulthour+3;
                if (resultminute1<10)
                {
                    System.out.println("Late");
                    System.out.println(resulthour1 + ":0" + resultminute1 + "hours after the start");
                }
                else if (resultminute1>=10)
                {
                    System.out.println("Late");
                    System.out.println(resulthour1 + resultminute1 + "hours after the start");
                }
            }
            else if (resultminute>=240 && resultminute<300)
            {
                int resultminute1 = resultminute%240;
                int resulthour1 = resulthour+4;
                if (resultminute1<10)
                {
                    System.out.println("Late");
                    System.out.println(resulthour1 + ":0" + resultminute1 + "hours after the start");
                }
                else if (resultminute1>=10)
                {
                    System.out.println("Late");
                    System.out.println(resulthour1 + resultminute1 + "hours after the start");
                }
            }
        }
        else if (minutestudenttotal>=minuteexamtotal-30 || minutestudenttotal<=minuteexamtotal)
        {
            int resulthour = hourstudent-hourexam;
            int resultminute = minutestudenttotal-minuteexamtotal;
            if (resultminute<60)
            {
                System.out.println("On Time");
                System.out.println(resultminute + "minutes after the start");
            }
            else if (resultminute==0)
            {
                System.out.println("On Time");
            }
        }
    }
}
