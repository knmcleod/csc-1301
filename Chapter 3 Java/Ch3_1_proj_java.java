import java.io.*; 
import java.util.*;
public class Ch3_1_proj_java
{ 
   public static void main(String[] args)
   {  
      System.out.println("Project: Ch3_1_proj");
      System.out.println("Name: Kerra McLeod");
      System.out.println("Purpose: Determine whether an integer is positive, zero, or negative.");
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter an integer: ");
      if(in.hasNextInt())
      { 
         int input = in.nextInt();
         if(input > 0)
         { 
            System.out.println("Your integer is positive.");
         }
         else if(input < 0)
         {
            System.out.println("Your integer is negative.");
         }
         else if(input == 0)
         {
            System.out.println("Your integer is zero.");
         }
      }
      else
      {
         System.out.print("Error: Please enter a valid integer.");
      }
   }
}