/*2. Accept number from user and display below pattern. 
Input :  5  
Output : 5 # 4 # 3 # 2 # 1 #*/
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
      System.out.println("first number :");
      int iNo1 = sc1.nextInt();

      int isum1 = 1,isum2 =1;
      for(int i=iNo1; i>=1; i--)
      {
        System.out.println("#"+i);
      }

    }
}