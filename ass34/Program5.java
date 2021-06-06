/*5. Write a program which accept one number from user and toggle contents of first and last nibble of the number. Return modified number. (Nibble is a group of four bits) 
*/
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
      System.out.println("Enter number :");
     int n1 = sc1.nextInt();

     int iMask = 0x00000801;
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