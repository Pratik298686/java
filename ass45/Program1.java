/*
1. Write a recursive program which accept number from user and display below pattern.  
Input :  5 
Output :  5 * 4 * 3 * 2 * 1 *
*/
import java.lang.*;
import java.util.Scanner;
class Program1
{
   public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter Number :");
    int iNo1 = sc1.nextInt();   
    Base bobj = new Base();
       bobj.fun(iNo1);
    
   }
}
class Base
{
    public static void fun(int iNo1)
    {
      //String reverse = "";
     // int i = 1;
      if(iNo1>=1)
      {
        System.out.println(iNo1+"*");
        fun(iNo1-1);
      }
      
    }
    
}