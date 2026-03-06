package lr4;

import java.io.PrintWriter;
import java.util.*;

// https://codeforces.com/problemset/problem/282/A
public class codeforces282a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int res = 0;
        for (int i = 0; i < n;i++){
            String oper = in.next();
            // смотрим какая операция
            if (oper.contains("++"))
                res++;
            else
                res--;
        }

        out.println(res);
        out.flush();
    }
}