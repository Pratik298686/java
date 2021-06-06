/*
Accept two numbers from user and display first number in second number of times
*/
import java.lang.*;
import java.util.Scanner;
class Program4
{
    public static void main(String[] args) {
        int iNo1,iNo2;
        Scanner in1 = new Scanner(System.in);
        
         System.out.println("enter the number :");
         iNo1 = in1.nextInt();
         
         Scanner in2 = new Scanner(System.in);
        
         System.out.println("enter the frquency :");
         iNo2 = in2.nextInt();
        
        for(int i=0; i<iNo2;i++)
        {
            System.out.println(iNo1);
        }
    }
}
