/*3. Write a recursive program which accept string from user and count number
of characters.
Input : Hello
Output : 5 */
import java.lang.*;
import java.util.Scanner;
class Program3
{
   public static void main(String[] args) {
    String reverse = "";
      Scanner sc1 = new Scanner(System.in);
      System.out.println("Enter first character :");
      String str1 = sc1.nextLine();
      char ch1[] = str1.toCharArray();   
      //int isize1 = ch1.length;  
      int i=0;   
    Base bobj = new Base();
    bobj.fun(ch1,i);
    
   }
}
class Base
{
    public static void fun(char ch1[],int i)
    { 
      if(i<ch1.length)
      {
       // System.out.println(i);
        fun(ch1,i+1);
        System.out.println(i);
      }
      
    }
    
}