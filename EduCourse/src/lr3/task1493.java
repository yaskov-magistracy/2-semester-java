package lr3;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1493 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        String result;
        if (isLucky(n - 1) || isLucky(n + 1)) {
            result = "Yes";
        } else {
            result = "No";
        }

        out.println(result);
        out.flush();
    }

    private static boolean isLucky(int n) {
        int firstThreeDigits = n / 1000;
        int secondThreeDigits = n % 1000;

        return sumDigits(firstThreeDigits) == sumDigits(secondThreeDigits);
    }

    private static int sumDigits(int n) {
        return (n / 100) + (n / 10 % 10) + (n % 10);
    }
}
