/*2. Accept number of rows and number of columns from user and display below pattern. 
Input :  iRow = 4  iCol = 4  
Output : 2 4 6 8 10   1 3 5 7 9   2 4 6 8 10   1 3 5 7 9*/
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
      System.out.println("Row number :");
      int iRow = sc1.nextInt();
      Scanner sc2 = new Scanner(System.in);
      System.out.println("Column number :");
      int iCol = sc2.nextInt();

      int isum1 = 1,isum2 =1;
      for(int i=1; i<=iRow; i++)
      {
       for(int j=1; j<=iCol; j++)
       {
       
        if((isum1%2==0)&&(i==1 || i==3))
           {
            System.out.print(isum1);   
           }
           else if((isum1%2!=0)&&(i==2 || i==4))
           {
            System.out.print(isum1);   
           }
           isum1++;
       
       }
       System.out.print("\n");
       isum1 = 1;

      }

    }
}