package lr5;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/617/A
public class codeforces617a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();

        // прибавляем 4 чтобы поделить с округлением вверх
        int res = (a + 4) / 5;

        out.println(res);
        out.flush();
    }
}
