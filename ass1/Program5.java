/*
 Accept one number from user and print that number of * on screen
*/
import java.lang.*;
import java.util.Scanner;
class Program5
{
    public static void main(String[] args) {
        int iNo;
        Scanner in = new Scanner(System.in);
        
         System.out.println("enter the number :");
         iNo = in.nextInt();   
        
        for(int i=0; i<=iNo;i++)
        {
            System.out.println("*");
        }
    }
}