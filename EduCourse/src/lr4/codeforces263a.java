package lr4;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/263/A
public class codeforces263a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int x = 0;
        int y = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int cur = in.nextInt();
                if (cur == 1) {
                    x = i;
                    y = j;
                }
            }
        }

        // считаем смещение относительно центра
        int res = Math.abs(2 - x) + Math.abs(2 - y);

        out.println(res);
        out.flush();
    }
}
