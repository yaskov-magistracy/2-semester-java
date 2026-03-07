package lr6;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/266/B
public class codeforces266b {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int t = in.nextInt();

        char[] res = in.next().toCharArray();
        for (int i = 0; i < t;i++)
        {
            for(int j = 0;j<res.length - 1;j++){
                // двигаем очередь t раз
                if (res[j] == 'B' && res[j + 1] == 'G')
                {
                    res[j] = 'G';
                    res[j+1] = 'B';
                    j++; // эти двое уже менялись
                }
            }
        }

        out.println(res);
        out.flush();
    }
}
