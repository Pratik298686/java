/*1. Write a java program which accept number of rows and number of
columns from user and display below pattern.
Input : iRow = 4 iCol = 4
Output : * * * #
 * * # *
 * # * *
 # * * *
 */
 import java.lang.*;
import java.util.Scanner;
class Program1
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
    for(int i=0; i<4; i++)
    {
        for(int j=0; j<4; j++)
        {
            if(i+j==3)
            {
                System.out.print("#");
               // isize++;
            }
            else 
            {
                System.out.print("*");
            }
            //++ch;
        }
        System.out.println("");
    //isize = ch.length;
    }
   
   }
}