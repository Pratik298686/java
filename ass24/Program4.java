/*4. Accept N numbers from user and display all such numbers which contains  3 digits in it. 
Input :  N :   6
Elements : 8225  665 3 76 953 858  
Output : 665 953 858 */
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
      int n1 = sc1.nextInt();

      int arr[] = new int[7];
      int iMax = arr[0],iMin = arr[0];
      System.out.println("Enter the number  in array:");
      for(int i=0; i<n1; i++)
      {
          arr[i] = sc1.nextInt();
      }
      System.out.println("Array Elements are:");
      for(int i=0; i<arr.length; i++)
      {
        if(arr[i]>=100 && arr[i]<=999)
        {
            System.out.println(arr[i]);  
        }
      }
    }
}