/*5.Write a program which accept accept range from user and display all numbers in between that range in reverse order. 
Input :  23 35  Output :  35 34 33 32 31 30 29 28 27 26 25 24 23   
Input :  10 18 Output :  18 17 16 15 14 13 12 11 10 
Input :  10 10 Output :  10  
Input :  -10 2 Output :  2 1 0 -1 -2 -3 -4 -5 -6 -7 -8 -9 -10 
Input :  90 18 Output :  Invalid range */
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
      Scanner sc2 = new Scanner(System.in);
      System.out.println("second number :");
      int iNo2 = sc2.nextInt();
      int isum1 = 0;
      for(int i=iNo2; i>=iNo1; i--)
      {
      
        System.out.println(i);
      }

    }
}