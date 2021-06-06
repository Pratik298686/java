/*3. Write a program which accept string from user and return difference between frequency of small characters and frequency of capital characters. 
Input :   “MarvellouS” 
Output :   6 (8-2) */
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
      System.out.println("Enter character :");
      String str = sc1.nextLine();
      char ch[] = str.toCharArray();
      int isum1 = 0,isum2=0;
      for(int i=0; i<ch.length; i++)
      {
          if(ch[i]>='A' && ch[i]<='Z')
          {
          isum1++; 
          }
          else if(ch[i]>='a' && ch[i]<='z')
          {
          isum2++; 
          }
      }
      System.out.println(+(isum1-isum2));  
    }
}