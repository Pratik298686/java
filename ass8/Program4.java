/*
4.Write a program which accept number from user and display its table.  
Input :  2
Output :  2 4 6 8 10 12 14 16 18 20 
Input :  5 Output :  5 10 15 20 25 30 35 40 45 50 
Input :  -5 Output :  5 10 15 20 25 30 35 40 45 50 */
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
      System.out.println("obtained marks :");
      int iNo1 = sc1.nextInt();
      int isum1 = 1;
      
      for(int i=1; i<=10; i++)
      {
        iNo1 = iNo1*i;
        System.out.println(+iNo1);
        iNo1 = 2;
      }

    }
}