/* 3. Accept N numbers from user and display all such elements which are even and divisible by 5. 
Input :  N :   6 
  Elements : 85 66 3 80 93 88  
Output : 80 */
import java.lang.*;
import java.util.Scanner;
class Program3
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
      int n = sc1.nextInt();

      int arr[] = new int[10];
      System.out.println("Enter the number  in array:");
      for(int i=0; i<n; i++)
      {
          arr[i] = sc1.nextInt();
      }
      System.out.println("Array Elements are:");
      for(int i=0; i<arr.length; i++)
      {
        if(arr[i]%2==0)
        {
        if(arr[i]%5==0)
        {
            System.out.println(arr[i]); 
        }
       }
      }
      

    }
}