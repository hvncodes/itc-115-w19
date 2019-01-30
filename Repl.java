import java.util.Scanner;

public class Repl {

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("Enter a String: ");
      String str = console.nextLine();
      System.out.print("Enter number of repetitions: ");
      int rep = console.nextInt();
      
      doTheThing(str, rep);
   }
   
   public static void doTheThing(String str, int n) {
      for (int i = 0; i < n; i++) {
         System.out.println(str);
      }
   }
}