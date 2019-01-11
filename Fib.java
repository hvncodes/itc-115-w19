// one
public class Fib {

   public static void main(String[] args) {
      int x = 0; // n_0
      int y = 1; // n_1
      System.out.print(x);
      for (int i = 0; i < 12; i++) {
         System.out.print(", " + y);
         int temp = x;
         x = y;
         y = temp + y;
      }
      System.out.println();
   }
}
