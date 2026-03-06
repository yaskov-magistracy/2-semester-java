package lr4;

import java.io.PrintWriter;
import java.util.*;

// https://codeforces.com/problemset/problem/158/A
public class codeforces158a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int k = in.nextInt();
        int min = 1;
        int res = 0;
        for (int i = 0; i < n;i++){
            int cur = in.nextInt();

            // не считаем тех у кого меньше чем k и 0
            if (i == k - 1 && cur != 0)
                min = cur;
            if (min > cur)
                continue;

            res++;
        }

        out.println(res);
        out.flush();
    }
}