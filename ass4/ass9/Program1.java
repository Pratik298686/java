/* 1.Write a program which accept number from user and print that number of $ & * on screen.  
Input :  5 Output :  $ * $ * $ * $ * $ * 
Input :  3 Output :  $ * $ * $ * 
Input :  -3 Output :  $ * $ * $ **/
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
      System.out.println("obtained marks :");
      int iNo1 = sc1.nextInt();
      int isum1 = 1;
      
      for(int i=1; i<=iNo1; i++)
      {
        System.out.print("$ *");
      }

    }
}