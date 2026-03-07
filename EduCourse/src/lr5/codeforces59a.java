package lr5;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/59/A
public class codeforces59a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s = in.next();

        int upper = 0;
        for (char c : s.toCharArray()) {
            // считаем заглавные
            if (Character.isUpperCase(c))
                upper++;
        }
        String res = upper > s.length() / 2
                ? s.toUpperCase()
                : s.toLowerCase();

        out.println(res);
        out.flush();
    }
}
