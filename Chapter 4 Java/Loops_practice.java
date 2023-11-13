import java.io.*;
import java.util.*;
public class Loops_practice
{ 
   public static void main(String [] args)
   {
      Scanner in = new Scanner(System.in);
      //while
      int count_print_hello = 0;
      while(count_print_hello <= 3)
      {
         System.out.println("Hello!");
         count_print_hello++;
      }
      
      System.out.println("");
      
      //for 
      for(int i = 0; i <= 3; i++)
      {
         System.out.println("Hello.");   
      }
      
      System.out.println("");
      
      int my_total = 0;
      for(int k = 1; k <= 3; k++)
      {
         my_total = my_total + k;
      }
      System.out.println("Expected 6: My total is " + my_total);
      
      System.out.println("");
      
      int myTotal = 0;
      for(int n = 5; n <= 15; n = n + 5)
      {
         myTotal = myTotal + n;
      }
      System.out.println("Expected 30: My total is " + myTotal);
      
      System.out.println("");
      
      //do
      int counter = 1;
      do
      {
         System.out.println("Hi!");
         counter++;
      }
      while(counter <= 3);
      
      System.out.println("");
      
      int sum = 0;
      int my_counter = 1;
      do
      {
         sum = sum + my_counter;
         my_counter = my_counter + 1;
      }
      while(my_counter <= 3);
      System.out.println("Expected 6: My sum is " + sum);
      
      System.out.println("");
      
      //Sentinel Value
      int input = 0;
      int your_sum = 0;
      int number_count = 0;
      System.out.print("Enter a number, use -1 to quit: ");
      input = in.nextInt();
      while(input != -1)
      {
         your_sum = your_sum + input;
         number_count++;
         System.out.print("Enter a number, use -1 to quit: ");
         input = in.nextInt();
         
      }
      System.out.println("Sentienl: Your sum is " + your_sum);
      System.out.println("Sentienl: Your average is " + ((double)your_sum / (double)number_count));
      
      System.out.println("");
      
      //Boolean Variable (Flag variable) rewritten 68-82
      int input1 = 0;
      int sum1 = 0;
      int count = 0;
      boolean done = false;
      while(!done)
      {
         sum1 = sum1 + input1;
         count++;
         System.out.print("Enter a number, use -1 to quit: ");
         input1 = in.nextInt();
         if(input1 == -1)
         {
            done = true;
         }
      }
      System.out.println("Boolean: Your sum is " + sum1);
      System.out.println("Boolean: Your average is " + ((double)sum1 / (double)count));
      
      System.out.println("");
      
      //Counting Matches: Counting uppercase
      String str = "abDEF";
      int upperCaseLetters = 0;
      for(int i = 0; i < str.length(); i++)
      {
         char ch = str.charAt(i);
         if(Character.isUpperCase(ch))
         {
            upperCaseLetters++;
         }
      }
      System.out.println("Number of upper case letters is " + upperCaseLetters);
      
      System.out.println("");
      
      // 3 rows, 5 each
      for(int row = 0; row < 3; row++ )
      {
         for(int col = 0; col < 5; col++)
         {
            System.out.print("*");
         }
         System.out.println("");
      }
      
      
      
   }
}