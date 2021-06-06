/*4. Write a program which accept matrix and display addition of elements From each
column.
Input :
3 2 5 9
4 3 2 2
8 4 1 9
3 9 7 5
Output : 18 18 15 25 */
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
    int iMax = 0; 
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
    System.out.println("addition of diagonal element :");
    
    for(int i=0; i<irow; i++)
    {
        for(int j=0; j<icol; j++)
        {
            if(i==j || i+j==5)
            {
                if(arr[i][j]>iMax)
                {
                    iMax = arr[i][j];
                }
            }
        }
        System.out.println(); 
    }
    System.out.print(iMax);
   }
}