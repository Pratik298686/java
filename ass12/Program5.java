/*Write a program which returns difference between Even factorial and odd factorial of given number.  
Input :  5  Output :  -7   (8 - 15) 
Input :  -5  Output :  -7   (8 - 15) 
Input :  10  Output :  2895  (3840 - 945) */
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
      System.out.println("first number :");
      int iNo1 = sc1.nextInt();

      int isum1 = 1,isum2 =1;
      for(int i=1; i<=iNo1; i++)
      {
      
        if(i%2==0)
        {
         isum1 = isum1*i;  
        }
        else if(i%2!=0)
        {
         isum2 = isum2*i;  
        }
      }
      System.out.println(+(isum1-isum2)); 

    }
}