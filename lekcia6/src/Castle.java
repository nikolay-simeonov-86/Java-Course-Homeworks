import java.util.Scanner;

public class Castle
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // n=3 i n=4
        // row1 - "/" + n/2 "^" + "\" + "/" + n/2 "^" + "\"
        // row n-2 - "|" za n=3 4*" " za n=4 6*" " " "|"
        // lastrow - "/" n/2 ^ "\" "/" n/2 ^ "\"

        // n>4
        // row1 - "/" n/2 "^" "\" n/2 "_" "/" n/2 ^ "\"
        // blankspace = 8; blankspace +=2;
        // row n-2 - "|" blankspace " " "|"
        // 3-4 4-6 5-8 6-10 7-12 8-14
        // secondtolastrow -
        // lastrow - "/" n/2 "^" "\" n/2 " " "/" n/2 ^ "\"
    }
}
