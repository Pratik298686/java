/*1.Write a program which accept matrix from user and display transpose of the
matrix.
The transpose of a given matrix is formed by interchanging the rows and
columns of a matrix.
Input :
Output :
void Transpose(int Arr[][], int iRow, int iCol)
{
 //Logic
}
3 2 5 9
4 3 2 2
8 4 1 5
3 9 7 5

3 4 8 3
2 3 4 9
5 2 1 7
9 2 5 5*/
import java.lang.*;
import java.util.Scanner;
class Program1
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
        for(int j=0; j<icol; j++)
        {
     System.out.print(arr[j][i]);   
        }
        System.out.println(); 
    }
    //System.out.println("Display transpose number :");
    /*for(int i=0; i<irow; i++)
    {
        for(int j=0; j<icol; j++)
        {
            System.out.println(trans[]);
        }
        System.out.println(); 
    }*/
   }
}
