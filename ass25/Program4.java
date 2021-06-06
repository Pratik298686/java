/*4. Accept Character from user and check whether it is small case or not (a-z). 
Input :  g 
Output :  TRUE 
Input :  D 
Output :  FALSE */
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
      System.out.println("Enter character :");
      char n1 = sc1.next().charAt(0);
      char ch1 = 'A',ch2 = 'a';
      boolean b1 = true;
      boolean b2 = false;

      if((n1>=97 && n1<=122))
      {
        System.out.println(b1);  
      }
      else
      {
        System.out.println(b2);
      }
      
    }
}