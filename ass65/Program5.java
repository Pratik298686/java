/*5. Write a java program which accept number of rows and number of
columns from user and display below pattern.
Input : iRow = 4 iCol = 4
Output :  
 1 2 3 4 5
 1 2     5
 1   3   5
 1     4 5 
 1 2 3 4 5 */
 import java.lang.*;
import java.util.Scanner;
class Program5
{
   public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    /*System.out.println("Enter row number :");
    int irow = sc1.nextInt(); 
    System.out.println("Enter column number :");
    int icol= sc1.nextInt();*/
    
   /* System.out.println("Enter string :");
    String str = sc1.nextLine();
    char ch[]  = str.toCharArray();*/
    //int isize = ch.length;
    
    System.out.println("Enter input :");
    for(int i=0; i<6; i++)
    {
        for(int j=0; j<6; j++)
        {
            if(i==j)
            {
                System.out.print(j);
               // isize++;
            }
            else if(i==0 || i==5 || j==0 || j==5) 
            {
                System.out.print(j);
            }
            else 
            {
                System.out.print(" ");
            }
            //++ch;
        }
        System.out.println("");
    //isize = ch.length;
    }
   
   }
}