/*2. Accept amount in US dollar and return its corresponding value in Indian currency. Consider 1$ as 70 rupees.  
Input :  10 Output :  700
Input :  3 Output :  270  
Input :  1200 Output :  84000*/
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

      int isum1 = 0;
      isum1 = iNo1*70;
      System.out.println(isum1);
    }
}