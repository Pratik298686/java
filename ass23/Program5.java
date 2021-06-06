/*5. Accept N numbers from user and return product of all odd elements. 
Input :  N :   6     Elements : 15 66 3 70 10 88  
Output : 45 
Input :  N :   6     Elements : 44 66 72 70 10 88  
Output : 0 */
import java.lang.*;
import java.util.Scanner;
class Program5
{
   public static void main(String[] args) {
       Base bobj = new Base();
       bobj.fun();
    
   }
}
class Base
{
    public void fun()
    {
      Scanner sc1 = new Scanner(System.in);
      System.out.println("Enter number :");
      int n1 = sc1.nextInt();

      int arr[] = new int[7];
      int isum1 = 1,isum2 = 0;
      System.out.println("Enter the number  in array:");
      for(int i=0; i<n1; i++)
      {
          arr[i] = sc1.nextInt();
      }
      System.out.println("Array Elements are:");
      for(int i=0; i<arr.length; i++)
      {
        if(arr[i]%2!=0)
        {
            isum1 = isum1*arr[i];
        } 
      }
      System.out.println(isum1);
    }
}