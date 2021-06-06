
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
      System.out.println("Enter character :");
      String str = sc1.nextLine();
      char ch1[] = str.toCharArray();
      
      int isum1 = 0;
      boolean b1 = true;
      boolean b2 = false;

      for(int i=ch1.length-1; i>=0; i--)
      {
        System.out.print(ch1[i]); 
      }

    }
}