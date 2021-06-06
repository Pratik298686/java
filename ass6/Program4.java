/*4.Write a program which accept number from user and count frequency of 4 in it. 
Input :  2395  Output :  0 
Input :  1018 Output :  0 
Input :  9440 Output :  2 
Input :  922432 Output :  1 */
import java.lang.*;
import java.util.Scanner;
class Program4
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
      Scanner sc1 = new Scanner(System.in);
      System.out.println("obtained marks :");
      int iNo1 = sc1.nextInt();
      int i = 0;
      
      boolean b1 = true;
      boolean b2 = false;

      while(iNo1!=0)
      {
        int iDigit = iNo1%10;
        if(iDigit==4)
        {
            i++;  
        }
        iNo1 = iNo1/10;
        
      }
      System.out.println("frquency :"+i);
    }
}