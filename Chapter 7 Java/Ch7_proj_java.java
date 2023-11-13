import java.io.*;
import java.util.*;
public class Ch7_proj_java
{
   public static void main(String[] args) throws FileNotFoundException
   {
      System.out.println("Project: Ch7_proj");
      System.out.println("Name: Kerra McLeod");
      System.out.println("Purpose: Open a file, write a message in the file then print the message.");
      
      Scanner in = new Scanner(System.in);
      System.out.print("Enter an input file name: ");
      String input = in.next();
      File input_file = new File(input);
      
      PrintWriter out = new PrintWriter(input_file);
      String message = "Hello, World!";
      out.println(message);    
      System.out.println(message);
      
      in.close();
      out.close();
   }
}