/*

*/
import java.lang.*;
import java.util.Scanner;
 
class Demo
{
    
    public Demo(int num)
    {
        if(num%5==0)
        {
            System.out.println("it is a divisible : ");
        }
        else
        {
            System.out.println("it is not a divisible : ");
        }
    }
}
class Program4
{
    public static void main(String[] args) {
        
        int i;
        System.out.println("your no :");
        Scanner name = new Scanner(System.in);
        i = name.nextInt();
        
        Demo obj = new Demo(i);
        int ret = obj.Demo(i);

        
    }
}