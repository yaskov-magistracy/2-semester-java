package lr6;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/136/A
public class codeforces136a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        int[] presents = new int[n];

        for (int i = 0; i < n; i++) {
            int curId = in.nextInt();
            // тк айдишники не как в массиве(с 0) то переводим их
            presents[curId - 1] = i + 1;
        }

        for (int present : presents)
            out.print(present + " ");
        out.flush();
    }
}
