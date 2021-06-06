/*Accept one number from user and print that number of * on screen*/
import java.lang.*;
import java.util.Scanner;
class Program2
{
    public static void main(String[] args) {
        int iNo;
        Scanner in = new Scanner(System.in);
        
         System.out.println("enter the number :");
         iNo = in.nextInt();   
        int i = iNo;
        while(i>=0)
        {
            System.out.println(i);
            i--;
        }
    }
}

