package lr3;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1876 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        // все b правых тапочек вытягиваются до 40-го левого (Фаза 2 пропускается).
        // в первой фазе вытягивается 39 правых, а во второй — все оставшиеся (a - 40) левых.
        int scenario1 = 2 * b +40;
        int scenario2 = 2 * a + 39;

        out.println(Math.max(scenario1, scenario2));
        out.flush();
    }
}
