package lr4;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/339/A
public class codeforces339a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s = in.next();

        // обоим нужен чёт => само число тоже чётное
        String[] res = s.split("\\+");
        java.util.Arrays.sort(res);

        out.println(String.join("+", res));
        out.flush();
    }
}
