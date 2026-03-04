package lr3;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1639 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int m = in.nextInt();
        int n = in.nextInt();

        String result;
        // всего в игре всегда будет ровно (m * n - 1) ходов
        // нечет => выигрывает начинающий и наоборот
        if ((m * n - 1) % 2 != 0) {
            result = "[:=[first]";
        } else {
            result = "[second]=:]";
        }

        out.print(result);
        out.flush();
    }
}
