/*5. Write a program which checks whether first and last bit is On or OFF. First bit means bit number 1 and last bit means bit number 32.*/
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
      System.out.println("Enter number :");
     int n1 = sc1.nextInt();

     boolean b1 = true;
     boolean b2 = false;


     int iMask = 0x80000001;
     int iResult = 0;
     if(n1<0)
     {
         n1 = -n1;
     }
     //iMask = iMask<<(n2-1);
     iResult = n1 & iMask;
     if(iResult==iMask)
     {
        System.out.println(b1);  
     }else{
        System.out.println(b2);
     }

    }
}