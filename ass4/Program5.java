/*5.Write a program which accept number from user and return difference between summation of all its factors and non factors
Input :  12 Output : -34  (16 - 50)  
Input :  10  Output : -29 (8 - 37)
*/
import java.lang.*;
import java.util.Scanner;
class Program5
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
    int isum1 = 0,isum2=0;

    for(int i=1; i<n; i++)
    {
        if(n%i!=0)
        {
          isum1 = isum1 + i;
        }
        else if(n%i==0)
        {
          isum2 = isum2 + i;
        }
    }
    System.out.println("non factor and factor:" +(isum1-isum2));
    }
}