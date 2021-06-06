/*2. Write a program which accept string from user and count number of small characters. 
Input :   “Marvellous” 
Output :   9  */
import java.lang.*;
import java.util.Scanner;
class Program2
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
          if(ch[i]>='a' && ch[i]<='z')
          {
          isum1++; 
          }
      }
      System.out.println(isum1);  
    }
}