/*5. Accept number of rows and number of columns from user and display below pattern. 
Input :  iRow = 3  iCol =  4  
Output : 1 1 1 1    2 2 2 2   3 3 3 3   4 4 4 4*/
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
      System.out.println("Row number :");
      int iRow = sc1.nextInt();
      Scanner sc2 = new Scanner(System.in);
      System.out.println("Column number :");
      int iCol = sc2.nextInt();

      int isum1 = 2,isum2 =1;
      for(int i=1; i<=iRow; i++)
      {
       for(int j=1; j<=iCol; j++)
       {
          if(i==1)
          {
            System.out.print(i);
          }
          else if(i==2)
          {
            System.out.print(i);
          }
          else if(i==3)
          {
            System.out.print(i);
          }
          else if(i==4)
          {
            System.out.print(i);
          }
       }
       System.out.print("\n");
      }

    }
}