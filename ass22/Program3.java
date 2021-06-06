/*3. Accept N numbers from user check whether that numbers contains 11 in it or not. 
Input :  N :   6 
  Elements : 85 66 11 80 93 88  
Output : 11 is present 
Input :  N :   6 
  Elements : 85 66 3 80 93 88  
Output : 11 is absent*/
import java.lang.*;
import java.util.Scanner;

import javax.swing.plaf.TreeUI;
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

      int arr[] = new int[7];
      int isum1 = 0,isum2 = 0;

      boolean b1 = true;
      boolean b2 = false;
      System.out.println("Enter the number  in array:");
      for(int i=0; i<n; i++)
      {
          arr[i] = sc1.nextInt();
      }
      System.out.println("Array Elements are:");
      for(int i=0; i<arr.length; i++)
      {
        if(arr[i]%11==0)
        {
            System.out.println(b1); 
            break;  
        }  

      } 

    }
}