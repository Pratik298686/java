/*3. Accept number of rows and number of columns from user and display below pattern. 
Input :  iRow = 5  iCol = 5  
Output : $ * * * *   
         # $ * * *   
         # # $ * *   
         # # # $ *   
         # # # # $ 
*/
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

      int isum1 = 1,isum2 =1,j=1;
      char ch = 'a';
      for(int i=1; i<=iRow; i++)
      {
       for( j=1; j<=iCol; j++)
       {
        if(i<j)
        {
            System.out.print("*");
        }
        else if(i>j) 
        {
            System.out.print("#");
        }else
        {
            System.out.print("$"); 
        }
       }
       System.out.print("\n");

      }

    }
}