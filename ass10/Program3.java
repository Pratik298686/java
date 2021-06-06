/*3. Write a program which accept distance in kilometre and convert it into meter. (1 kilometre = 1000 Meter) 
Input :  5 Output :  5000 
Input :  12 Output :  12000 */
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
      double iNo1 = sc1.nextFloat();
      
      double isum1 = iNo1*1000;
      
      System.out.println("Radius of the circle :"+isum1);

    }
}