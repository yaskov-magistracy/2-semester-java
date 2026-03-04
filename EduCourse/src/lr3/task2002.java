package lr3;

import java.io.PrintWriter;
import java.util.*;

public class task2002 {
    private static HashMap<String, String> PasswordsByLogin = new HashMap<String, String>();
    private static HashSet<String> LoggedUsers = new HashSet<String>();


    public static void main(String[] a){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        // скипаем пустую линию :pain:
        in.nextLine();
        StringBuilder result = new StringBuilder();
        for(int i = 0;i< n;i++){
            String[] args = in.nextLine().split(" ");
            String command = args[0];
            String username = args[1];
            String password = args.length > 2 ? args[2] : "";

            if (command.equals("logout")){
                if (LoggedUsers.contains(username)){
                    LoggedUsers.remove(username);
                    result.append("success: user logged out" + '\n');
                } else if (PasswordsByLogin.containsKey(username)){
                    result.append("fail: already logged out" + '\n');
                } else {
                    result.append("fail: no such user" + '\n');
                }
            } else if (command.equals("register")) {
                if (PasswordsByLogin.containsKey(username)){
                    result.append("fail: user already exists" + '\n');
                } else {
                    PasswordsByLogin.put(username, password);
                    result.append("success: new user added" + '\n');
                }
            } else if (command.equals("login")) {
                if (!PasswordsByLogin.containsKey(username)){
                    result.append("fail: no such user" + '\n');
                } else if (!PasswordsByLogin.get(username).equals(password)){
                    result.append("fail: incorrect password" + '\n');
                } else if (LoggedUsers.contains(username)){
                    result.append("fail: already logged in" + '\n');
                }  else{
                    LoggedUsers.add(username);
                    result.append("success: user logged in" + '\n');
                }
            }
        }

        out.println(result.toString());
        out.flush();
    }
}
