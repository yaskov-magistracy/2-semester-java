package lr5;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/546/A
public class codeforces546a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();

        // геом. прогрессия
        int totalCost = k * w * (w + 1) / 2;
        int res = Math.max(0, totalCost - n);

        out.println(res);
        out.flush();
    }
}
