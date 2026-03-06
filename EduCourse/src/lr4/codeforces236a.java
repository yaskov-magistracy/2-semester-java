package lr4;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/236/A
public class codeforces236a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s = in.next();

        // считаем уникальные буквы
        String res = s.chars().distinct().count() % 2 > 0
                ? "IGNORE HIM!"
                : "CHAT WITH HER!";

        out.println(res);
        out.flush();
    }
}
