/*4. Write a recursive program which accept number from user and return
smallest digit
Input : 87983
Output : 3 */
import java.lang.*;
import java.util.Scanner;
class Program4
{
   public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter Number :");
    int iNo1 = sc1.nextInt();   
    //int isum = 0;
    Base bobj = new Base();
    int iret = bobj.fun(iNo1);
    System.out.println(iret);
   }
}
class Base
{
   // static int iMin = iNo1%10;
    public static int fun(int iNo1)
    {
    int iMin = iNo1%10;
        if(iNo1!=0)
     {
        int iDigit = iNo1%10; 
        if(iDigit<iMin)
        {
            iMin = iDigit;
        }
        fun(iNo1/10);
        //iNo1--;
     }
     return iMin;
  }
    
}