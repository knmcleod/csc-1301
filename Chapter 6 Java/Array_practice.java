import java.io.*;
import java.util.*;
public class Array_practice
{
   public static void main(String[] args)
   {
      int[] kids_ages = new int[3];
      //Option 1:
      kids_ages[0] = 4;
      kids_ages[1] = 6;
      kids_ages[2] = 7;
      System.out.println("1. The kids ages are: " + Arrays.toString(kids_ages));
      //Option 2:
      int[] boys = {4,6,7}; 
      System.out.println("2. The boys ages are: " + Arrays.toString(boys));
      System.out.println("3. Third boy's age is: " + boys[2]);
      //Option 3: changing value(boys)
      boys[1] = 5;
      System.out.println("4. The kids ages are: " + Arrays.toString(boys));
      //Walking through
      for(int i = 0; i < boys.length; i++)
      {
         System.out.println("The boys age is: " + boys[i]);
      }
      
      //enhanced for loop/for each loop
      double[] values = {4, 2, 3};
      double total = 0;
      for(double element : values)
      {
         total = total + element;
      }     
      System.out.printf("Total is: %.2f ", total);
      
      System.out.println("");
      
      double[] gpa = {3.8, 3.9};
      for(double MyGpa : gpa)
      {
         System.out.println(MyGpa);
      }
      
      double product = 1;
      double[] factors = {2, 4, 3};
      for(double f : factors)
      {
         product = product * f; // 1*2=2, 2*4=8, 8*3 = 24
      }
      System.out.println("The product is: " + product);
      
      //Max and Minimum (for loop)
      double[] num = {2, 4, 3};
      double largest = num[0];
      for(int i = 1; i < num.length; i++)
      {
         if(num[i] > largest)
         {
            largest = num[i];
         }
      }
      System.out.println("The largest is: " + largest);
      
      double smallest = num[0];
      for(int i = 1; i > num.length; i++)
      {
         if(num[i] < smallest)
         {
            smallest = num[i];
         }
      }
      System.out.println("The smallest is: " + smallest);
      
      //Swapping variable 
      double[] swap = {2,4,3,6}; // put 6 where 4 is
      System.out.println("Array was: " + Arrays.toString(swap));
      double temp = swap[1];
      swap[1] = swap[3];
      swap[3] = temp;
      System.out.println("Array is now: " + Arrays.toString(swap));
      
      
      /* //Growing Array
      double[] values = new double[6];
      // Fill array
      double[] newValues = Arrays.copyOf(values, 2 * values.length);
      values = newValues;
      */
      
      //Reading input: input of numbers, stop with non-digit
      Scanner in = new Scanner(System.in);
      final int max_inputs = 10;
      double[] inputs = new double[max_inputs];
      int currentSize = 0;
      System.out.print("Please enter a digit, press Q to quit: ");
      while(in.hasNextDouble() && currentSize < inputs.length)
      {
         inputs[currentSize] = in.nextDouble();
         currentSize++;
      }
      System.out.println("Inputs: " + Arrays.toString(inputs));
      
      //Two Dimensional Array
      int[][] testscore = {
                           {50,80},
                           {70,90},
                           {100,60}
                           };
      add_bonus_2d(testscore, 5);
      System.out.println("First, First score is: " + testscore[0][0]);
      //Or this: for all
      System.out.println("All scores: " + Arrays.deepToString(testscore));
      
      //Method and Array
      double[] scores = {90, 10, 100};
      sum_array(scores);
      System.out.println("The sum of the scores is: " + sum_array(scores));
      
      final int INITIAL_VALUE = 10;
      int[] my_array = build_array(INITIAL_VALUE);
      System.out.println("Build Array is: " + Arrays.toString(my_array));
      
      int[] value1 = {5, -2, 6, -1, 9};
      System.out.println("The number of positive number is: " + count_positive(value1));
      
      //ArrayList
      ArrayList<String> emp_names = new ArrayList<String>();
      emp_names.add("John");
      emp_names.add("Kim");
      emp_names.add("Peter");
      emp_names.set(1, "Kimmy"); // 1 is index of place to set
      
      System.out.println("The second employee is: " + emp_names.get(1));
      System.out.println("All the employees: " + emp_names);
      reverse_it(emp_names);
   }
   //Method and Array
   public static void reverse_it(ArrayList<String> names)
   {
      for(int i = names.size() - 1; i >=0; i--)
      {
         System.out.println("Reverse: " + names.get(i));
      }
   }
   public static void add_bonus_2d(int[][] testscore, int bonus)
   {
      for(int row = 0; row < 3; row++)
      {
         for(int col = 0; col < 2; col++)
         {
            testscore[row][col] = testscore[row][col] + bonus;
         }
      }
   }
   public static double sum_array(double[] score_ary)
   {
      double total = 0;
      for(double element : score_ary)
      {
         total = total + element;
      }
      return total;
   }
   
   public static int[] build_array(int initial_value)
   {
      int[] new_array = new int[3];
      for(int i = 0; i < new_array.length; i++)
      {
         new_array[i] = initial_value;
      }
      return new_array;
   }
   
   public static int count_positive(int[] value1)
   {
      int positive_count = 0;
      for(int element : value1)
      {
         if(element > 0)
         {
            positive_count++;
         }
      }
      return positive_count;
   }
}