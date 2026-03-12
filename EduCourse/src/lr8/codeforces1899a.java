package lr8;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/1899/A
public class codeforces1899a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        String[] res = new String[n];

        for (int i = 0 ; i< n;i++){
            int cur = in.nextInt();
            // победит Ваня если старт будет рядом с числом уже делящимся на 3
            res[i] = (cur + 1) % 3 == 0 || (cur - 1) % 3 == 0
                    ? "First"
                    : "Second";
        }

        for(String cur : res)
            System.out.println(cur);
        out.flush();
    }
}
