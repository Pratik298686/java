/*3. Write a program which accept two numbers and check whether numbers are equal or not.  
 
Input : 10 10    Output : Equal    
Input : 10 12    Output : Not Equal   
Input : 10 -10    Output : Not Equal */
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
      System.out.println("Enter the first number :");
      int iNo1 = sc1.nextInt();
      Scanner sc2 = new Scanner(System.in);
      System.out.println("Enter the second number :");
      int iNo2 = sc2.nextInt();
      
      if(iNo1==iNo2)
      {
        System.out.println("Equal");
      }
      else{
        System.out.println("Not Equal");   
      }   
    }
}