/*4. Write a program which accept matrix and check whether the matrix is
identity matrix or not.
Identity matrix is a square matrix with 1’s along the diagonal from upper left to
lower right and 0’s in all other positions.
If it satisfies the structure as explained before then the matrix is called as
identity matrix.
Input :
1 0 0 0
0 1 0 0
0 0 1 0
0 0 0 1
Output : True*/
import java.lang.*;
import java.util.Scanner;
class Program4
{
   public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter row number :");
    int irow = sc1.nextInt(); 
    System.out.println("Enter column number :");
    int icol= sc1.nextInt();
    int arr[][] = new int[irow][icol]; 
    //int arr2[][] = new int[irow][icol]; 
    boolean flag = true;
    
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
    if(irow!=icol)
    {
        System.out.println("Matrix should be a square Matrix");
    }
    else{
        for(int i=0; i<irow; i++)
    {
        for(int j=icol-1; j>=0; j--)
        {
          if(i==j && arr[i][j]!=1)
          {
              flag = false;
              break;
          }
          if(i!=j && arr[i][j]!=0)
          {
              flag = false;
          }
        }
        //System.out.println(); 
    }
      if(flag)
      {
        System.out.println("identity Matrix");
       }
       else
       {
           System.out.println("their is no identity matrix");
       }
   }
   }
}