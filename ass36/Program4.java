/*4. Accept sing from user and reverse the contents of that string by toggling the case. 
Input :   “aCBdef” Output :   “FEDcbA”  */

import java.lang.*;
import java.util.Scanner;
class Program4
{
   public static void main(String[] args) {
       Base bobj = new Base();
       bobj.fun();
    
   }
}
class Base
{
    public void fun()
    {
      Scanner sc1 = new Scanner(System.in);
      System.out.println("Enter first character :");
      String str1 = sc1.nextLine();
      char ch1[] = str1.toCharArray();     
      
      int isize1 = ch1.length;
      
      for(int i=isize1-1; i>=0; i--)
      {
         if(ch1[i]>='A' && ch1[i]<='Z')
         {
            ch1[i] = (char)(ch1[i]+32);
            System.out.print(ch1[i]);  
         }
         else if(ch1[i]>='a' && ch1[i]<='z')
         {
            ch1[i] = (char)(ch1[i]-32);
            System.out.print(ch1[i]);  
         }
      }
    
    }
}