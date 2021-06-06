/* 4. Accept N numbers from user and return frequency of 11 form it. 
Input :  N :   6 
  Elements : 85 66 3 15 93 88  
Output : 0 
Input :  N :   6 
  Elements : 85 11 3 15 11 111  
Output : 2 */
import java.lang.*;
import java.util.Scanner;
class Program4
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

      int arr[] = new int[6];
      int isum1 = 0,isum2 = 0;
      System.out.println("Enter the number  in array:");
      for(int i=0; i<n; i++)
      {
          arr[i] = sc1.nextInt();
      }
      System.out.println("Array Elements are:");
      for(int i=0; i<arr.length; i++)
      {
        if(arr[i]==11)
        {
            isum1++;
        }
        
      }
      System.out.println(isum1); 
      

    }
}