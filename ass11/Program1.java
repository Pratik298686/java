/*1.Write a program which accept range from user and display all numbers in between that range. 
Input :  23 35  Output :  23 24 25 26 27 28 29 30 31 32 33 34 35   
Input :  10 18 Output :  10 11 12 13 14 15 16 17 18 
Input :  10 10 Output :  10  
Input :  -10 2 Output :  -10 -9 -8 -7 -6 -5 -4 -3 -2 -1 0 1 2 
Input :  90 18 Output :  Invalid range */
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
      Scanner sc2 = new Scanner(System.in);
      System.out.println("second number :");
      int iNo2 = sc2.nextInt();
      int isum1 = 0;
      for(int i=iNo1; i<=iNo2; i++)
      {
      
        System.out.println(i);
      }

    }
}