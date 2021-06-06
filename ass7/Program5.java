/*5.Write a program which accept number from user and return difference between summation of even digits and summation of odd digits. 
Input :  2395  Output :  -15 (2 - 17) 
Input :  1018 Output :  6 (8 - 2) 
Input :  8440 Output :  16  (16 - 0) 
Input :  5733 Output :  -18 (0 - 18) */
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
      int isum1 = 0,isum2 = 0;
      
      if(iNo1<0)
      {
          iNo1=iNo1;
      }

      while(iNo1!=0)
      {
        int iDigit = iNo1%10;
        if(iDigit%2==0)
        {
            isum1 = isum1+iDigit;  
        }
        else if(iDigit%2!=0)
        {
            isum2 = isum2+iDigit;  
        }
        iNo1 = iNo1/10;
        
      }
      System.out.println("frquency :"+(isum1-isum2));
    }
}