/*2. Write a program which accept range from user and display all even numbers in between that range. 
Input :  23 35 
Output :  24 26 28 30 32 34    
Input :  10 18 Output :  10 12 14 16 18 
Input :  10 10 Output :  10  
Input :  -10 2 Output :  -10 -8 -6 -4 -2 0 2 
Input :  90 18 Output :  Invalid range*/
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
      System.out.println("first number :");
      int iNo1 = sc1.nextInt();
      Scanner sc2 = new Scanner(System.in);
      System.out.println("second number :");
      int iNo2 = sc2.nextInt();
      int isum1 = 0;
      for(int i=iNo1; i<=iNo2; i++)
      {
      if(i%2==0)
      {
        System.out.println(i);
      }
      }

    }
}