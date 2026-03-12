package lr8;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/510/A
public class codeforces510a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char element = '.';
                boolean isLeftBorder = i % 4 == 3;
                if (i % 2 == 0
                        || j == 0 && isLeftBorder
                        || j == m - 1 && !isLeftBorder)
                    element = '#';

                System.out.print(element);
            }
            System.out.println();
        }

        out.flush();
    }
}
