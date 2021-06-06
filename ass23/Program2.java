/*2. Accept N numbers from user and accept one another number as NO , return index of first occurrence of that NO. 
Input :  N :   6 
  NO:  66 
  Elements : 85 66 3 66 93 88  
Output : 1 
Input :  N :   6 
  NO:  12 
  Elements : 85 11 3 15 11 111  
Output : -1*/
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
      int n1 = sc1.nextInt();
      Scanner sc2 = new Scanner(System.in);
      System.out.println("Enter another number :");
      int n2 = sc2.nextInt();

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
            System.out.println(1); 
            break;  
        }else{
            System.out.println(-1); 
        }
        
      }
    }
}