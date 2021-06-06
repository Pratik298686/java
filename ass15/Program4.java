/*
4. Accept number of rows and number of columns from user and display below pattern. 
Input :  iRow = 4  iCol = 5  
Output : 4 4 4 4 4   3 3 3 3 3   2 2 2 2 2   1 1 1 1 1*/
import java.lang.*;
import java.util.Scanner;
class Program4
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
      for(int i=iRow; i>=1; i--)
      {
       for(int j=1; j<=iCol; j++)
       {
        System.out.print(i);
       }
       System.out.print("\n");
      }

    }
}