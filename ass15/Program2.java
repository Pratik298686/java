/*2. Accept number of rows and number of columns from user and display below pattern. 
Input :  iRow = 4  iCol = 4  
Output : A B C D   a b c d   A B C D    a b c d */
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
     
     char ch1 = 'A',ch2 = 'a';
      /* Scanner sc3 = new Scanner(System.in);
      System.out.println("Enter string :");
      String s = sc3.nextLine();
      sc3.close();

      char ch[] = s.toCharArray();*/

      //int isum1 = 2,isum2 =1;
      for(int i=0; i<iRow; i++)
      {
       for(int j=0; j<iCol; j++)
       {
        if(i%2==0)
        {
        System.out.print(ch1);
        ch1++;
        }else if(i%2!=0)
        {
            System.out.print(ch2);
            ch2++;  
        }
       }
       System.out.print("\n");
       ch1 = 'A';
       ch2 = 'a';
      }

    }
}