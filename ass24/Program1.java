/*1. Accept N numbers from user and return the largest number. 
Input :  N :   6 
  Elements : 85 66 3 66 93 88  
Output : 93*/
import java.lang.*;
import java.util.Scanner;
class Program1
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
      int iMax = arr[0],isum2 = 0;
      System.out.println("Enter the number  in array:");
      for(int i=0; i<n1; i++)
      {
          arr[i] = sc1.nextInt();
      }
      System.out.println("Array Elements are:");
      for(int i=0; i<arr.length; i++)
      {
        if(arr[i]>iMax)
        {
          iMax = arr[i];
        } 
      }
      System.out.println(iMax);
    }
}