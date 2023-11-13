import java.util.*; 
import java.io.*;
public class Ch2_1_proj_java
{ 
   public static void main(String[] args)
   {
      System.out.println("Project: Ch2_1_project");
      System.out.println("Name: Kerra McLeod");
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter the radius of a circle: ");
      double radius = in.nextDouble();
      final double pi = 3.14;
      double area = radius * radius * pi;
      System.out.printf("The area of the circle is %.2f.", area);
      System.out.println("");
      double circumference = radius * 2 * pi; 
      System.out.printf("The circumference of the circle is %.2f.", circumference);
   }
}