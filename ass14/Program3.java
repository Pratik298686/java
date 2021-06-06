/*3. Accept number of rows and number of columns from user and display below pattern. 
Input :  iRow = 3  iCol = 5  
Output : 5 4 3 2 1   5 4 3 2 1   5 4 3 2 1*/
import java.lang.*;
import java.util.Scanner;
class Program3
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
       for(int j=iCol; j>=1; j--)
       {
           System.out.print(j);
       }
       System.out.print("\n");
      }

    }
}