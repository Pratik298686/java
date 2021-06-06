/*
2.Write a program which accept number from user and return the count of odd digits. 
Input :  2395  Output :  3 
Input :  1018 Output :  2 
Input :  -1018 Output :  2 
Input :  8462 Output :  0 */
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
      int i = 0;
      
      if(iNo1<0)
      {
          iNo1=iNo1;
      }

      while(iNo1!=0)
      {
        int iDigit = iNo1%10;
        if(iDigit%2!=0)
        {
            i++;  
        }
        iNo1 = iNo1/10;
        
      }
      System.out.println("frquency :"+i);
    }
}