/*1. Write a recursive program which accept string from user and count white
spaces.
Input : HE llo WOr lD
Output : 3 */
import java.lang.*;
import java.util.Scanner;
class Program1
{
   public static void main(String[] args) {
    String reverse = "";
      Scanner sc1 = new Scanner(System.in);
      System.out.println("Enter first character :");
      String str1 = sc1.nextLine();
      //int isize1 = ch1.length;  
      int i=0;   
    Base bobj = new Base();
    int iret = bobj.fun(str1,i);
    System.out.println(iret);
    
   }
}
class Base
{
    public static int fun(char str1[],int i)
    { 
      int isum = 1;
        if(i<str1.length)
      {
        char ch1 = str1.charAt(i);   
        if(ch1=='')
        {
            isum++;
        }
        fun(str1,i+1);

      }
      return isum;
      
    }
    
}