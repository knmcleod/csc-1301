import java.io.*;
import java.util.*;
public class Ch4_1_proj_java
{
   public static void main(String[] args)
   {
      System.out.println("Project: Ch4_1_proj");
      System.out.println("Name: Kerra McLeod");
      System.out.println("Purpose: To count the number of vowels in a word.");
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a word: ");
      if(!in.hasNextDouble())
      {
         int vowels = 0;
         String str = in.next();
         for(int i = 0; i < str.length(); i++)
         {
            if(str.charAt(i)== 'a' || 
               str.charAt(i)== 'e' || 
               str.charAt(i)== 'i' || 
               str.charAt(i)== 'o' || 
               str.charAt(i)== 'u' || 
               str.charAt(i)== 'y' ||
               str.charAt(i)== 'A' ||
               str.charAt(i)== 'E' ||
               str.charAt(i)== 'I' ||
               str.charAt(i)== 'O' ||
               str.charAt(i)== 'U' ||
               str.charAt(i)== 'Y')
            {
               vowels++;
            }
         }
         System.out.println("Number of vowels in " + str + " is " + vowels + ".");
      }
      else 
      {
         System.out.println("Error: Number entered. Please enter a word.");
      }
   }
}