import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Student {
    private Account account;

    Student() {
        account = new Account();
    }

    Account getAccount() {
        return this.account;
    }

    Student (String username, String password) {
        account = new Account(username, password);
    }

    boolean register() {
        String username="", password="";
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.println("Please enter a username [At least 6 characters]:");
        try {
            username = br.readLine();
            account.setUsername(username);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Please enter a username [At least 6 characters with at least one digit]:");
        try {
            password = br.readLine();
            account.setPassword(password);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }
}