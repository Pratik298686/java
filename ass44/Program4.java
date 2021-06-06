/*
4.Write a recursive program which display below pattern.  
Output :   A B C D E F
*/
import java.lang.*;
import java.util.Scanner;
class Program4
{
   public static void main(String[] args) {
    //Scanner sc1 = new Scanner(System.in);
    //System.out.println("Enter Number :");
    //int iNo1 = sc1.nextInt();  
    char ch = 'A'; 
    Base bobj = new Base();
       bobj.fun(ch);
    
   }
}
class Base
{
    public static void fun(char ch)
    {
      //String reverse = "";
     // int i = 1;
      if(ch<='F')
      {
        System.out.println(ch);
        //ch++;
        fun(++ch);
      }
      
    }
    
}