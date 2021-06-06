/*2. Write a program which accept width & height of rectangle from user and calculate its area. (Area = Width * Height) 
Input :  5.3  9.78 Output :  51.834*/

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
      System.out.println("first number :");
      double iNo1 = sc1.nextFloat();
      Scanner sc2 = new Scanner(System.in);
      System.out.println("second number :");
      double iNo2 = sc2.nextFloat();
      
      double isum1 = iNo1*iNo2;
      
      System.out.println("Radius of the circle :"+isum1);

    }
}