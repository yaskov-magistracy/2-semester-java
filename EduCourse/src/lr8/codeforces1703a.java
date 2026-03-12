package lr8;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/1703/A
public class codeforces1703a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        String[] res = new String[n];

        for(int i = 0;i<n;i++){
            String cur = in.next();
            res[i] = cur.equalsIgnoreCase("yes")
                    ? "YES"
                    : "NO";
        }

        for (String cur : res)
            System.out.println(cur);
        out.flush();
    }
}
