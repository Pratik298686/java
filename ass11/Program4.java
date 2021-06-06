/*4.Write a program which accept range from user and return addition of all even numbers in between that range. (Range should contains positive numbers only) 
Input :  23 30  Output :  108    
Input :  10 18 Output :  70 
Input :  -10 2 Output :  Invalid range 
Input :  90 18 Output :  Invalid range */
import java.lang.*;
import java.util.Scanner;
class Program4
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
        isum1 = isum1 +i;
      }
      System.out.println(isum1);
      }

    }
}