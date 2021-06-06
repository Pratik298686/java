/*1. Accept number from user and display below pattern. 
Input :  5  
Output : A B C D E  */
import java.lang.*;
import java.util.Scanner;
class Program1
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

      int isum1 = 1,isum2 =1;
      for(int i=1; i<=iNo1; i++)
      {
      switch(i)
      {
          case 1:
          System.out.println("A"); 
          break;
          case 2:
          System.out.println("B");
          break; 
          case 3:
          System.out.println("C"); 
          break;
          case 4:
          System.out.println("D");
          break; 
          case 5:
          System.out.println("E");
          break; 
      }
      }

    }
}