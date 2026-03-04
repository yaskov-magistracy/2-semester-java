package lr2;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1225 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        // числа Фибоначи
        long[] dp = new long[50];
        dp[1] = 2;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        long result = dp[n];

        out.println(result);
        out.flush();
    }
}
