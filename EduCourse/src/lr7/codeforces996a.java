package lr7;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/996/A
public class codeforces996a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        int res = 0;
        int[] delimiters = new int[]{100, 20, 10, 5, 1};
        // считаем кол-во каждой купюры
        for (int delimiter : delimiters) {
            if (n == 0)
                break;

            res += n / delimiter;
            n %= delimiter;
        }


        out.println(res);
        out.flush();
    }
}
