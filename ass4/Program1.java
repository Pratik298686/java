/*1.Write a program which accept number from user and display its multiplication of factors. 
Input :  12 Output : 144  (1 * 2 * 3 * 4 * 6) 
Input : 13 Output : 1  (1) 
Input :  10   Output : 10  (1 * 2 * 5)  */
import java.lang.*;
import java.util.Scanner;
class Program1
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
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int isum = 1;

    for(int i=1; i<n; i++)
    {
        if(n%i==0)
        {
        isum = isum*i;
        }
    }
    System.out.println("Multiplication factor is:"+isum);
    }
}