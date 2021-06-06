/*4. Accept N numbers from user and accept Range, Display all elements from that range 
Input :  N :   6 
  Start: 60     End :  90     Elements : 85 66 3 76 93 88  
Output : 66 76 88 
Input :  N :   6 
  Start: 30     End :  50     Elements : 85 66 3 76 93 88*/
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
      Scanner sc2 = new Scanner(System.in);
      System.out.println("Start :");
      int n2 = sc2.nextInt();
      Scanner sc3 = new Scanner(System.in);
      System.out.println("End :");
      int n3 = sc3.nextInt();

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
        if(arr[i]>=60 && arr[i]<=90)
        {
            System.out.println(arr[i]); 
        } 
      }
    }
}