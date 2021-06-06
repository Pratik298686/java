/*2.Write a program which accept number from user and display its factors in decreasing order. 
Input :  12 Output : 6 4 3 2 1 */
import java.lang.*;
import java.util.Scanner;
class Program2
{
     public static void main(String[] args) {
         Base bobj = new Base();
         bobj.fun();
     }
}
class Base{
    public void fun()
    {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int isum = 1;

    for(int i=n-1; i>=1; i--)
    {
        if(n%i==0)
        {
            System.out.println("decreasing order:"+i);
        }
    }
    }
}
