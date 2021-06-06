/**/
import java.lang.*;
import java.util.Scanner;
class Program1
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
      String reverse = "";
      Scanner sc1 = new Scanner(System.in);
      System.out.println("Enter first character :");
      String str1 = sc1.nextLine();
      char ch1[] = str1.toCharArray();    
      
      int isize1 = ch1.length;
      int count = 0,i=0;
      //char ch3[] = new char[isize1]; 
      while(i<isize1)
      {
          if(ch1[i] == ' ')
          {
            count++;
          }
          i++;
      }
      System.out.println(count+1);
      
    }
    
}