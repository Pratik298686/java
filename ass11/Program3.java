/*3. Write a program which accept range from user and return addition of all numbers in between that range. (Range should contains positive numbers only) 
Input :  23 30  Output :  212    
Input :  10 18 Output :  126 
Input :  -10 2 Output :  Invalid range*/
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
      System.out.println("first number :");
      int iNo1 = sc1.nextInt();
      Scanner sc2 = new Scanner(System.in);
      System.out.println("second number :");
      int iNo2 = sc2.nextInt();
      int isum1 = 0;
      for(int i=iNo1; i<=iNo2; i++)
      {
      isum1 = isum1 + i;
      }
      System.out.println(isum1);
    }
}