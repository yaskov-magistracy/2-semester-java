package lr8;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/155/A
public class codeforces155a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int first = in.nextInt();
        int max = first;
        int min = first;
        int res = 0;

        for (int i  =0; i<n -1;i++){
            int cur = in.nextInt();
            if (cur > max){
                res++;
                max = cur;
            }
            else if(cur < min){
                res++;
                min = cur;
            }
        }

        System.out.println(res);
        out.flush();
    }
}
