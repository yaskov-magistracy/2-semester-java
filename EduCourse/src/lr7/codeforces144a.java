package lr7;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/144/A
public class codeforces144a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int max = 0;
        int maxInd = 0;
        int min = 100;
        int minInd = 0;
        for(int i = 0; i< n;i++){
            int cur = in.nextInt();

            if (cur > max) {
                max = cur;
                maxInd = i;
            }
            // чем ближе малнький к концу тем лучше
            if (cur <= min) {
                min = cur;
                minInd = i;
            }
        }

        int res = maxInd // двигаем высокого
                + n - 1 - minInd; // двигаем маленького
        if (minInd <= maxInd)
            res--; // убираем пересечение(их поменяли друг с другом)


        out.println(res);
        out.flush();
    }
}
