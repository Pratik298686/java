/*5. Write a recursive program which accept number from user and return its
product of digits.
Input : 523
Output : 30 */
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
    int iret = bobj.fun(iNo1);
    System.out.println(iret);
   }
}
class Base
{
    public static int fun(int iNo1)
    {
     if(iNo1!=0)
     {
        int iDigit = iNo1%10; 
        return (iDigit*fun(iNo1/10));
     }
     return 1;
  }
    
}