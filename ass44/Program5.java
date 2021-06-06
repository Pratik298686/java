/*
5.Write a recursive program which display below pattern.  
Output :   a b c d e f 
*/
import java.lang.*;
import java.util.Scanner;
class Program5
{
   public static void main(String[] args) {
    //Scanner sc1 = new Scanner(System.in);
    //System.out.println("Enter Number :");
    //int iNo1 = sc1.nextInt();  
    char ch = 'a'; 
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
      if(ch<='f')
      {
        System.out.println(ch);
        //ch++;
        fun(++ch);
      }
      
    }
    
}