import java.io.*;
import java.util.*;
public class Ch5_proj_java
{
   public static void main(String[] args)
   {
      System.out.println("Project: Ch5_proj_java");
      System.out.println("Name: Kerra McLeod");
      System.out.println("Purpose: To determine how many words, vowels, and digits are in a sentence.");
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter a sentence: ");
      String sentence = in.nextLine();
      int count_words = countWords(sentence);
      int count_vowels = countVowels(sentence);
      int count_digits = countDigits(sentence);
      System.out.println("The total number of words is: " + count_words);
      System.out.println("The total number of vowels is: " + count_vowels);
      System.out.println("The total number of digits is: " + count_digits);
   }
   
   /**
   Method Name: countWords, checks for number of words in the given sentence.
   @param: sentence, sentence given by user.
   @return: the count of words from the sentence.
   */
   public static int countWords(String sentence)
   { 
      int count = 0;
      for(int i = 0; i < sentence.length(); i++)
      {
         if(sentence.charAt(i) == ' ')
         {
            count++;
         }
      }
      return count + 1;
   }
   
   /**
   Method Name: countVowels, checks for vowels in the given sentence.
   @param: sentence, sentence given by user.
   @return: the count of vowels from the sentence.
   */
   public static int countVowels(String sentence)
   {  
      int count = 0;
      for(int i = 0; i < sentence.length(); i++)
      {
         if(sentence.charAt(i) == 'a' ||
            sentence.charAt(i) == 'e' ||
            sentence.charAt(i) == 'i' ||
            sentence.charAt(i) == 'o' ||
            sentence.charAt(i) == 'u' ||
            sentence.charAt(i) == 'A' ||
            sentence.charAt(i) == 'E' ||
            sentence.charAt(i) == 'I' ||
            sentence.charAt(i) == 'O' ||
            sentence.charAt(i) == 'U')
         
         {
            count++;
         }   
      }
      return count;
   }
   
   /**
   Method Name: countDigits, checks for digits in the given sentence.
   @param: sentence, sentence given by user.
   @return: the count of digits from the sentence.
   */
   public static int countDigits(String sentence)
   {
      int count = 0;
      for(int i = 0; i < sentence.length(); i++)
      {
         if(sentence.charAt(i) == '0' ||
            sentence.charAt(i) == '1' ||
            sentence.charAt(i) == '2' ||
            sentence.charAt(i) == '3' ||
            sentence.charAt(i) == '4' ||
            sentence.charAt(i) == '5' ||
            sentence.charAt(i) == '6' ||
            sentence.charAt(i) == '7' ||
            sentence.charAt(i) == '8' ||
            sentence.charAt(i) == '9')
         {
            count++;
         }   
      }
      return count;
   }
}