/*
Program to print 5 to 1 numbers on screen.
*/
import java.lang.*;
import java.util.Scanner;
class Program3
{
    public static void main(String[] args) {
        int i;
        System.out.println("your no :");
        Scanner name = new Scanner(System.in);
        int a = name.nextInt();
        
        for(i=a;i>=0;i--)
        {
            System.out.println("number"+i);
        }
        
    }
}
