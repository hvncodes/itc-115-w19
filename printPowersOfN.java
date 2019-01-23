public class printPowersOfN {

   public static void main(String[] args) {
      printPowersOfN(2, 7);
      printPowersOfN(5, 3);
   }
   
   public static void printPowersOfN(int x, int n) {
      for (int i = 0; i <= n; i++) {
         // Math.pow(x, n) x^n returns double
         System.out.print((int)Math.pow(x, i) + " ");
      }
      System.out.println();
   }
}