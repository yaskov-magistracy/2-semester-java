package lr2;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class task1025 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int k = in.nextInt();
        int[] groups = new int[k];

        for (int i = 0; i < k; i++) {
            groups[i] = in.nextInt();
        }


        // сортируем группы по количеству избирателей, чтобы побеждать в самых маленьких.
        Arrays.sort(groups);

        int res = 0;
        int groupsToWin = k / 2 + 1; // минимальное число групп для общей победы
        for (int i = 0; i < groupsToWin; i++) {
            res += groups[i] / 2 + 1;
        }

        out.println(res);
        out.flush();
    }
}
