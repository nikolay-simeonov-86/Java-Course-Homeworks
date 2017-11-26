import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double amount = Double.parseDouble(scanner.nextLine());
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        {
            if (string1.equals(string2))
                System.out.println("Incorrect data");
            else if (string1.equals("BGN")) {
                if (string2.equals("USD")) {
                    double bgntousd = amount / 1.79549;
                    System.out.printf("%.2f", bgntousd);
                } else if (string2.equals("EUR")) {
                    double bgntoeur = amount / 1.95583;
                    System.out.printf("%.2f", bgntoeur);
                } else if (string2.equals("GBP")) {
                    double bgntogbp = amount / 2.53405;
                    System.out.printf("%.2f", bgntogbp);
                }
            }
            if (string1.equals("USD")) {
                if (string2.equals("BGN")) {
                    double usdtobgn = amount * 1.79549;
                    System.out.printf("%.2f", usdtobgn);
                } else if (string2.equals("EUR")) {
                    double usdtoeur = (amount * 1.79549) / 1.95583;
                    System.out.printf("%.2f", usdtoeur);
                } else if (string2.equals("GBP")) {
                    double usdtogbp = (amount * 1.79549) / 2.53405;
                    System.out.printf("%.2f", usdtogbp);
                }
            }
            if (string1.equals("EUR")) {
                if (string2.equals("BGN")) {
                    double eurtobgn = amount / 1.95583;
                    System.out.printf("%.2f", eurtobgn);
                } else if (string2.equals("USD")) {
                    double eurtousd = (amount * 1.95583) / 1.79549;
                    System.out.printf("%.2f", eurtousd);
                } else if (string2.equals("GBP")) {
                    double eurtogbp = (amount * 1.95583) / 2.53405;
                    System.out.printf("%.2f", eurtogbp);
                }
            }
            if (string1.equals("GBP")) {
                if (string2.equals("BGN")) {
                    double gbptobgn = amount / 2.53405;
                    System.out.printf("%.2f", gbptobgn);
                } else if (string2.equals("USD")) {
                    double gbptousd = (amount * 2.53405) / 1.79549;
                    System.out.printf("%.2f", gbptousd);
                } else if (string2.equals("EUR")) {
                    double gbptoeur = (amount * 2.53405) / 1.95583;
                    System.out.printf("%.2f", gbptoeur);
                }
            }

        }
    }
}