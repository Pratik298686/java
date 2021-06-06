/*
1.Write a program which accept number from user and display its digits in reverse order. 
Input :  2395  Output :  5   9   3   2 
Input :  1018 Output :  8   1   0   1 
Input :  -1018 Output :  8   1   0   1 
Input :  9000 Output :  0   0   0   9
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
      System.out.println("obtained marks :");
      int iNo1 = sc1.nextInt();
      int i= 1;
      
      while(iNo1!=0)
      {
        int iDigit = iNo1%10;
        System.out.println(iDigit);
        iNo1 = iNo1/10;
        
      }
    }
}