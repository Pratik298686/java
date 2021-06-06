/*5. Write Java program which accept two arrays from user and display
summation of each array.
Input : 2 9 7 5 2 3
 9 3 5 5
Output : 28 22 */
import java.lang.*;
 import java.util.Scanner;
 class Program5{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("content of array number");
         int x = sc.nextInt();
         int y = sc.nextInt();
         int arr1[] = new int[x];
         int arr2[] = new int[y];
         int isum1 = 0,isum2 = 0;
         //int arr3[] = new int[x+y];
         System.out.println("first array");
         for(int i=0; i<arr1.length; i++)
         {
             arr1[i]=sc.nextInt();
         }
         System.out.println("second array");
         for(int i=0; i<arr2.length; i++)
         {
             arr2[i]=sc.nextInt();
         }
         for(int i=0; i<arr1.length; i++)
         {
             isum1 = isum1 + arr1[i];
         }
         
         for(int i=0; i<arr2.length; i++)
         {
             isum2 = isum2 + arr2[i];
         }
         System.out.println("first array"+isum1);
         System.out.println("second array"+isum2);

     }
 }