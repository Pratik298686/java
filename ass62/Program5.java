/*5. /Write a program which accept matrix and check whether the matrix is
Sparse matrix or not.
Sparse matrix is a matrix with the majority of its elements equal to zero.*/
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
    int zero = 0; 
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
    System.out.println("Display number :");
    for(int i=0; i<irow; i++)
    {
        for(int j=0; j<icol; j++)
        {
           if(arr[i][j]==0)
           {
               zero++;
           }  
        }
        System.out.println(); 
    }
    System.out.println("Enter transpose number :");
    
      if(zero>(irow*icol)/2)
      {
        System.out.println(b1);
       }
       else
       {
           System.out.println(b2);
       }
   
   }
}