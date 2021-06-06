/*5. Accept number from user and display below pattern. 
Input :  8 
Output : 2 4 6 8 10 12 14 16*/
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

      int isum1 = 2,isum2 =1;
      for(int i=1; i<=iNo1; i++)
      {
       isum1 = isum1*i;
       System.out.println(isum1);
       isum1 = 2;
      }

    }
}
