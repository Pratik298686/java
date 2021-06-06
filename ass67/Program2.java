/*2. Write a java program which accept two two arrays from user and
display minimum element of each array.
Input : 2 9 7 5 2 3
 9 3 5 5
Output : 2 3 */
import java.lang.*;
 import java.util.Scanner;
 class Program2{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("content of array number");
         int x = sc.nextInt();
         int y = sc.nextInt();
         int arr1[] = new int[x];
         int arr2[] = new int[y];
         int iMin1 = arr1[0],iMin2 = arr2[0];
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
             if(arr1[i]<iMin1)
             {
                iMin1 = arr1[i];             
            }
         }
         System.out.println(iMin1);
         for(int i=0; i<arr2.length; i++)
         {
             if(arr2[i]<iMin2)
             {
                 iMin2 = arr2[i];
             }
         }
        
         System.out.println(iMin2);
     }
 }