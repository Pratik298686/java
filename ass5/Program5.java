/* 5. Write a program which accept total marks & obtained marks from user and calculate percentage.  
 
Input :  1000  745    Output :  74.5%  
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
class Base
{
    public void fun()
    {
      Scanner sc1 = new Scanner(System.in);
      System.out.println("obtained marks :");
      float iNo1 = sc1.nextInt();
      Scanner sc2 = new Scanner(System.in);
      System.out.println("total marks :");
      float iNo2 = sc2.nextInt();
      
      System.out.println("Multiplicaction :"+(iNo1/iNo2)*100);
      
    }
}