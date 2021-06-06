/*3.Write a program to find even factorial of given number.  
Input :  5  Output :  8   (4 * 2) 
Input :  -5  Output :  8   (4 * 2) 
Input :  10  Output :  3840  (10 * 8 * 6 * 4 * 2)*/
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

      int isum1 = 0;
      for(int i=1; i<=iNo1; i++)
      {
      
        if(i%2==0)
        {
            System.out.println(i);   
        }
      }

    }
}