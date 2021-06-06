/* 5.Write a program which accept number from user and count frequency of such a digits which are less than 6. 
Input :  2395  Output :  3
Input :  1018 Output :  3 
Input :  9440 Output :  3 
Input :  96672 Output :  1*/
import java.lang.*;
import java.util.Scanner;
class Program5
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
      int i = 0;
      
      boolean b1 = true;
      boolean b2 = false;

      while(iNo1!=0)
      {
        int iDigit = iNo1%10;
        if(iDigit<=6)
        {
            i++;  
        }
        iNo1 = iNo1/10;
        
      }
      System.out.println("frquency :"+i);
    }
}