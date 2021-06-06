/*5. Write a program which accept number from user and display its table in reverse order.  
Input :  2 Output :  20 18 16 14 12 10 8 6 4 2 
Input :  5 Output :  50 45 40 35 30 25 20 15 10 5 
Input :  -5 Output :  50 45 40 35 30 25 20 15 10 5  */
import java.lang.*;
import java.util.Scanner;
class Program5
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
      
      for(int i=10; i>=1; i--)
      {
        iNo1 = iNo1*i;
        System.out.println(+iNo1);
        iNo1 = 2;
      }

    }
}