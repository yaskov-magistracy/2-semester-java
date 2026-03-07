package lr6;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/200/B
public class codeforces200b {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        // просто делим долю сока на весь объём
        double all = n * 100;
        double juice = 0;

        for (int i = 0; i < n; i++) {
            juice += in.nextDouble();
        }

        out.println(juice / all * 100);
        out.flush();
    }
}
