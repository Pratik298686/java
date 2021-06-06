/*1. Write a program which accept number from user and if number is less than 50 then print small , if it is greater than 50 and less than 100 then print medium, if it is greater than 100 then print large. */
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
      
      if(iNo1<=50)
      {
        System.out.println("small");   
      }
      else if(iNo1>=50 && iNo1<=100)
      {
        System.out.println("medium");   
      }
      else if(iNo1>=100)
      {
        System.out.println("large");   
      }
    }
}