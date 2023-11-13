import java.util.*; 
import java.io.*;
public class Ch2_2_proj_java
{
   public static void main(String[] args)
   {
      System.out.println("Project: Ch2_2_project");
      System.out.println("Name: Kerra McLeod");
      System.out.println("To compute the cost of a road trip...");
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter the mpg of the car: ");
      double mpg = in.nextDouble();
      System.out.print("Please enter the price of gas per gallon: ");
      double gas_price = in.nextDouble();
      System.out.print("Please enter road trip distance in miles: ");
      double distance = in.nextDouble();
      double calculation = distance / mpg * gas_price;
      System.out.printf("It will cost you $%.3f for this trip.", calculation);
   }
}