/*4. Write a program which accept temperature in Fahrenheit and convert it into celsius. (1 celsius = (Fahrenheit -32) * (5/9)) 
Input :  10 Output :  -12.2222 (10 - 32) * (5/9) 
Input :  34 Output :  1.11111 (34 - 32) * (5/9)*/
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
      float iNo1 = sc1.nextFloat();
      
      float isum1 = (iNo1-32)*(5/9);
      
      System.out.println("Radius of the circle :"+isum1);

    }
}