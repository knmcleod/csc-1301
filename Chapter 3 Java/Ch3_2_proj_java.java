import java.io.*;
import java.util.*;
public class Ch3_2_proj_java
{
   public static void main(String[] args)
   {
      System.out.println("Project: Ch3_2_proj");
      System.out.println("Name: Kerra McLeod");
      System.out.println("Purpose: To determine BMI in weight status.");
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter your BMI: ");
      if(in.hasNextInt())
      {
         int BMI = in.nextInt();
         if(BMI <= 0)
         {
            System.out.println("Error: BMI can not be negative, please enter a valid BMI value.");
         }
         else if(BMI >= 30)
         { 
            System.out.println("Your weight status is obese.");
         }
         else if(BMI >= 25)
         { 
            System.out.println("Your weight status is overweight.");
         }
         else if(BMI >= 18)
         {
            System.out.println("Your weight status is healthy.");
         }
         else if(BMI < 18)
         { 
            System.out.println("Your weight status is underweight.");
         }
      }
      else 
      {
         System.out.println("Error: Please enter a valid BMI value.");
      }
   }
}