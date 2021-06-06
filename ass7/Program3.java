/*
3.Write a program which accept number from user and return the count of digits in between 3 and 7. 
Input :  2395  Output :  1 
Input :  1018 Output :  0 
Input :  4521 Output :  2 
Input :  9922 Output :  0  */
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
        if(iDigit==3 || iDigit==7)
        {
            i++;  
        }
        iNo1 = iNo1/10;
        
      }
      System.out.println("frquency :"+i);
    }
}