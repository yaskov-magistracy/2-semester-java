package lr6;

import java.io.PrintWriter;
import java.util.*;

// https://codeforces.com/problemset/problem/228/A
public class codeforces228a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s = in.nextLine();

        // считаем уже уникальные
        long unics = Arrays.stream(s.split(" "))
                .distinct()
                .count();

        out.println(4 - unics);
        out.flush();
    }
}
