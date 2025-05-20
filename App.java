import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> entrys = new ArrayList<String>();

        String password = "";
        boolean isCorrect = true;

        // asks for a password
        System.out.println("Please make your password");
        password = scanner.nextLine();
        
        // asks for a password
        System.out.println("Please enter your password for verfication");
        String pass = scanner.nextLine();
        
        if (pass.equals(password)) {
            System.out.println("Password is correct");
            isCorrect = true;
        } else {
            System.out.println("Password is incorrect");
            isCorrect = false;
        }

        if (isCorrect) {
            System.out.println("Welcome to your diary");
            
            
        } else {
            System.out.println("You are not allowed to access this diary");
    
        }

        //ask for was entry you want to access, or start a new entrie, if an entry exsitst in the diary replace that entry with the new entry.

    }
}
