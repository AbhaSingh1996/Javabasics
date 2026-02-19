public class NestedLoopDemo {
   public static void main(String[] args) {

            // do something
             /* Printing a Pattern using nested loop
              *
              **
              ***
              ****
              *****

           */
       for (int i = 1; i<=5; i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print( "*");
           }
           System.out.println();
       }
    }
}
