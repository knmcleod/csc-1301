import java.io.*;
import java.util.*;
public class Ch6_proj_java
{
   public static void main(String[] args)
   {
      System.out.println("Project: Ch6_proj_java");
      System.out.println("Name: Kerra McLeod");
      System.out.println("Purpose: To print 10 random integers in an array in 5 different ways.");
      int[] list_ary = new int[10];
      createRandomArray(list_ary);
      printAll(list_ary);
      printElementAtEvenIndex(list_ary);
      printEvenElement(list_ary);
      printAllReverse(list_ary);
      printFirstLast(list_ary);
   }   
   /**
   Creates a random set of numbers
   @param list_ary empty array with a size of 10 
   */
   public static void createRandomArray(int[] list_ary)
   {
      for(int i = 0; i < 10; i++)
      {
         list_ary[i] = (int)(Math.random()*10);
      }
   }
   /**
   Prints all numbers in the array
   @param list_ary array of 10 numbers
   */
   public static void printAll(int[] list_ary)
   {
      System.out.print("1. All elements: ");
      for(int i = 0; i < list_ary.length; i++)
      {
         System.out.print(list_ary[i] + " ");
      }
   }
   /**
   Prints all numbers at even index 
   @param list_ary array of 10 numbers
   */
   public static void printElementAtEvenIndex(int[] list_ary)
   {
      System.out.println("");
      System.out.print("2. All elements at an even index: ");
      for(int i = 0; i < list_ary.length; i= i + 2)
      {
         System.out.print(list_ary[i] + " ");
      }
   }
   /**
   Prints all even numbers
   @param list_ary array of 10 numbers
   */
   public static void printEvenElement(int[] list_ary)
   {
      System.out.println("");
      System.out.print("3. All even elements: ");
      for(int i = 0; i < list_ary.length; i++)
      {
         if(list_ary[i] % 2 == 0)
         {
         System.out.print(list_ary[i] + " ");
         }
      }
   }
   /**
   Prints all numbers in reverse
   @param list_ary array of 10 numbers
   */
   public static void printAllReverse(int[] list_ary)
   {
      System.out.println("");
      System.out.print("4. All elements in reverse order: ");
      for (int i = list_ary.length - 1; i >= 0; i--) 
      { 
         System.out.print(list_ary[i]+ " ");
      }
   }
   /**
   Prints first and last numbers in the array
   @param list_ary array of 10 numbers
   */
   public static void printFirstLast(int[] list_ary)
   {
      System.out.println("");
      System.out.print("5. The first and last element, respectively: ");
      System.out.print(list_ary[0] + " " + list_ary[list_ary.length-1]);

   }
   
}