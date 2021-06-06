/*3. Write a program which accept number from user and print its numbers line.
 Input :  4  Output :  -4  -3  -2  -1  0  1  2  3  4*/
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
      
      for(int i=iNo2; i<=iNo1; i++)
      {
        isum1 = isum1 + i;
        System.out.print( isum1 );
        isum1 = 0;
      }

    }
}