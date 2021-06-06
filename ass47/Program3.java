/*3. Write a recursive program which accept string from user and count number
of small characters.
Input : HElloWOrlD
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
    int iret = bobj.fun(ch1,i);
    System.out.println(iret);
   }
}
class Base
{
   static int isum = 0;
    public static int fun(char ch1[],int i)
    { 
      if(i<ch1.length)
      {
       if(ch1[i]>='a' && ch1[i]<='z')
       {
           isum++;
       }
       fun(ch1,i+1);
      }
      return isum;
    }
}