package lr4;

import java.io.PrintWriter;
import java.util.*;

// https://codeforces.com/problemset/problem/231/A
public class codeforces231a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int res = 0;
        for (int i = 0; i < n;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            // в решении уверены двое => задачу будут решать
            if (a + b + c >= 2)
                res++;
        }

        out.println(res);
        out.flush();
    }
}