/*1. Accept number of rows and number of columns from user and display below pattern. 
Input :  iRow = 4  iCol = 3  
Output : * * *   
         * * *   
         * * *   
         * * * *
*/
import java.lang.*;
import java.util.Scanner;
class Program1
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
      System.out.println("Row number :");
      int iRow = sc1.nextInt();
      Scanner sc2 = new Scanner(System.in);
      System.out.println("Column number :");
      int iCol = sc2.nextInt();

      int isum1 = 2,isum2 =1;
      for(int i=0; i<iRow; i++)
      {
       for(int j=0; j<iCol; j++)
       {
           System.out.print("*");
       }
       System.out.print("\n");
      }

    }
}
