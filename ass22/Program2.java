/*2. Accept N numbers from user and return difference between frequency of even number and odd numbers. 
Input :  N :   7 
  Elements : 85 66 3 80 93 88 90 
Output : 1 (4 -3)*/
import java.lang.*;
import java.util.Scanner;
class Program2
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

      int arr[] = new int[7];
      int isum1 = 0,isum2 = 0;
      System.out.println("Enter the number  in array:");
      for(int i=0; i<n; i++)
      {
          arr[i] = sc1.nextInt();
      }
      System.out.println("Array Elements are:");
      for(int i=0; i<arr.length; i++)
      {
        if(arr[i]%2==0){
            isum1++;
        }
        else if(arr[i]%2!=0){
            isum2++;
        }
      }
      System.out.println(isum1); 
      System.out.println(isum2);

    }
}