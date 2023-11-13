import java.util.*; // Includes all library classes under util
import java.io.*; // Input/Output classes 
public class Chapter_2_practice
{
   public static void main(String[] args)
   {
      String myName = "Kerra";
      String major = "Computer Science";
     // int = Integer 
      int age = 17;
     // Double used for decimal places
      double gpa = 3.8; 
     // final is used for constants
      final double pie = 3.14;
     
     
      int how_many = 2;
      double price = 5.0;
      System.out.print("Total: ");
      System.out.println(how_many*price);
     
     
      int counter = 1;
      counter = counter + 1;
      System.out.println("Counter is: " + counter);
     
     
      int x = 7/4;
      System.out.println("Your Quotient is: " + x);
      int y = 7%4;
      System.out.println("Your Remainder is: " + y);
     
     
      int a = 5, b = 2;
      int larger = Math.max(a,b);
      System.out.println("Larger is: " + larger);
     
     
      double balence = 20.25;
      int total = (int) balence;
      System.out.println("Your rounded balance is: " + total); 
     
     
      Scanner in = new Scanner(System.in);
      System.out.print("Enter your birth year: ");
      int birth_year = in.nextInt();
      System.out.println("Your birth year is " + birth_year);
    
     
      double cents = .985423;
      System.out.printf("Your change is %.3f", cents);
      
      System.out.println("");
      
      String name = "Kerra";
      int size = name.length();
      System.out.println("Length of name is: " + size);
      
      
      String fName = "Kerra";
      String lName = "McLeod";
      String full_name = fName + " " + lName;
      System.out.println("My full name is " + full_name);
      
      
      String c = "Agent";
      int n = 007;
      String name_bond = c + n;
      System.out.println("I am " + name_bond);
      
      
      System.out.println("Hello,\nGood Morning"); // Escape sequence
     
     
   }
}