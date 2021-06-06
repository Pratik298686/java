/*3.Write a program to find factorial of given number.  
Input :  5  Output :  120   (5 * 4 * 3 * 2 * 1) 
Input :  -5  Output :  120   (5 * 4 * 3 * 2 * 1) 
Input :  4  Output :  24   (4 * 3 * 2 * 1) */
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
      System.out.println("obtained marks :");
      int iNo1 = sc1.nextInt();
      int isum1 = 1;
      
      for(int i=1; i<=iNo1; i++)
      {
        isum1 = isum1*i;
      }
      System.out.println(+isum1);
    }
}