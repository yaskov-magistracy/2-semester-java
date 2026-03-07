package lr6;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/271/A
public class codeforces271a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        int res = 0;
        for (int i = n+1; i<= 9999;i++)
        {
            // 4 уникальные цифры
           if (String.valueOf(i).chars().distinct().count() == 4)
           {
               res = i;
               break;
           }
        }

        out.println(res);
        out.flush();
    }
}
