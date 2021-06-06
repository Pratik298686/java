/*1.Write a program which accept radius of circle from user and calculate its area. Consider value of PI as 3.14. (Area = PI * Radius * Radius) 
Input :  5.3  Output :  88.2026   
Input :  10.4  Output :  339.6224  
*/
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
      double iNo1 = sc1.nextFloat();
      
      double isum1 = Math.PI*iNo1*iNo1;
      
      System.out.println("Radius of the circle :"+isum1);

    }
}