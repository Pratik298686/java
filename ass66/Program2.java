/*2. Write Java program which accept two arrays from user and display
even contents of each array.
Input : 2 9 6 5 2 3
 45 6 12 18 23 4
Output : 2 6 2
 6 12 18 4 */
 import java.lang.*;
 import java.util.Scanner;
 class Program2{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("content of array number");
         int x = sc.nextInt();
         int arr1[] = new int[x];
         //int arr2[] = new int[];
         
         System.out.println("input array");
         for(int i=0; i<arr1.length; i++)
         {
             arr1[i]=sc.nextInt();
         }
         System.out.println("Display array");
         for(int i=0; i<arr1.length; i++)
         {
            if(arr1[i]%2==0)
            { 
            System.out.println(arr1[i]);
            }
         }

     }
 }