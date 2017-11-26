import java.util.Scanner;

public class From0to100withwords
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        int Stotici = (int)(a/100);
        int Desetici = (int)((a%100)/10);
        int Edinici = (int)(a%10);
        int Spec = (int)(a%100);
        String Pismen;
        if (a==50)
        {
            System.out.println("fifty");
        }
        if (a>100 || a<0)
        {
            System.out.println("invalid number");
        }
        else
        {

        switch(Edinici){
            case 1: Pismen = "one";break;
            case 2: Pismen = "two";break;
            case 3: Pismen = "three";break;
            case 4: Pismen = "four";break;
            case 5: Pismen = "five";break;
            case 6: Pismen = "six";break;
            case 7: Pismen = "seven";break;
            case 8: Pismen = "eight";break;
            case 9: Pismen = "nine";break;
            default: Pismen ="";break;
        }
        switch(Desetici){
            case 2: Pismen = "twenty "+Pismen;break;
            case 3: Pismen = "thirty "+Pismen;break;
            case 4: Pismen = "forty "+Pismen;break;
            case 5: Pismen = "fifty "+Pismen;break;
            case 6: Pismen = "sixty "+Pismen;break;
            case 7: Pismen = "seventy "+Pismen;break;
            case 8: Pismen = "eighty "+Pismen;break;
            case 9: Pismen = "ninety "+Pismen;break;
            default: Pismen =Pismen+"";break;
        }
        switch(Spec){
            case 10: Pismen="ten";;break;
            case 11: Pismen="eleven";;break;
            case 12: Pismen = "twelve";break;
            case 13: Pismen = "thirteen";break;
            case 14: Pismen = "fourteen";break;
            case 15: Pismen = "fifteen";break;
            case 16: Pismen = "sixteen";break;
            case 17: Pismen = "seventeen";break;
            case 18: Pismen = "eighteen";break;
            case 19: Pismen = "nineteen";break;
            case 20: Pismen="twenty";;break;
            default: Pismen = Pismen+"";break;
        }

        switch(Stotici){
            case 1: Pismen = "one hundred"+Pismen;break;

            default: Pismen = Pismen+"";break;
        }
        if(a==0)Pismen="zero";
        System.out.println(Pismen);

        }
    }
}
