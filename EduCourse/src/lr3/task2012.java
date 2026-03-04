package lr3;

import java.io.PrintWriter;
import java.util.Scanner;

public class task2012 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();

        // всего 12 задач
        int remaining = 12 - a;
        // Остаётся 4 часа = 4 * 60
        String res = remaining * 45 <= 4 * 60 ? "YES" : "NO";

        out.println(res);
        out.flush();
    }
}
