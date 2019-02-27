import java.util.*;

public class isSorted {
   public static void main(String[] args) {
      double[] list1 = new double[]{16.1, 12.3, 22.2, 14.4};
      double[] list2 = new double[]{1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
      double[] list3 = new double[]{46.2};
      
      System.out.println(isSorted(list1));
      System.out.println(isSorted(list2));
      System.out.println(isSorted(list3));
   }
    
   public static boolean isSorted(double[] list) {
      for (int i = 0; i < list.length-1; i++) {
         // check each entry with the next if it's properly ordered
         if (list[i] > list[i+1]) {
            return false;
         }
      }
      // all checks passed? it is sorted list.
      return true;
   }
}
