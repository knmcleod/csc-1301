import java.io.*;
import java.util.*;
public class Ch7_practice_2
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String num_str = "12";
      String num_str2 = "34";
      int num1 = Integer.parseInt(num_str); //without these two, sum would be 1234
      int num2 = Integer.parseInt(num_str2); //replace integer and int with double for doubles
      System.out.println("The sum is: " + (num1 + num2));
      
      try
      {
         double your_bal = 200;
         System.out.print("Withdraw amount? $");
         double withdraw_amount = in.nextDouble();
         if(withdraw_amount > your_bal)
         {
            throw new IllegalArgumentException("Insufficient funds.");
         }
         your_bal = your_bal - withdraw_amount;
         System.out.println("Your remaining balance: $" + your_bal);
      }
      catch(IllegalArgumentException e)
      {
         System.out.println("Insufficient funds.");
      }
      
   }
}