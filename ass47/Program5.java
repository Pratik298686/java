/*5. Write a recursive program which accept number from user and return its
reverse number.
Input : 523
Output : 325 */
import java.lang.*;
import java.util.Scanner;
class Program5
{
   public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter Number :");
    int iNo1 = sc1.nextInt();   
    //int isum = 0;
    Base bobj = new Base();
    bobj.fun(iNo1);
   }
}
class Base
{
   // static int iMin = iNo1%10;
    public static void fun(int iNo1)
    {
    int iMin = iNo1%10;
        if(iNo1!=0)
     {
        int iDigit = iNo1%10; 
        System.out.print(iDigit);
        fun(iNo1/10);
        //iNo1--;
     }
     //return iNo1;
  }
    
}