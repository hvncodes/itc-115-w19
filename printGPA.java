import java.util.Scanner;

public class printGPA {

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      printGPA(console);
   }
   
   public static void printGPA(Scanner console) {
      System.out.print("Enter a student record: ");
      String name = console.next();
      int numOfGrades = console.nextInt();
      double totalGrades = 0.0;
      for (int i = 0; i < numOfGrades; i++) {
         int grade = console.nextInt();
         totalGrades = totalGrades + grade;
      }
      System.out.println(name + "'s grade is " + totalGrades/numOfGrades);
   }
}