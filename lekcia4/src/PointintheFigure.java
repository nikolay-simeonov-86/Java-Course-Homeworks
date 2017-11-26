import java.util.Scanner;

public class PointintheFigure
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

            if ((y==0 && x>=0 && x<=3*h) ||
                (y==h && (x>=0 && x <=h || x>=2*h && x<=3*h)) ||
                (y==4*h && x>=h && x<=2*h) ||
                (x==0 && y>=0 && y<=h) ||
                (x==h && y==0) ||
                (x==2*h && y==0) ||
                (x==h && y>=h && y<=4*h) ||
                (x==3*h && y>=0 && y<=h) ||
                (x==2*h && y>=h && y<=4*h))
            {
                System.out.println("border");
            }
            else if ((y>0 && y<h && x>0 && x<3*h) ||
                    (y>h && y<4*h && x>h && x<2*h) ||
                    (x>h && x<2*h && y>0 && y<4*h))
            {
                System.out.println("inside");
            }
            else // if ((y<0 && x<0) || (y<0 && x>0) || (x<0 && y>0) || (y>h && x>0 && x<h) || (y>4*h && x>h && x<2*h) || (y>h && x>2*h) || (y>0 && x>3*h))
            {
                System.out.println("outside");
            }
    }
}
