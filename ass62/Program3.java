/*3. Write a program which accept matrix and reverse the contents of each
column.
Input : 
3 2 5 9
4 3 2 2
8 4 1 9
3 9 7 5

3 9 7 5
8 4 1 9
4 3 2 2
3 2 5 9*/
import java.lang.*;
import java.util.Scanner;
class Program3
{
   public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter row number :");
    int irow = sc1.nextInt(); 
    System.out.println("Enter column number :");
    int icol= sc1.nextInt();
    int arr[][] = new int[irow][icol];   
    System.out.println("Enter input :");
    for(int i=0; i<irow; i++)
    {
        for(int j=0; j<icol; j++)
        {
            arr[i][j] = sc1.nextInt();   
        }
    }
    System.out.println("Display number :");
    for(int i=0; i<irow; i++)
    {
        for(int j=0; j<icol; j++)
        {
            System.out.print(arr[i][j]);   
        }
        System.out.println(); 
    }
    System.out.println("Enter transpose number :");
    for(int i=irow-1; i>=0; i--)
    {
        for(int j=0; j<icol; j++)
        {
     System.out.print(arr[i][j]);   
        }
        System.out.println(); 
    }
   }
}