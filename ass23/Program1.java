/*1. Accept N numbers from user and accept one another number as NO , check whether NO is present or not. 
Input :  N :   6 
  NO:  66 
  Elements : 85 66 3 66 93 88  
Output : TRUE 
Input :  N :   6 
  NO:  12 
  Elements : 85 11 3 15 11 111  
Output : FALSE*/
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
      Scanner sc2 = new Scanner(System.in);
      System.out.println("Enter another number :");
      int n2 = sc2.nextInt();

      boolean b1 = true;
      boolean b2 = false;
      int arr[] = new int[7];
      int isum1 = 0,isum2 = 0;
      System.out.println("Enter the number  in array:");
      for(int i=0; i<n1; i++)
      {
          arr[i] = sc1.nextInt();
      }
      System.out.println("Array Elements are:");
      for(int i=0; i<arr.length; i++)
      {
        if(arr[i]==n2)
        {
            System.out.println(b1); 
            break;  
        }
        else 
        {
            System.out.println(b2);  
        }
        
      }

      

    }
}