/*4.Write a program which accept number from user and return summation of all its non factors. 
Input :  12 Output : 50  
Input :  10  Output : 37 */
import java.lang.*;
import java.util.Scanner;
class Program4
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
    int sum = 0;

    for(int i=1; i<n; i++)
    {
        if(n%i!=0)
        {
          sum = sum + i;
        }
    }
    System.out.println("non factor:" +sum);
    }
}