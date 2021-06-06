/*4. Write a recursive program which accept number from user and return its
factorial.
Input : 5

Output : 120  */
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
    public static int fun(int iNo1)
    {
     if(iNo1>1)
     {
         return (iNo1*fun(iNo1-1));
     }
     return 1;
  }
    
}