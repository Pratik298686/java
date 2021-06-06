/*4. Accept number of rows and number of columns from user and display below pattern. 
Input :  iRow = 5  iCol = 5  
Output :  1  2  3  4  5   -1 -2 -3 -4 -5    1  2  3  4  5   -1 -2 -3 -4 -5    1  2  3  4  5*/
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

      int isum1 = 1,isum2 =1;
      char ch = 'a';
      for(int i=1; i<=iRow; i++)
      {
       for(int j=1; j<=iCol; j++)
       {
          if(i%2!=0)
          {
            System.out.print(j);   
          }
          else if(i%2==0)
          {
            System.out.print(-j);   
          }
          ch++;
       }
       System.out.print("\n");
       ch = 'a';

      }

    }
}