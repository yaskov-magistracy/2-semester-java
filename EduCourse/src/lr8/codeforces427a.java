package lr8;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/427/A
public class codeforces427a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int polices = 0;
        int res = 0;

        for(int i = 0;i<n;i++){
            int cur = in.nextInt();
            polices += cur;
            if (polices < 0)
                res++;

            polices = Math.max(polices, 0);
        }

        System.out.println(res);
        out.flush();
    }
}
