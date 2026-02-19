public class DemoFor {
   public static void main(String[] args) {
       // 1 to 10

        for(int i = 1; i<=10; i++) // increment
            System.out.println(i);

        /*
            Flow of control of For
            1. First assignment statement is executed (Variable definition)
            2. Then second conditional is evaluated . (True/ False)
            3. If true, control flow will evaluate the body of the loop.
            4 once loop body is finished, control flow will go back to the for statement, and third increment
             statement will be evaluated.
            5. Apply, conditional statement  is evaluated.
            6. Repeat 2 - 5.

         */

       for(int i = 10; i>=1; i--) // decrement
           System.out.println(i);
    }
}
