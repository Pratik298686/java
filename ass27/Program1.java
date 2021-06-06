/*1.Write a program which accept string from user and count number of capital characters. 
Input :   “Marvellous Multi OS” 
Output :   4*/
import java.lang.*;
import java.util.Scanner;
class Program1
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
      System.out.println("Enter character :");
      String str = sc1.nextLine();
      char ch[] = str.toCharArray();
      int isum1 = 0;
      for(int i=0; i<ch.length; i++)
      {
          if(ch[i]>='A' && ch[i]<='Z')
          {
          isum1++; 
          }
      }
      System.out.println(isum1);  
    }
}