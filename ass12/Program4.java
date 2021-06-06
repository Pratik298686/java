/*4. Write a program to find odd factorial of given number.  
Input :  5  Output :  15   (5 * 3 * 1) 
Input :  -5  Output :  15   (5 * 3 * 1) 
Input :  10  Output :  945  (9 * 7 * 5 * 3 * 1) */
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
      System.out.println("first number :");
      int iNo1 = sc1.nextInt();

      int isum1 = 1;
      for(int i=1; i<=iNo1; i++)
      {
      
        if(i%2!=0)
        {
         isum1 = isum1*i;  
        }
      }
      System.out.println(isum1); 

    }
}