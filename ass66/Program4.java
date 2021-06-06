/*4. Write Java program which accept two arrays from user and form
new array which is combination of contents of first and second array.
Input : 12 57 28 3
 99 23 54 58 6 67
Output : 12 57 28 3 99 23 54 58 6 67*/
import java.lang.*;
 import java.util.Scanner;
 class Program4{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("content of array number");
         int x = sc.nextInt();
         int y = sc.nextInt();
         int arr1[] = new int[x];
         int arr2[] = new int[y];
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
         
         int isize = arr1.length + arr2.length;
         int arr3[] = new int[isize];
         System.out.println("combination");
         for(int i=0; i<isize; i++)
         {
            System.out.println(arr3[i]); 
         }

     }
 }