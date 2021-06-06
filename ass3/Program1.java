import java.lang.*;
import java.util.*;
class Program1
{
    public static void main(String[] args) {
        Base bobj = new Base();
        
        bobj.fun();
      /* int arr[] = new int[7];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements are:");
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]);  
        }*/
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
        int arr[] = new int[7];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements are:");
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]);  
        }

    }
}