/******************************************************************************

java program to remove vowels using string buffer

*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class RemoveVowelUsingStringBuffer
{
    static String removeVowel(String strVowel)
    {
      Character[] vowel = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
      List<Character> li = Arrays.asList(vowel);
      StringBuffer strBuffer = new StringBuffer(strVowel);
      for(int a = 0; a < strBuffer.length(); a++)
      {
         if(!(li.contains(strBuffer.charAt(a))))
         {
            strBuffer.replace(a, a + 1, "") ;
            a--;
         }
      }
      return strBuffer.toString();
   }
   public static void main(String[] args)
   {
       Scanner obj = new Scanner(System.in);
       String k = obj.nextLine();
      System.out.println(removeVowel(k));
   }
}

