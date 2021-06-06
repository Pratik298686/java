/*3. Accept Character from user and check whether it is digit or not (0-9). 
Input :  7 
Output :  TRUE 
Input :  d 
Output :  FALSE*/
import java.lang.*;
import java.util.Scanner;
class Program3
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
      System.out.println("Enter character :");
      int n1 = sc1.nextInt();
      //char ch1 = 'A',ch2 = 'a';
      boolean b1 = true;
      boolean b2 = false;

      if((n1>=0 && n1<=9))
      {
        System.out.println(b1);  
      }
      else
      {
        System.out.println(b2);
      }
      
    }
}