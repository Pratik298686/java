/* 5. Write a program which accept area in square feet and convert it into square meter. (1 square feet = 0.0929 Square meter) 
Input :  5 Output :  0.464515 
Input :  7 Output :  0.650321*/
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
      System.out.println("first number :");
      double iNo1 = sc1.nextFloat();
      
      double isum1 = iNo1*0.0929;
      
      System.out.println("Radius of the circle :"+isum1);

    }
}