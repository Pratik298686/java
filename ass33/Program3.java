/*3. Write a program which accept one number from user and toggle 7th bit of that number. Return modified number. 
Input :  137 Output : 201*/
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
      System.out.println("Enter number :");
     int n1 = sc1.nextInt();

     int iMask = 0x00000040;
     int iResult = 0;
     if(n1<0)
     {
         n1 = -n1;
     }
    // iMask = iMask<<(n2-1);
     iResult = n1 ^ iMask;
     System.out.println(iResult);

    }
}