/*1. Write Java program which accept two arrays from user and display
contents of each array.
Input : 2 9 7 5 2 3
 9 3 5 5
Output : 2 9 7 5 2 3
 9 3 5 5 */
 import java.lang.*;
 import java.util.Scanner;
 class Program1{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int arr1[] = new int[10];
         //int arr2[] = new int[];
         
         System.out.println("input array");
         for(int i=0; i<arr1.length; i++)
         {
             arr1[i]=sc.nextInt();
         }
         System.out.println("Display array");
         for(int i=0; i<arr1.length; i++)
         {
             System.out.println(arr1[i]);
         }

     }
 }