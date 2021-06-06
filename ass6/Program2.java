/*2.Write a program which accept number from user and check whether it contains 0 in it or not. 
Input :  2395  Output :  There is no Zero 
Input :  1018 Output :  It Contains Zero 
Input :  9000 Output :  It Contains Zero 
Input :  10687 Output :  It Contains Zero */
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
      System.out.println("obtained marks :");
      int iNo1 = sc1.nextInt();
      
      boolean b1 = true;
      boolean b2 = false;

      while(iNo1!=0)
      {
        int iDigit = iNo1%10;
        if(iDigit==0)
        {
            System.out.println(b1);
            break;  
        }
        iNo1 = iNo1/10;
        
      }
    }
}