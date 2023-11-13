import java.io.*;
import java.util.*;
public class Ch7_practice
{
   public static void main(String[] args) throws FileNotFoundException
   {
      File score = new File("Chap_7_practice.txt"); //txt file name
      Scanner in = new Scanner(score); //reference name for Scanner when doing files
      double total = 0.00;
      double num_score = 0.00;
      while(in.hasNextDouble())
      {
         total = total + in.nextDouble();
         num_score++;
      }
      PrintWriter out = new PrintWriter("Chap_7_practice_output.txt");
      out.println("(Expecting 100) Total: " + total); //in file
      out.printf("Average is: %.2f ", (total/num_score)); //in file
      System.out.println("(Expecting 100) Total: " + total); //in console
      in.close(); //close to end, return to system 
      out.close(); // out.println closing
      
      // 
      
      File Mary = new File("Mary.txt"); 
      Scanner in2 = new Scanner(Mary);
      PrintWriter out2 = new PrintWriter("Mary_out.txt");
      while(in2.hasNext())
      {
         out2.print(in2.next()+ " ");
      }
      in2.close();
      out2.close();
   }
}
