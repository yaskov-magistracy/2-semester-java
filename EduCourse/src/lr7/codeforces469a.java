package lr7;

import java.io.PrintWriter;
import java.util.*;

// https://codeforces.com/problemset/problem/469/A
public class codeforces469a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        // только уникальные уровни
        Set<Integer> levels = new HashSet<>();

        int p = in.nextInt();
        for (int i = 0; i < p; i++)
            levels.add(in.nextInt());

        int q = in.nextInt();
        for (int i = 0; i < q; i++)
            levels.add(in.nextInt());

        String res = levels.size() == n
                ? "I become the guy."
                : "Oh, my keyboard!";

        out.println(res);
        out.flush();
    }
}
