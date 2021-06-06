/*2.Write a program which accept number from user and print numbers till that  number. 
Input :  8  Output :  1  2  3  4  5  6  7  8  */
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
      System.out.println("obtained marks :");
      int iNo1 = sc1.nextInt();
      int isum1 = 0;
      
      for(int i=1; i<=iNo1; i++)
      {
        isum1 = isum1 + i;
        System.out.print(isum1);
        isum1 = 0;
      }

    }
}