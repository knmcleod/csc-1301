import java.io.*;
import java.util.*;
public class If_else_practice
{
   public static void main(String[] args)
   {
      int qty_shoes = 5;
      double price_shoes = 0.00;
      if(qty_shoes >= 5){
         price_shoes = 15.00; 
      }
      else {
         price_shoes = 17.00;
      }
      System.out.println("The price of shoes is $" + price_shoes);
      
      // can do if/else statement in one line (shortcut)
      price_shoes = qty_shoes >= 5 ? 15.00 : 17.00;
      System.out.println("The price of shoes is $" + price_shoes);
      
      
   
      Scanner in = new Scanner(System.in);
      System.out.print("Enter price: ");
      int original_price = in.nextInt();
      int discounted_price;
      if (original_price > 100)
      { 
         discounted_price = original_price - 20;
      }
      else 
      {
         discounted_price = original_price - 5;
      }
      System.out.println("Your price is: " + discounted_price);
      
      
      //Comparing Strings
      String my_name = "Kerra";
      System.out.print("Please enter your name: ");
      String your_name = in.next();
      if(my_name.equals(your_name))
      {
         System.out.println("Our names are the same!");
      }
      else 
      {
         System.out.println("We don't have the same name...");
      }
      
      System.out.println("Enter Y to quit.");
      String input = in.next();
      if(input.equals("Y"))
      { 
         System.out.println("Goodbye!");
      }
      else 
      {
         System.out.println("Thank you for staying!");
      }
      
      // Grading
      System.out.println("Please enter your score: ");
      int score = in.nextInt();
      if(score >= 90)
      { 
         System.out.println("You got an A!");
      }
      else if(score>= 80)
      {
         System.out.println("You got a B!");
      }
      else if(score < 0)
      { 
         System.out.println("Error: no negatives. Please enter positive score.");
      }
      else
      { 
         System.out.println("You failed.");
      }
   
      //Boolean
      System.out.println("Is your homework done?");
      boolean is_homework_done = false;
      if(is_homework_done == true)
      {
         System.out.println("Good job!");
      }
      else
      {
         System.out.println("Go do your homework!");
      }
      
   }
   
}