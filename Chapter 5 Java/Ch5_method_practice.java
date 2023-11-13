public class Ch5_method_practice
{
   public static void main(String[] args)
   {
      int x = 2, y = 4;
      int sum = sum_it(x,y);
      System.out.println("Sum is: " + sum); 
      int product = product_it(x, y); 
      System.out.println("Product is: " + product);
   }
   /**
   */
   public static int product_it(int x,int y)
   {
      return x * y;
   }
   /**
   method name sum_it
   @param x and y
   @return sum of x and y
   */
   public static int sum_it(int x,int y)
   {
     return x + y; 
   }
}