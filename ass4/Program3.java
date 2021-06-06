/*3.Write a program which accept number from user and display all its non factors. 
Input :  12 Output : 5 7 8 9 10 11 
Input : 13 Output : 2 3 4 5 6 7 8 9 10 11 12  
Input :  10  Output : 3 4 6 7 8 9 */
import java.lang.*;
import java.util.Scanner;
class Program3
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

    for(int i=1; i<n; i++)
    {
        if(n%i!=0)
        {
            System.out.println("non factor:"+i);
        }
    }
    }
}