import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){

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
            
            while(true){
                 System.out.println("do you want to enter a new entry? (y/n)");
                 String ans = scanner.nextLine();

              //adds entry to the diary       
              if (ans.equals("y")) {

                  System.out.println("Please enter your entry");
                  String entry = scanner.nextLine();

                  addEntry(entrys, entry);
                  System.out.println("Your entry has been added");

              } //checks an entry 
              else if (ans.equals("n")) {
                  System.out.println("do you want to see your entries? (y/n)");
                  ans = scanner.nextLine();
                  if (ans.equals("y")) {
                      System.out.println("Your entries are:");
                      for (String entry : entrys) {
                          System.out.println(entry);
                      }
                  } else if (ans.equals("n")) {
                      System.out.println("Goodbye");
                      break;
                  } else {
                      System.out.println("Please enter a valid answer");
                  }

              }
              
            }
            
             
             

        }

    }

    public static void addEntry(ArrayList<String> entrys, String entry) {
        entrys.add(entry);
    }
}


