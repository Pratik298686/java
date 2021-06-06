/*
5. Write a program which accept N and print first 5 multiples of N.  
Input :  4  Output :  4  8  12  16  20 */
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
      System.out.println("first number :");
      int iNo1 = sc1.nextInt();
      
      int isum1 = 0;
      
      for(int i=1; i<=iNo1; i++)
      {
         iNo1 = iNo1*i;
         System.out.println(iNo1);
         iNo1 = 4;
      }

    }
}