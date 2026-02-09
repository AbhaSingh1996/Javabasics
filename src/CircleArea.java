import java.util.Scanner;

public class CircleArea {

   public static void main(String[] args) {
      double pie =3.14;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the radius of the circle");
       double radius = input.nextDouble();
       double area = pie*radius*radius;
       System.out.println(area );
       System.out.println("For a radius of " + radius + ", the area is: " + area);

    }
}

