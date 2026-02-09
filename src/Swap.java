import java.util.Scanner;

public class Swap {
   public static void main(String[] args) {

//       int num1 = 23;
//       int num2 = 30;
//       int num3;
//       num3=num1;
//       num1=num2;
//       num2=num3;
//       System.out.println();


               Scanner sc = new Scanner(System.in);

               ////--------------
               // Taki ng input
               System.out.print("Enter first number (num1): ");
               int num1 = sc.nextInt();
               System.out.print("Enter second number (num2): ");
               int num2 = sc.nextInt();

               System.out.println("\n--- Starting the Swap ---");
               System.out.println("Initially: num1 = " + num1 + ", num2 = " + num2);

               // Step 1: Store num1 in the temporary variable
               int num3 = num1;
               System.out.println("Step 1: Copied num1 to num3. Now num3 = " + num3);

               // Step 2: Copy num2 into num1
               num1 = num2;
               System.out.println("Step 2: Copied num2 to num1. Now num1 = " + num1);

               // Step 3: Copy num3 (the original num1) into num2
               num2 = num3;
               System.out.println("Step 3: Copied num3 back to num2. Now num2 = " + num2);

               System.out.println("\n--- Final Result ---");
               System.out.println("Final Values: num1 = " + num1 + ", num2 = " + num2);

               sc.close();
           }
       }


