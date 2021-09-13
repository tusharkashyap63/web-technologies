import java.util.Scanner;

public class SortStrings {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
       System.out.println("Enter String");
       String str = sc.next();
       sc.close();
       
      int j = 0;
      char temp = 0;
      char[] chars = str.toCharArray();
      for(int i=0; i < chars.length; i++) {
         for(j=0; j < chars.length; j++) {
            if(chars[j] > chars[i]) {
               temp = chars[i];
               chars[i] = chars[j];
               chars[j] = temp;
            }
         }
      }
      
      String finalStr = new String(chars);
      System.out.println(finalStr);

   }
}