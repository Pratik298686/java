/*
3.Write a recursive program which display below pattern.  
Output :   5 4 3 2 1 
*/
import java.lang.*;
import java.util.Scanner;
class Program3
{
   public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter Number :");
    int iNo1 = sc1.nextInt();   
    Base bobj = new Base();
       bobj.fun(1,iNo1);
    
   }
}
class Base
{
    public static void fun(int i,int iNo1)
    {
      //String reverse = "";
     // int i = 1;
      if(iNo1>=i)
      {
        System.out.println(iNo1);
        fun(i,iNo1-1);
      }
      
    }
    
}