/*1.Write a java program which accept matrix from user and swap the
contents of each consecutive rows. */
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
    
    System.out.println("Matrix after interchanging each element of row :");
    for(int i=0; i<irow; i++)
    {
        for(int j=0; j<icol; j++)
        {
            temp = arr[i][j];
            arr[i][j] = arr[i][j+1];
            arr[i][j+1] = temp;   
            System.out.print(temp);
        }
        System.out.println(); 
    }
   
   }
}