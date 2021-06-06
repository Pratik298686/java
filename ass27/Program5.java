/*3. Write a program which accept string from user and display it inn reverse order. 
Input :   “MarvellouS” 
Output :   “SuollevraM”*/
import java.lang.*;
import java.util.Scanner;
class Program5
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
      for(int i=ch.length-1; i>=0; i--)
      {
        System.out.print(ch[i]);  
      }
    }
}