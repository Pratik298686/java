/*3. Write a program which 2 strings from user and check whether first N contents of two strings are equal or not. (Implement strcmp() function). Note : If third parameter is greater than the size of second string then concat whole string after first string. 
Input :   “Marvellous Infosystems”    “Marvellous Logic Building”    10 
Output :  TRUE */

import java.lang.*;
import java.util.Scanner;
class Program3
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
     
      Scanner sc2 = new Scanner(System.in);
      System.out.println("Enter second character :");
      String str2 = sc2.nextLine();
      char ch2[] = str2.toCharArray();    
      
      int isize1 = ch1.length;
      int isize2 = ch2.length;
      int iCnt = 10;
      boolean b1 = true;
      boolean b2 = false;
     
      //char ch3[] = new char[isize1+isize2];

      int i=0,j=0;
      while(i!=isize1 && iCnt!=0)
      {
        if(ch1[i] != ch2[i] )
        {
            System.out.print(b2); 
            break; 
        }  
        i++;
        iCnt--;
      }
     
      System.out.print(b1);
    
    }
}