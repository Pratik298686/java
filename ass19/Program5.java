/*5. Accept number of rows and number of columns from user and display below pattern.
Input :  iRow = 4  iCol =  4  
Output : 1 2 3 4 5   
         1 2     5   
         1   3   5   
         1     4 5   
         1 2 3 4 5
*/
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

      int isum1 = 1,isum2 =1,j=1;
      char ch = 'a';
      for(int i=1; i<=iRow; i++)
      {
       for( j=1; j<=iCol; j++)
       {
        if(i==1 || i==6 || j==1 || j==6 )
        {
            System.out.print(j);
        }
        else if(i==j)
        {
            System.out.print(j);
        }
        else
        {
            System.out.print(" "); 
        }
       }
       System.out.print("\n");
       

      }

    }
}