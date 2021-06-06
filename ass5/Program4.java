/* 4. Write a program which accept three numbers and print its multiplication.  
  Input :  5   4   7    Output :  140  
  Input :  5   0   7    Output :  35  
  Input :  5   0   0    Output :  5  
  Input :  0   0   0    Output :  0  */
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
      System.out.println("Enter the first number :");
      int iNo1 = sc1.nextInt();
      Scanner sc2 = new Scanner(System.in);
      System.out.println("Enter the second number :");
      int iNo2 = sc2.nextInt();
      Scanner sc3 = new Scanner(System.in);
      System.out.println("Enter the third number :");
      int iNo3 = sc3.nextInt();
      
      System.out.println("Multiplicaction :"+(iNo1*iNo2*iNo3));
      
    }
}