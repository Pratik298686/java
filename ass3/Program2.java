/*2. Write a program which accept number from user and print even factors of that number.  
Input :  24 
Output:  1 2 4 6 8 12 */
import java.lang.*;
import java.util.*;
class Program2
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
     int n;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of elemnet you want to store");
    n=sc.nextInt();
    for(int i=1; i<=n; i++)
    {
          if(n%i==0)
          {
              if(i%2==0)
              {
                System.out.println(i);
              }
          }
    }
    }
}
