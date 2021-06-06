/*2. Write a program which accept matrix and reverse the contents of each row.
Input : 
3 2 5 9
4 3 2 2
8 4 1 9
3 9 7 5

9 5 2 3
2 2 3 4
9 1 4 8
5 7 9 3*/
import java.lang.*;
import java.util.Scanner;
class Program2
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
    for(int i=0; i<irow; i++)
    {
        for(int j=icol-1; j>=0; j--)
        {
     System.out.print(arr[i][j]);   
        }
        System.out.println(); 
    }
   }
}