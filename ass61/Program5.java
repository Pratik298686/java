/*5. Write a program which accept matrix and swap the contents of consecutive rows.
Input : 
3 2 5 9
4 3 2 2
8 4 1 9
3 9 7 5

4 3 2 2
3 2 5 9
3 9 7 5
8 4 1 9*/
import java.lang.*;
import java.util.Scanner;
class Program5
{
   public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter row number :");
    int irow = sc1.nextInt(); 
    System.out.println("Enter column number :");
    int icol= sc1.nextInt();
    int arr[][] = new int[irow][icol]; 
    int temp = 0; 
    boolean b1 = true;
    boolean b2 = false;
    
    System.out.println("Enter input :");
    for(int i=0; i<irow; i++)
    {
        for(int j=0; j<icol; j++)
        {
            arr[i][j] = sc1.nextInt();   
        }
    }
    System.out.println("display number :");
    
    for(int i=0; i<irow; i++)
    {
        for(int j=0; j<icol; j++)
        {
            System.out.print(arr[i][j]);
        }
        System.out.println(); 
    }
    System.out.println("Enter the row number :");
    int x = sc1.nextInt();
    int y = sc1.nextInt();
    for(int i=0; i<irow; i++)
    {
        temp = arr[x-1][i];
        arr[x-1][i] = arr[y-1][i];
        arr[y-1][i] = temp;
    }
    System.out.println("Matrix after interchanging row :");
    for(int i=0; i<irow; i++)
    {
        for(int j=0; j<icol; j++)
        {
            System.out.print(arr[i][j]);   
        }
        System.out.println(); 
    }
   
   }
}