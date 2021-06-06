/*5. Accept N numbers from user and display summation of digits of each number. 
Input :  N :   6 
  Elements : 8225  665 3 76 953 858  
Output : 17 17 3 13 17 21
 */
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

      int arr[] = new int[6];
      int isum1 = 0;
      System.out.println("Enter the number  in array:");
      for(int i=0; i<n1; i++)
      {
          arr[i] = sc1.nextInt();
      }
      System.out.println("Array Elements are:");
      for(int i=0; i<arr.length; i++)
      {
        while(arr[i]!=0)
        {
            int iDigit = arr[i]%10;
            isum1 = isum1+iDigit;
            arr[i] = arr[i]/10;
        }
        System.out.println(isum1);
        isum1 = 0;
      }
    }
}