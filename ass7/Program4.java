/*4.Write a program which accept number from user and return multiplication of all digits. 
Input :  2395  Output :  270 
Input :  1018 Output :  8 
Input :  9440 Output :  144 
Input :  922432 Output :  864  */
import java.lang.*;
import java.util.Scanner;
class Program4
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
      int isum1 = 1;
      
      if(iNo1<0)
      {
          iNo1=iNo1;
      }

      while(iNo1!=0)
      {
        int iDigit = iNo1%10;
        isum1 = isum1*iDigit;
        iNo1 = iNo1/10;
        
      }
      System.out.println("frquency :"+isum1);
    }
}