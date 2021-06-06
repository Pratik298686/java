/*1.Write a program which accept number from user and display below pattern. 
Input :  5  Output :  * * * * * # # # # #   
Input :  6 Output :  * * * * * * # # # # # # #   
Input :  -5  Output :  * * * * * # # # # #   
Input :  2 Output :  * * # # */
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
      System.out.println("first number :");
      int iNo1 = sc1.nextInt();

      int isum1 = 0;
      for(int i=1; i<=iNo1; i++)
      {
      
        System.out.println("*");
      }
      for(int i=1; i<=iNo1; i++)
      {
      
        System.out.println("#");
      }

    }
}