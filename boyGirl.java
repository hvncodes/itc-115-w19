import java.io.*;
import java.util.*;

public class boyGirl {
   public static void main(String[] args)
            throws FileNotFoundException {
            
      Scanner input = new Scanner(new File("boysgirls.txt"));
      int position = 1; //init line position
      int numBoys = 0; //init total num of boys
      int numGirls = 0; //init total num of girls
      int sumBoysAge = 0; //init sum of boys' age
      int sumGirlsAge = 0; //init sum of girls' age
      while (input.hasNextLine()) {
         String line = input.nextLine();
         Scanner reader = new Scanner(line);
         
         String name = reader.next(); //consume to move scanner
         int age = reader.nextInt(); //store person's age

         if (position % 2 == 1) { //odd line, boy
            numBoys++;
            sumBoysAge += age;
         } else { //even line, girl
            numGirls++;
            sumGirlsAge += age;
         }
         //update line pos. for next line
         position++;
      }
      System.out.println(numBoys + " boys, " + numGirls + " girls");
      //looks like we're taking the absolute value, the difference
      //should be -5 (boys - girls)?
      System.out.println("Difference between boys' and girls' sums: " 
            + Math.abs(sumBoysAge-sumGirlsAge));
   }
}