/*3. Accept number of rows and number of columns from user and display below pattern. 
Input :  iRow = 3  iCol = 5  
Output : A A A A A   B B B B B   C C C C C*/
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
     
     char ch1 = 'A';
      /* Scanner sc3 = new Scanner(System.in);
      System.out.println("Enter string :");
      String s = sc3.nextLine();
      sc3.close();

      char ch[] = s.toCharArray();*/

      //int isum1 = 2,isum2 =1;
      for(int i=1; i<=iRow; i++)
      {
       for(int j=1; j<=iCol; j++)
       {
        if(i==1)
          {
            System.out.print(ch1);
          }
          else if(i==2)
          {
            System.out.print(ch1);
          }
          else if(i==3)
          {
            System.out.print(ch1);
          }
          else if(i==4)
          {
            System.out.print(ch1);
          }
       }
       System.out.print("\n");
       ch1++;
       //ch2 = 'a';
      }

    }
}