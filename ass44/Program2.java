/*2. Write a recursive program which display below pattern.  
Output :   1 2 3 4 5*/
import java.lang.*;
import java.util.Scanner;
class Program2
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
      if(i<=iNo1)
      {
        System.out.println(i);
        fun(i+1,iNo1);
      }
      
    }
    
}
