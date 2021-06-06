/* 
4. Write a program which accepts N from user and print all odd numbers up to N. 
Input :  18  Output :  1  3  5  7  9  11  13 */
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
      
      int isum1 = 0;
      
      for(int i=1; i<=iNo1; i++)
      {
        if(i%2!=0)
        {
            System.out.println(i);   
        }
      }

    }
}