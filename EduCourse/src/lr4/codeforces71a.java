package lr4;

import java.io.PrintWriter;
import java.util.*;

// https://codeforces.com/problemset/problem/71/A
public class codeforces71a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        HashSet<String> results = new HashSet<String>();
        for (int i = 0; i < n;i++){
            String word = in.nextLine();
            int length = word.length();
            if (length > 10){
                word = word.charAt(0) 
                    + Integer.toString(length - 2) 
                    + word.charAt(length - 1);
            }

            results.add(word);
        }

        for (String res : results)
            out.println(res);
        out.flush();
    }
}
